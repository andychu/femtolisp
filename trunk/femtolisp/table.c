#include <stdlib.h>
#include <stdio.h>
#include <stdarg.h>
#include <string.h>
#include <assert.h>
#include <sys/types.h>
#include "llt.h"
#include "flisp.h"

/*
  there are 2 kinds of hash tables (eq and equal), each with some
  optimized special cases. here are the building blocks:

  hash/compare function: (h1) eq (ptrhash) and (h2) equal (deep hash)
  relocate: (r1) no relocate, (r2) relocate but no rehash, (r3) rehash

  eq hash:
  keys all eq_comparable, no gensyms: h1, r1
  anything else: h1, r3

  equal hash:
  keys all eq_comparable, no gensyms: h1, r1
  with gensyms: h1, r2
  anything else: h2, r2
*/

typedef struct {
    void *(*get)(void *t, void *key);
    void (*remove)(void *t, void *key);
    void **(*bp)(void *t, void *key);
} table_interface_t;

typedef struct {
    table_interface_t *ti;
    ulong_t nkeys;
    ptrhash_t ht;
} fltable_t;

void print_htable(ios_t *f, value_t h, int princ)
{
}

void free_htable(value_t self)
{
    fltable_t *pt = (fltable_t*)cv_data((cvalue_t*)ptr(self));
    ptrhash_free(&pt->ht);
}

void relocate_htable(value_t old, value_t new)
{
    fltable_t *pt = (fltable_t*)cv_data((cvalue_t*)ptr(self));
    ptrhash_t *h = &pt->ht;
    size_t i;
    for(i=0; i < h->size; i++) {
        if (h->table[i] != PH_NOTFOUND)
            h->table[i] = (void*)relocate((value_t)h->table[i]);
    }
}

void rehash_htable(value_t old, value_t new)
{
}

cvtable_t h_r1_vtable = { print_htable, NULL, free_htable };
cvtable_t h_r2_vtable = { print_htable, relocate_htable, free_htable };
cvtable_t h_r3_vtable = { print_htable, rehash_htable, free_htable };

int ishashtable(value_t v)
{
    return 0;
}

value_t fl_table(value_t *args, u_int32_t nargs)
{
}

value_t fl_hashtablep(value_t *args, u_int32_t nargs)
{
    return NIL;
}

value_t fl_hash_put(value_t *args, u_int32_t nargs)
{
    return NIL;
}

value_t fl_hash_get(value_t *args, u_int32_t nargs)
{
    return NIL;
}

value_t fl_hash_has(value_t *args, u_int32_t nargs)
{
    return NIL;
}

value_t fl_hash_delete(value_t *args, u_int32_t nargs)
{
    return NIL;
}