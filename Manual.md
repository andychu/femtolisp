# 0. Argument #
This Lisp has the following characteristics and goals:

  * Scheme-like, but only as far as avoiding spurious differences. No compliance with standards.
  * Non-opaque closures. All functions (and environments) are s-expressions. Performance is good despite this.
  * Super-sleek API
  * Common Lisp-style macros
  * Builtin functions are constants
  * _All_ values are printable and readable
  * Case-sensitive symbol names
  * Only the minimal core built-in (i.e. written in C), but enough to provide a practical level of performance
  * Concise (but not necessarily simple...) implementation
  * Nothing excessively weird or fancy


---


# 1. Syntax #
## 1.1. Symbols ##
Any character string can be a symbol name, including the empty string. In
general, text between whitespace is read as a symbol except in the following
cases:

  * The text begins with `#`
  * The text consists of a single period `.`
  * The text contains one of the special characters ()[.md](.md)';!`,\|
  * The text is a valid number
  * The text is empty

In these cases the symbol can be written by surrounding it with `| |`
characters, or by escaping individual characters within the symbol using
backslash `\`. Note that `|` and `\` must always be
preceded with a backslash when writing a symbol name.


## 1.2. Numbers ##

A number consists of an optional + or - sign followed by one of the following
sequences:

  * `NNN...` where N is a decimal digit
  * `N.NN[eE][+-]NN[f]` floating point (`f` means single precision)
  * `0xNNN...` where N is a hexadecimal digit
  * `0NNN...` where N is an octal digit
  * -0.0 and -0.0f, IEEE distinguished -0 values
  * Special IEEE values: `+Inf, -Inf, +NaN, -NaN, +nan.0, +inf.0, -nan.0, -inf.0`
  * C99-style hex float literals
  * `#b`, `#o`, `#d`, `#x` prefixes for binary, octal, decimal, and hex literals

Negative numbers may be written by prefixing any of the above with a `-` .


## 1.3. Special values ##

`#t` and `#f` are boolean literals (not case sensitive).

`()` is the empty list.


## 1.4. Conses and vectors ##

The text `(a b c)` parses to the structure
`(cons a (cons b (cons c nil)))` where a, b, and c are arbitrary
expressions.

The text `(a . b)` parses to the structure
`(cons a b)` where a and b are arbitrary expressions.

The text `[a b c]` parses to a vector of expressions a, b, and c.
The syntax `#(a b c)` has the same meaning.


## 1.5. Comments ##

Text between a semicolon `;` and the next end-of-line is skipped.

Text between `#|` and `|#` is also skipped.

Datum comment `#;` skips the next single s-expression.


## 1.6. Prefix tokens ##

There are five special prefix tokens which parse as follows:

`'a` is equivalent to `(quote a)`.

```a`` is equivalent to `(backquote a)`.

`,a` is equivalent to `(*comma* a)`.

`,@a` is equivalent to `(*comma-at* a)`.

`,.a` is equivalent to `(*comma-dot* a)`.


## 1.7. Other read macros ##

femtoLisp provides a few "read macros" that let you accomplish interesting
tricks for textually representing data structures.

| **sequence** | **meaning** |
|:-------------|:------------|
| `#.e`        | evaluate expression `e` and yield its value |
| `#\c`        | `c` is a character; read as its Unicode value |
| `#n=e`       | read `e` and label it as `n`, where n is a decimal number |
| `#n#`        | read as the identically-same value previously labeled `n` |
| `#:gNNN` or `#:NNN` | read a gensym. NNN is a decimal constant. future occurrences of the same `#:` sequence will read to the identically-same gensym |
| `#sym(...)`  | reads to the result of evaluating `(apply sym '(...))` |
| `#<`         | triggers an error |
| `#'`         | ignored; provided for compatibility |
| `#!`         | single-line comment, for script execution support |
| `"str"`      | UTF-8 character string; may contain newlines. `\` is the escape character. All C escape sequences are supported, plus `\u` and `\U` for unicode values. |

When a read macro involves persistent state (e.g. label assignments), that
state is valid only within the closest enclosing call to `read`.


## 1.8. Builtins ##

Builtin functions are represented as opaque constants. Every builtin
function is the value of some constant symbol, so the builtin `eq?`,
for example, can be written as `#.eq?` ("the value of symbol eq?").
Note that `eq?` itself is still an ordinary symbol, except that its
value cannot be changed.


