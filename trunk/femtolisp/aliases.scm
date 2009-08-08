; definitions of standard scheme procedures in terms of
; femtolisp procedures

(define top-level-bound? bound?)

(define vector-ref aref)
(define vector-set! aset!)
(define vector-length length)
(define make-vector vector.alloc)
(define (vector-fill! v f)
  (for 0 (- (length v) 1)
       (lambda (i) (aset! v i f)))
  #t)
(define (vector-map f v) (vector.map f v))

(define array-ref! aref)
(define (array-set! a obj i0 . idxs)
  (if (null? idxs)
      (aset! a i0 obj)
      (error "array-set!: multiple dimensions not yet implemented")))

(define (array-dimensions a)
  (list (length a)))

(define (complex? x) #f)
(define (real? x) (number? x))
(define (rational? x) (integer? x))
(define (exact? x) (integer? x))
(define (inexact? x) (not (exact? x)))
(define quotient div0)
(define (inexact x) x)
(define (exact x)
  (if (exact? x) x
      (error "exact real numbers not supported")))
(define (finite? x) (and (< x +inf.0) (> x -inf.0)))
(define (infinite? x) (or (equal? x +inf.0) (equal? x -inf.0)))
(define (nan? x) (or (equal? x +nan.0) (equal? x -nan.0)))

(define (char->integer c) (fixnum c))
(define (integer->char i) (wchar i))
(define char-upcase char.upcase)
(define char-downcase char.downcase)
(define char=? eqv?)
(define char<? <)
(define char>? >)
(define char<=? <=)
(define char>=? >=)

(define string=? eqv?)
(define string<? <)
(define string>? >)
(define string<=? <=)
(define string>=? >=)
(define string-copy copy)
(define string-append string)
(define string-length string.count)
(define string->symbol symbol)
(define (symbol->string s) (string s))
(define symbol=? eq?)
(define (make-string k (fill #\space))
  (string.rep fill k))

(define (string-ref s i)
  (string.char s (string.inc s 0 i)))

(define (input-port? x) (iostream? x))
(define (output-port? x) (iostream? x))

(define (eval-core x) (eval x))