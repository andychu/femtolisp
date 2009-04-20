#ifndef __OPCODES_H_
#define __OPCODES_H_

enum {
    OP_NOP=0, OP_DUP, OP_POP, OP_CALL, OP_TCALL, OP_JMP, OP_BRF, OP_BRT,
    OP_JMPL, OP_BRFL, OP_BRTL, OP_RET, OP_TAPPLY,

    OP_EQ, OP_EQV, OP_EQUAL, OP_ATOMP, OP_NOT, OP_NULLP, OP_BOOLEANP,
    OP_SYMBOLP, OP_NUMBERP, OP_BOUNDP, OP_PAIRP, OP_BUILTINP, OP_VECTORP,
    OP_FIXNUMP,

    OP_CONS, OP_LIST, OP_CAR, OP_CDR, OP_SETCAR, OP_SETCDR,
    OP_EVAL, OP_APPLY,

    OP_ADD, OP_SUB, OP_MUL, OP_DIV, OP_NUMEQ, OP_LT, OP_COMPARE,

    OP_VECTOR, OP_AREF, OP_ASET,

    OP_LOADT, OP_LOADF, OP_LOADNIL, OP_LOAD0, OP_LOAD1, OP_LOADI8,
    OP_LOADV, OP_LOADVL, OP_LOADG, OP_LOADA, OP_LOADC, OP_LOADGL,
    OP_SETG, OP_SETA, OP_SETC, OP_SETGL,

    OP_CLOSURE, OP_TRYCATCH, OP_ARGC, OP_VARGC, OP_CLOSE, OP_LET, OP_FOR
};

#endif