---


# 2. Data and execution models #

All programs and data are built from a small set of basic data types: number, boolean, symbol, cons (pair), vector, and "other". The "other" category includes machine data
types (such as arrays of 32-bit integers) and implementation-defined types
(currently hash tables and IO streams).

femtoLisp provides essentially 3 operations: `read`, `print`, and `eval`.
`read` parses text into values (instances of the basic data types). `print`
performs the opposite conversion, emitting a text representation of a value.
`eval` treats a value as code and executes it.

As you might guess, `eval` is where all the action is.
`eval` looks at a value and applies several rules to interpret its meaning:

  * If the value is not a symbol or a cons, it evaluates to itself.
  * If the value is a symbol, return its value in the current environment if any, otherwise return its global value.
  * Otherwise we have an expression such as `(A B C D)`
    1. If `A` is a symbol, look in the syntax environment. If it is found there, pass the expression to the associated function and `eval` the result of that. Stop.
    1. Otherwise `eval` everything in the list.
    1. `A` must have evaluated to a function; otherwise stop with an error. Pass the values of `B`, `C`, and `D` to that function.

A function is either a builtin (an additional basic data type I neglected
to mention earlier!) or an expression of the form `(lambda arglist body)`.

Symbols are given values in the syntax environment using `set-syntax` or `defmacro`.
`set` is used to set the global value of a symbol.

Most of the language revolves around a fixed set of builtin functions
and syntax bindings. Builtin functions are bound to symbols whose global
values cannot be changed, and that cannot be used as variables. The
builtin functions are:

  * Predicates: `eq?, eqv?, equal?, atom?, not, null?, boolean?, bound?, symbol?, number?, pair?, builtin?, vector?, fixnum?`
  * Values: `cons, list, car, cdr, set-car!, set-cdr!, vector, aref, aset!, length, assq`
  * Execution: `eval, eval*, apply, prog1, raise, for`
  * Arithmetic: `+, -, *, /, <, lognot, logand, logior, logxor, compare`

Builtin syntax bindings cannot be changed and cannot be read directly.
The symbols involved are otherwise normal, i.e. you can use them as
variables (though this is strongly discouraged!). The builtin syntax
symbols are `quote, cond, if, and, or, while, lambda, trycatch, set!, begin`.


## 2.1. Startup ##

At startup, femtoLisp loads the file `system.lsp` using `load`, which
reads and evaluates every expression in the file.

If command-line arguments are present, the first argument must be a file
name. That file is loaded, then femtoLisp exits.

Otherwise, femtoLisp enters an interactive prompt. At the prompt, the value
of the last evaluated expression gets bound to `that`:

```
> 2
2

> (1+ that)
3
```


---


# 3. Exceptions #

The function `raise` signals an error by throwing a value to the
closest dynamically-enclosing exception handler.

Exceptions are handled by the form `(trycatch expr function)`. This
form evaluates its first argument (the expression) as usual, but if an
exception is raised during evaluation, the second argument is evaluated.
The second argument must evaluate to a function, and that function is
subsequently called with the raised value as its argument.


---


# 4. Delimited continuations #

It's delightful, it's delicious, it's... delimited!

Delimited continuations provide the subset of Scheme's `call/cc` needed
to implement generators (or coroutines), and a few more tricks besides.
You get real, first-class, restartable continuations (as functions), callable
from anywhere. The only catch is that their state is limited to an
explicitly delimited region of the program. This could be considered an
advantage however, since it means you need only look at the program to see
the range of places a continuation might return to.

To use the feature, surround a piece of code with
`(with-delimited-continuations ...)`. Continuations can be realized
anywhere inside this form. Such continuations will capture the execution
state of code inside the form; stackframes higher up (e.g. the caller
of the form) are lost.

Continuations are realized by the operators `reset` and `shift`.
Use `(reset ...)` to mark a control flow point. Inside the reset form,
`(shift var expr)` will evaluate `expr` with `var` bound to the continuation
of the `shift` expression. Calling this continuation with a value behaves
as if the `shift` expression had returned that value. Execution continues
until we hit the `reset`, whose value is then returned to the caller of
the continuation. If the continuation is not called, and the `shift`
expression returns a value when it originally runs
(for example `(shift k 2)`), then this value is immediately returned from
the `reset` expression (nothing between the `shift` and the `reset` runs).

As an example, we can use this feature to implement loops by repeatedly
calling the continuation of the top of the loop. We will translate the
following `while` loop:

```
(let ((x 0))
  (while (< x 10)
    (begin (print x)
           (set! x (+ 1 x)))))
```

Here is the delimited-continuation version:

```
(with-delimited-continuations
 (let ((x 0))
   (reset
    (let ((k (shift k (k k))))
      (if (< x 10)
          (begin (print x)
                 (set! x (+ 1 x))
                 (k k))
        x)))))
```

`(k k)` acts like a jump that rebinds k to itself, then performs the
`(< x 10)` test again.

For a much more satisfying example, we'll turn our modest while loop
into a generator. The following expression yields a no-argument function
that returns values from 0 to 9 on successive calls, and the symbol `done`
thereafter:

```
(let ((ko #f))
  (lambda ()
    (with-delimited-continuations
     (if ko (ko 0)
       (reset
        (let ((yield
               (lambda (v)
                 (shift yk (begin (set! ko yk) v)))))
          ; -- begin body
          (let ((x 0))
            (while (< x 10)
              (begin (yield x)
                     (set! x (+ 1 x))))
            'done)))))))
```

The interesting thing is the way the "body" code is written: there's nothing
special about it. It is the same as our basic `while` loop above.
The `yield` call can return from any point, and when the generator function
is invoked again the code will pick up right where it left off. Note that
the `while` loop does not even need to terminate; you can use a
generator to express an infinite sequence.

This pattern is abstracted by the `define-generator` macro:

```
(define-generator range-iterator (lo hi)
  (let ((x lo))
    (while (<= x hi)
      (begin (yield x)
             (set! x (+ 1 x))))
    'done))
```

`(range-iterator a b)` will return a no-argument generator function
as above. It is up to you what to do when the generator runs out of values;
you might throw an exception, invoke a caller-supplied escape procedure, or
return a special value like `'done`.

## 4.1. Limitations ##

`with-delimited-continuations` supports almost the whole language, but
there are some limitations to be aware of. The feature works by converting
the enclosed code to continuation-passing style, which means

  1. Functions are modified to accept an extra continuation argument.
  1. Function calls are modified to (conditionally) pass the extra continuation argument.

So while you can call any function from inside `with-delimited-continuations`,
you will not be able to capture continuations during execution of functions
defined outside `with-delimited-continuations`. In particular, this means closures
passed to higher-order functions defined outside cannot use `reset` and `shift`.
A workaround is to define a CPS version of the needed higher-order function by
enclosing its definition in `with-delimited-continuations`. A better remedy
for this problem will be supplied in the future.

If an expression in a generator function fails due to this limitation, but does
not need to capture continuations, it can be enclosed in
`without-delimited-continuations`.


---


# 5. Cvalues #
## 5.1. Introduction ##

femtoLisp allows you to use the full range of C data types on
dynamically-typed Lisp values. The motivation for this feature is that
useful interpreters must provide a large library of routines in C for dealing
with "real world" data like text and packed numeric arrays, and I would
rather not write yet another such library. Instead, all the
required data representations and primitives are provided so that such
features could be implemented in, or at least described in, Lisp.

The cvalues capability makes it easier to call C from Lisp by providing
ways to construct whatever arguments your C routines might require, and ways
to decipher whatever values your C routines might return. Here are some
things you can do with cvalues:

  * Call native C functions from Lisp without wrappers
  * Wrap C functions in pure Lisp, automatically inheriting some degree of type safety
  * Use the Lisp garbage collector to reclaim malloc'd storage
  * Annotate C pointers with size information for bounds checking or serialization
  * Attach symbolic type information to a C data structure, allowing it to be printed readably
  * Add new types to Lisp
  * Use more efficient represenations for your Lisp programs' data

femtoLisp's "cvalues" is inspired in part by Python's "ctypes" package.
Lisp doesn't really have first-class types the way Python does, but it does
have values, hence my version is called "cvalues".


## 5.2. Type representations ##

The core of cvalues is a language for describing C data types as
symbolic expressions:

  * Primitive types are symbols `int8, uint8, int16, uint16, int32, uint32, int64, uint64, byte, wchar, long, ulong, float, double, void`
  * Arrays `(array TYPE SIZE)`, where TYPE is another C type and SIZE is either a Lisp number or a C ulong. SIZE can be omitted to represent incomplete C array types like `int a[]`. As in C, the size may only be omitted for the top level of a nested array; all array _element_ types must have explicit sizes. Examples:

  * `int a[][2][3]` is `(array (array (array int32 3) 2))`
  * `int a[4][]` would be `(array (array int32) 4)`, but this is invalid.

  * Pointer `(pointer TYPE)`
  * Struct `(struct ((NAME TYPE) (NAME TYPE) ...))`
  * Union `(union ((NAME TYPE) (NAME TYPE) ...))`
  * Enum `(enum (NAME NAME ...))`
  * Function `(c-function RET-TYPE (ARG-TYPE ARG-TYPE ...))`

A cvalue can be constructed using `(c-value TYPE arg)`, where
`arg` is some Lisp value. The system will try to convert the Lisp
value to the specified type. In many cases this will work better if some
components of the provided Lisp value are themselves cvalues.

Note the function type is called `c-function` to avoid confusion, since
functions are such a prevalent concept in Lisp.

The function `sizeof` returns the size (in bytes) of a cvalue or a
c type. Every cvalue has a size, but incomplete types will cause
`sizeof` to raise an error. The function `typeof` returns
the type of a cvalue.


## 5.3. Constructors ##

For convenience, a specialized constructor is provided for each
class of C type (primitives, pointer, array, struct, union, enum,
and c-function).
For example:
```
(int32 -4)
(wchar 65)
(array 'int8 1 1 2 3 5 8)
```

Cvalue constructors are generally permissive; they do the best they
can with whatever you pass in. For example:

```
(c-value '(array int8 1))      ; ok, full type provided
(c-value '(array int8))        ; error, no size information
(c-value '(array int8) [0 1])  ; ok, size implied by initializer
```

Notice that the initializer used with `c-value` is always a single value;
to make an array we had to pass a vector. You can think of `c-value` as
a kind of lisp-to-C cast operator.


## 5.4. Pointers, arrays, and strings ##

Pointer types are provided for completeness and C interoperability, but
they should not generally be used from Lisp. femtoLisp doesn't know
anything about a pointer except the raw address and the (alleged) type of the
value it points to. Arrays are much more useful. They behave like references
as in C, but femtoLisp tracks their sizes and performs bounds checking.

Arrays are used to allocate strings. All strings share
the incomplete array type `(array byte)`:

```
> (c-value '(array byte) [#\h #\e #\l #\l #\o])
"hello"

> (sizeof that)
5
```

`sizeof` reveals that the size is known even though it is not
reflected in the type (as is always the case with incomplete array types).

Since femtoLisp tracks the sizes of all values, there is no need for NUL
terminators. Strings are just arrays of bytes, and may contain zero bytes
throughout. However, C functions require zero-terminated strings. To
solve this problem, femtoLisp allocates magic strings that actually have
space for one more byte than they appear to. The hidden extra byte is
always zero. This guarantees that a C function operating on the string
will never overrun its allocated space.

Strings are UTF-8 encoded by default, but are not required to contain valid UTF-8 data and can be used as arbitrary byte arrays as well. As the type implies, elements of the string are accessed as bytes, not characters. The functions beginning with `string.` can be used to manipulate strings at the character level. Wide character strings, which allow characters to be indexed directly, are available with the type `(array wchar)`.


## 5.5. Access ##


## 5.6. Memory management concerns ##


## 5.7. Guest functions ##

Functions written in C but designed to operate on Lisp values are
known here as "guest functions". Although they are foreign, they live in
Lisp's house and so live by its rules. Guest functions are what you
use to write interpreter extensions, for example to implement a function
like `assq` in C for performance.

Guest functions must have a particular signature:
```
value_t func(value_t *args, uint32_t nargs);
```
Guest functions must also be aware of the femtoLisp API and garbage
collector.


## 5.8. Native functions ##