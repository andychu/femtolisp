zero?
#function("r1~`W;" [])
vector.map
#function("r2c0e1\x7f31u42;" [#function("vc0e1~31u42;" [#function("v`\x80azc0qw2~;" [#function("r1\x80~i20i21~[31\\;" [])]) vector.alloc]) length])
vector->list
#function("r1c0e1~31_u43;" [#function("va~c0qw2\x7f;" [#function("r1i10\x80~z[\x81Ko01;" [])]) length])
untrace
#function("r1c0e1~31u42;" [#function("ve0~316G0e1\x80e2~31b2[42;^;" [traced? set-top-level-value! function:vals]) top-level-value])
traced?
#function("r1e0~31e0\x8031>;" [function:code] #0=[#function("s0e0c1~K312c2~x2;" [println x #.apply] #0#) ()])
trace
#function("r1c0e1~31u322c2;" [#function("vc0e130u42;" [#function("ve0\x8031@6i0e1i10e2c3~c4c5c6c7i10L2~L3L2c8c7\x80L2~L3L3L33142;^;" [traced? set-top-level-value! eval lambda begin println cons quote apply]) gensym]) top-level-value ok])
to-proper
#function("r1~A690~;~?6B0~L1;~Me0~N31K;" [to-proper])
table.values
#function("r1e0c1q_~43;" [table.foldl #function("r3\x7fg2K;" [])])
table.pairs
#function("r1e0c1q_~43;" [table.foldl #function("r3~\x7fKg2K;" [])])
table.keys
#function("r1e0c1q_~43;" [table.foldl #function("r3~g2K;" [])])
table.invert
#function("r1c0e130u42;" [#function("ve0c1q_\x80332~;" [table.foldl #function("r3e0\x80\x7f~43;" [put!])]) table])
table.foreach
#function("r2e0c1q_\x7f43;" [table.foldl #function("r3\x80~\x7f322];" [])])
table.clone
#function("r1c0e130u42;" [#function("ve0c1q_\x80332~;" [table.foldl #function("r3e0\x80~\x7f43;" [put!])]) table])
symbol-syntax
#function("r1e0e1~^43;" [get *syntax-environment*])
string.trim
#function("r3c0^^u43;" [#function("vc0qm02c1qm12c2e3\x8031u42;" [#function("r4g2g3X16H02e0\x7fe1~g232326Z0\x80~\x7fe2~g232g344;g2;" [string.find string.char string.inc]) #function("r3e0g2`3216O02e1\x7fe2~e3~g23232326_0\x81~\x7fe3~g23243;g2;" [> string.find string.char string.dec]) #function("ve0i10\x80i10i11`~34\x81i10i12~3343;" [string.sub]) length])])
string.tail
#function("r2e0~e1~`\x7f3342;" [string.sub string.inc])
string.rpad
#function("r3e0~e1g2\x7fe2~31z3242;" [string string.rep string.count])
string.rep
#function("r2\x7fb4X6g0e0\x7f`326E0c1;\x7faW6Q0e2~41;\x7fb2W6_0e2~~42;e2~~~43;e3\x7f316}0e2~e4~\x7faz3242;e4e2~~32\x7fb2U242;" [<= "" string odd? string.rep])
string.map
#function("r2c0e130e2\x7f31u43;" [#function("vc0`u322e1~41;" [#function("v^~\x81X6Y02e0\x80i10e1i11~3231322e2i11~32m0520;" [io.putc string.char string.inc]) io.tostring!]) buffer length])
string.lpad
#function("r3e0e1g2\x7fe2~31z32~42;" [string string.rep string.count])
string.join
#function("r2~A6:0c0;c1e230u42;" ["" #function("ve0~\x80M322e1c2q\x80N322e3~41;" [io.write for-each #function("r1e0\x80i11322e0\x80~42;" [io.write]) io.tostring!]) buffer])
simple-sort
#function("r1~A17<02~NA6A0~;c0~Mu42;" [#function("vc0e1c2q\x80N32u42;" [#function("ve0e1~M31\x80L1e1~N3143;" [nconc simple-sort]) separate #function("r1~\x80X;" [])])])
set-syntax!
#function("r2e0e1~\x7f43;" [put! *syntax-environment*])
separate
#function("r2\x80~\x7f__44;" [] #0=[#function("r4\x7fA6=0g2g3K;~\x7fM316S0\x80~\x7fN\x7fMg2Kg344;\x80~\x7fNg2\x7fMg3K44;" [] #0#) ()])
self-evaluating?
#function("r1~?16<02~C@17Y02e0~3116Y02~C16Y02~e1~31<;" [constant? top-level-value])
reverse!
#function("r1c0_u42;" [#function("v^\x80F6H02\x80N\x80~\x80m02P2o005202~;" [])])
reverse
#function("r1e0e1_~43;" [foldl cons])
revappend
#function("r2e0e1~31\x7f42;" [nconc reverse])
repl
#function("r0c0^^u43;" [#function("vc0qm02c1qm12\x7f302e240;" [#function("r0e0c1312e2e3312c4c5qc6qtu42;" [princ "> " io.flush *output-stream* #function("ve0e131@16G02c2e3~31u42;" [io.eof? *input-stream* #function("ve0~312~k12];" [print that]) load-process]) #function("r0e040;" [read]) #function("r1e0e1312e2~41;" [io.discardbuffer *input-stream* raise])]) #function("r0c0qc1qt6E0e2302\x8140;^;" [#function("r0\x803016>02e040;" [newline]) #function("r1e0~41;" [print-exception]) newline]) newline])])
remainder
#function("r2~~\x7fV\x7fT2z;" [])
ref-uint32-LE
#function("r2e0~\x7f`y[`32e0~\x7fay[b832e0~\x7fb2y[b@32e0~\x7fb3y[bH32R4;" [ash])
ref-uint16-LE
#function("r2e0~\x7f`y[`32e0~\x7fay[b832y;" [ash])
random
#function("r1e0~316D0e1e230~42;e330~T2;" [integer? mod rand rand.double])
quote-value
#function("r1e0~316<0~;c1~L2;" [self-evaluating? quote])
println
#function("s0e0~Q2e1302;" [print newline])
print-to-string
#function("r1c0e130u42;" [#function("ve0~\x80322e1~41;" [io.print io.tostring!]) buffer])
print-exception
#function("r1c0^^u43;" [#function("vc0qm02c1qm12\x80F16U02\x80Mc2<16U02e3\x80b4326w0~c4e5\x8031c6e7\x8031c8352\x7fe9\x8031315\x170\x80F16\x8b02\x80Mc:<16\x8b02\x80NF6\x9d0~c;e5\x8031c<335\x170\x80F16\xa902\x80Mc=<6\xba0~c>312~\x80NQ25\x170\x80F16\xc602\x80Mc?<6\xe00e@e7\x8031312~cAe5\x8031325\x170eB\x803116\xf102e3\x80b2326\x0d0\x7f\x80M312~cC312cDe5\x8031u325\x170~cE312\x7f\x80312~eF312];" [#function("s0e0e1~x3;" [io.princ *error-stream*]) #function("s0e0e1~x3;" [io.print *error-stream*]) type-error length= "type-error: " cadr ": expected " caddr ", got " cadddr unbound-error "unbound-error: eval: variable " " has no value" error "error: " load-error print-exception "in file " list? ": " #function("ve0~3117=02~C6D0\x805E0\x81~41;" [string?]) "*** Unhandled exception: " *linefeed*])])
print
#function("s0e0e1~x3;" [io.print *output-stream*])
princ
#function("s0e0e1~x3;" [io.princ *output-stream*])
positive?
#function("r1e0~`42;" [>])
odd?
#function("r1e0~31@;" [even?])
nreconc
#function("r2e0e1~31\x7f42;" [nconc reverse!])
newline
#function("r0e0e1312];" [princ *linefeed*])
nestlist
#function("r3e0g2`326>0_;\x7fe1~~\x7f31g2az33K;" [<= nestlist])
negative?
#function("r1~`X;" [])
mod0
#function("r2~~\x7fV\x7fT2z;" [])
mod
#function("r2~e0~\x7f32\x7fT2z;" [div])
memv
#function("r2\x7f?690^;\x7fM~=6B0\x7f;e0~\x7fN42;" [memv])
member
#function("r2\x7f?690^;\x7fM~>6B0\x7f;e0~\x7fN42;" [member])
mark-label
#function("r2e0~e1\x7f43;" [emit :label])
mapcar
#function("s1\x80~\x7f42;" [] #0=[#function("r2\x7fA6;0~40;\x7fM?6D0\x7fM;~e0e1\x7f32Q2\x80~e0e2\x7f3232K;" [map car cdr] #0#) ()])
map-int
#function("r2e0\x7f`326=0_;c1~`31_K_u43;" [<= #function("v~m12a\x81azc0qw2~;" [#function("r1\x81i10~31_KP2\x81No01;" [])])])
map!
#function("r2\x7f^\x7fF6I02\x7f~\x7fM31O2\x7fNm15402;" [])
map
#function("r2\x7f?690\x7f;~\x7fM31e0~\x7fN32K;" [map])
make-system-image
#function("r1c0e1~e2e3e434c5e6u44;" [#function("v^k02c1c2qu42;" [*print-pretty* #function("vc0qc1qt~302;" [#function("r0e0c1qe2e3e430313142;" [for-each #function("r1~E16h02e0~31@16h02e1~31G@16h02e2~i1132@16h02e3e1~3131@6\x950e4i10~322e5i10c6322e4i10e1~31322e5i10c642;^;" [constant? top-level-value memq iostream? io.print io.write "\n"]) reverse! simple-sort environment]) #function("r1\x80302e0~41;" [raise])]) #function("r0e0\x80312i02k1;" [io.close *print-pretty*])]) file :write :create :truncate (*linefeed* *directory-separator* *argv* that *print-pretty* *print-width* *print-readably*) *print-pretty*])
make-label
#function("r1e040;" [gensym])
make-code-emitter
#function("r0_e030`Z3;" [table])
macroexpand-1
#function("r1~?690~;c0e1~31u42;" [#function("v~6;0~\x80Nx2;\x80;" []) macrocall?])
macroexpand
#function("r1c0^^u43;" [#function("vc0qm02c1qm12\x7f\x80_42;" [#function("r2c0e1~31F6Y0e2~31F6Q0c3e1~31K5V0e4~315Z0^u42;" [#function("vc0e1~31i11~\x8132u43;" [#function("ve0c1e2i1031~A6E0\x7f5T0c1~\x7fL3e3c4q~32Ke5i103144;" [list* lambda cadr map #function("r1^;" []) lastcdr]) get-defined-vars]) cddr cdddr begin caddr]) #function("r2~?690~;c0e1~M\x7f32u42;" [#function("v~6I0i11e0~31\x80NQ2e1~3142;c2e3\x8031u42;" [cadr caddr #function("v~6E0i21~i10NQ2i1142;i10Mc0<6S0i10;i10Mc1<6i0i20i10i1142;i10Mc2<6\x980c3e4i1031e5c1L1_L1e6e7i10313133L1u43;e8c9qi1042;" [quote lambda let-syntax #function("vi31\x7fe0e1c2q~32i213242;" [nconc map #function("r1~Mi41e0~31i3132i31L3;" [cadr])]) cadr nconc copy-list cddr map #function("r1i31~i2142;" [])]) macrocall?]) assq])])])
macrocall?
#function("r1~MC16C02e0e1~M^43;" [get *syntax-environment*])
lookup-sym
#function("r4\x7fA6:0c0;c1\x7fMu42;" [(global) #function("vc0e1\x80~`33u42;" [#function("v~6J0i136A0c0~L2;c1i12~L3;e2i10i11Ni1317]02\x80A6f0i125k0i12ay^44;" [arg closed lookup-sym]) index-of])])
load-process
#function("r1e0~41;" [eval])
load
#function("r1c0e1~e232u42;" [#function("vc0qc1qt;" [#function("r0c0^u32^^^43;" [#function("vc0qm0;" [#function("r3e0i1031@6N0\x80e1i1031~e2\x7f3143;e3i10312e2\x7f41;" [io.eof? read load-process io.close])])]) #function("r1e0\x80312e1c2i10~L341;" [io.close raise load-error])]) file :read])
list?
#function("r1~A17F02~F16F02e0~N41;" [list?])
list-tail
#function("r2e0\x7f`326=0~;e1~N\x7faz42;" [<= list-tail])
list-ref
#function("r2e0~\x7f32M;" [list-tail])
list-partition
#function("r2c0^u42;" [#function("vc0qm02e1\x81`326G0e2c341;e4~\x80\x81`__3541;" [#function("r5~?6N0e0g2`326K0e1g331g4K;g4;e2g2\x7f326i0\x80~\x7f`_e1g331g4K45;\x80~N\x7fag2y~Mg3Kg445;" [> reverse! >=]) <= error "list-partition: invalid count" reverse!])])
list-head
#function("r2e0\x7f`326=0_;~Me1~N\x7faz32K;" [<= list-head])
list->vector
#function("r1e0~x2;" [vector])
length>
#function("r2\x7f`X6:0~;\x7f`W6I0~F16H02~;~?6R0\x7f`X;e0~N\x7faz42;" [length>])
length=
#function("r2\x7f`X6:0^;\x7f`W6C0~?;~?6L0\x7f`W;e0~N\x7faz42;" [length=])
lastcdr
#function("r1~?690~;e0~31N;" [last-pair])
last-pair
#function("r1~N?6:0~;e0~N41;" [last-pair])
just-compile-args
#function("r3e0c1q\x7f42;" [for-each #function("r1e0\x80i02^~44;" [compile-in])])
iota
#function("r1e0e1~42;" [map-int identity])
io.readline
#function("r1e0~c142;" [io.readuntil #\x000a])
index-of
#function("r3\x7fA690^;~\x7fM<6C0g2;e0~\x7fNg2ay43;" [index-of])
in-env?
#function("r2e0c1q\x7f42;" [any #function("r1e0\x80~42;" [memq])])
identity
#function("r1~;" [])
hex5
#function("r1e0e1~b@32b5c243;" [string.lpad number->string #\0])
get-defined-vars
#function("r1e0\x80~3141;" [delete-duplicates] #0=[#function("r1~?690_;~Mc0<16F02~NF6\x840e1~31C16[02e1~31L117\x8302e1~31F16}02e2~31C16}02e2~31L117\x8302_;~Mc3<6\x980e4e5\x80~N32x2;_;" [define cadr caadr begin append map] #0#) ()])
for-each
#function("r2\x7fF6E0~\x7fM312e0~\x7fN42;];" [for-each])
foldr
#function("r3g2A6:0\x7f;~g2Me0~\x7fg2N3342;" [foldr])
foldl
#function("r3g2A6:0\x7f;e0~~g2M\x7f32g2N43;" [foldl])
fits-i8
#function("r1~I16L02e0~b\xb03216L02e1~b\xaf42;" [>= <=])
filter
#function("r2\x80~\x7f_43;" [] #0=[#function("r3\x7fA6:0g2;~\x7fM316N0\x80~\x7fN\x7fMg2K43;\x80~\x7fNg243;" [] #0#) ()])
expand
#function("r1e0~41;" [macroexpand])
every
#function("r2\x7f?17J02~\x7fM3116J02e0~\x7fN42;" [every])
even?
#function("r1e0~a32`W;" [logand])
eval
#function("r1e0e1~313140;" [compile-thunk expand])
error
#function("s0e0c1~K41;" [raise error])
encode-byte-code
#function("r1c0e1~31u42;" [#function("vc0e1~31u42;" [#function("vc0e1e2~31b3e3c4q\x8032T2yc532u42;" [#function("vc0e1\x8031`e230e230e330^u47;" [#function("v^\x7f~X6\xb102i10\x7f[m52g5e0<6f0e1g2i10\x7fay[e2g431332\x7fb2ym15\xae0e3g4e4e5e6\x8016~02e7g5c8326\x8b0c9g5u325\x8d0g53231322\x7faym12\x7f~X6\xad0c:i10\x7f[u325\xae0^5202e;c<qg3322e=g441;" [:label put! sizeof io.write byte get Instructions memq (:jmp :brt :brf) #function("v~e0=6;0e1;~e2=6E0e3;~e4=6O0e5;^;" [:jmp :jmp.l :brt :brt.l :brf :brf.l]) #function("vc0i05u42;" [#function("ve0~c1326Q0e2i14e3\x8031322i11ayo11;e0~c4326q0e2i14e5\x8031322i11ayo11;e0~c6326\xad0e2i14e5\x8031322i11ayo112e2i14e5i30i11[31322i11ayo11;e0~c7326\xe90e2i14e3\x8031322i11ayo112e2i14e3i30i11[31322i11ayo11;e0~c8326$0e9i13e:i1431\x80332e2i14i206\x130e35\x150e;`31322i11ayo11;^;" [memv (:loadv.l :loadg.l :setg.l :loada.l :seta.l :largc :lvargc) io.write uint32 (:loada :seta :call :tcall :loadv :loadg :setg :list :+ :- :* :/ :vector :argc :vargc :loadi8 :apply :tapply) uint8 (:loadc :setc) (:loadc.l :setc.l) (:jmp :brf :brt) put! sizeof uint16])]) table.foreach #function("r2e0i04~322e1i04i106K0e25M0e3e4i02\x7f323142;" [io.seek io.write uint32 uint16 get]) io.tostring!]) length table buffer]) >= length count #function("r1e0~c142;" [memq (:loadv.l :loadg.l :setg.l :loada.l :seta.l :loadc.l :setc.l :jmp :brt :brf :largc :lvargc)]) 65536]) list->vector]) reverse!])
emit
#function("s2e0\x7fc1326K0e2~g2M32L1m25L0^2c3e4\x7fc532u322c6e4\x7fc732u322\x7fe8<6\x980g2c9>6\x810e:m12_m25\x950g2c;>6\x940e<m12_m25\x950^5\x990^2\x7fe=<6\xcb0g2c>>6\xb40e?m12_m25\xc80g2c@>6\xc70eAm12_m25\xc80^5\xcc0^2~`eB\x7fg2K~`[32\\2~;" [memq (:loadv :loadg :setg) bcode:indexfor #function("v~16A02e0i02Mc1326M0e2~31o01;^;" [> 255 cadr]) assq ((:loadv :loadv.l) (:loadg :loadg.l) (:setg :setg.l) (:loada :loada.l) (:seta :seta.l)) #function("v~16S02e0i02Mc13217S02e0e2i0231c1326_0e2~31o01;^;" [> 255 cadr]) ((:loadc :loadc.l) (:setc :setc.l)) :loada (0) :loada0 (1) :loada1 :loadc (0 0) :loadc00 (0 1) :loadc01 nreconc])
div
#function("r2~\x7fV~`X16M02\x7f`X16F02a17M02b/17S02`y;" [])
display
#function("r1e0~312];" [princ])
disassemble
#function("s1\x7fA6H0e0~`322e1302];5I0^2c2\x7fMe3~31e4~31u44;" [disassemble newline #function("vc0^u42;" [#function("vc0qm02c1`e2\x8131u43;" [#function("r1~J16<02~G@6Q0e0c1312e2~i10ay42;e3~41;" [princ "\n" disassemble print]) #function("v^~\x7fX6K02c0e1c2q^e333u32520;" [#function("ve0\x80`326A0e1305B0^2`i20azc2qw2e3e4\x8031c5e6e7~31a32c8342\x80ayo002c9~u42;" [> newline #function("r1e0c141;" [princ "\t"]) princ hex5 ":  " string.tail string "\t" #function("ve0~c1326Y0i20i32e2i31i1032[312i10b4yo10;e0~c3326}0i20i32i31i10[[312i10ayo10;e0~c4326\xa00e5e6i31i10[31312i10ayo10;e0~c7326\xc70e5e6e2i31i103231312i10b4yo10;e0~c8326\x050e5e6i31i10[31c9322i10ayo102e5e6i31i10[31312i10ayo10;e0~c:326K1e5e6e2i31i103231c9322i10b4yo102e5e6e2i31i103231312i10b4yo10;e0~c;326t1e5c<e=e>i31i103231322i10b2yo10;e0~c?326\x9d1e5c<e=e2i31i103231322i10b4yo10;^;" [memv (:loadv.l :loadg.l :setg.l) ref-uint32-LE (:loadv :loadg :setg) (:loada :seta :call :tcall :list :+ :- :* :/ :vector :argc :vargc :loadi8 :apply :tapply) princ number->string (:loada.l :seta.l :largc :lvargc) (:loadc :setc) " " (:loadc.l :setc.l) (:jmp :brf :brt) "@" hex5 ref-uint16-LE (:jmp.l :brf.l :brt.l)])]) table.foldl #function("r3g217F02\x7fi21\x80[<16F02~;" []) Instructions]) length])]) function:code function:vals])
delete-duplicates
#function("r1~?690~;c0~M~Nu43;" [#function("ve0~\x7f326@0e1\x7f41;~e1\x7f31K;" [member delete-duplicates])])
count
#function("r2c0^u42;" [#function("vc0qm02~\x80\x81`43;" [#function("r3\x7fA6:0g2;\x80~\x7fN~\x7fM316M0g2ay5O0g243;" [])])])
copy-tree
#function("r1~?690~;e0~M31e0~N31K;" [copy-tree])
const-to-idx-vec
#function("r1c0e1e2~3131u42;" [#function("ve0c1qe2\x8031322~;" [table.foreach #function("r2\x80\x7f~\\;" []) bcode:ctable]) vector.alloc bcode:nconst])
compile-while
#function("r4c0e1~31e1~31u43;" [#function("ve0\x80\x81^^342e1\x80~322e0\x80\x81^i02342e2\x80e3\x7f332e2\x80e4322e0\x80\x81^i03342e2\x80e5~332e1\x80\x7f42;" [compile-in mark-label emit :brf :pop :jmp]) make-label])
compile-thunk
#function("r1e0c1_~L341;" [compile lambda])
compile-sym
#function("r4c0e1g2\x7f`]34u42;" [#function("vc0~Mu42;" [#function("v~c0=6J0e1i10i13`[e2\x803143;~c3=6h0e1i10i13a[e2\x8031e4\x803144;e1i10i13b2[i1243;" [arg emit cadr closed caddr])]) lookup-sym])
compile-short-circuit
#function("r6g3?6C0e0~\x7fg2g444;g3N?6V0e0~\x7fg2g3M44;c1e2~31u42;" [compile-in #function("ve0\x80\x81^i03M342e1\x80e2322e1\x80i05~332e1\x80e3322e4\x80\x81i02i03Ni04i05362e5\x80~42;" [compile-in emit :dup :pop compile-short-circuit mark-label]) make-label])
compile-prog1
#function("r3e0~\x7f^e1g231342e2g231F6`0e3~\x7f^e2g231342e4~e542;^;" [compile-in cadr cddr compile-begin emit :pop])
compile-or
#function("r4e0~\x7fg2g3^e146;" [compile-short-circuit :brt])
compile-let
#function("r4c0g3Mg3Nu43;" [#function("ve0\x7fe1e2~3131326F0^5Q0e3e4c5~32312e6\x80e7e8\x81~]33332c9e:\x80\x81\x7f33u42;" [length= length cadr error string "apply: incorrect number of arguments to " emit :loadv compile-f #function("ve0i10e1322e0i10i126K0e25M0e3a~y43;" [emit :copyenv :tcall :call]) compile-arglist])])
compile-in
#function("r4g3C6C0e0~\x7fg3c144;g3?6\xb10g3`<6X0e2~e342;g3a<6g0e2~e442;g3]<6v0e2~e542;g3^<6\x850e2~e642;g3_<6\x940e2~e742;e8g3316\xa70e2~e9g343;e2~e:g343;c;g3Mu42;" [compile-sym [:loada :loadc :loadg] emit :load0 :load1 :loadt :loadf :loadnil fits-i8 :loadi8 :loadv #function("v~c0=6G0e1\x80e2e3i033143;~c4=6[0e5\x80\x81i02i0344;~c6=6p0e7\x80\x81i02i03N44;~c8=6\x810e9\x80\x81i0343;~c:=6\xa00e1\x80e2e;\x81i0332332e1\x80e<42;~c==6\xb50e>\x80\x81i02i03N44;~c?=6\xca0e@\x80\x81i02i03N44;~cA=6\xe90eB\x80\x81e3i0331c6eCi0331K44;~cD=6\x0c0eE\x80\x81e3i0331eFi0331eGi033145;~cH=6*0eI\x80\x81]e3i0331342e1\x80eJ42;~cK=6P1eI\x80\x81^eFi0331342eL\x80\x81e3i0331cM44;~cN=6\x9b1eI\x80\x81^c:_e3i0331L3342eOeFi0331316}1^5\x831ePcQ312eI\x80\x81^eFi0331342e1\x80eR42;eS\x80\x81i02i0344;" [quote emit :loadv cadr if compile-if begin compile-begin prog1 compile-prog1 lambda compile-f :closure and compile-and or compile-or while compile-while cddr for compile-for caddr cadddr return compile-in :ret set! compile-sym [:seta :setc :setg] trycatch 1arg-lambda? error "trycatch: second form must be a 1-argument lambda" :trycatch compile-app])])
compile-if
#function("r4c0e1~31e1~31e2g331e3g331e4g331F6]0e5g3315^0^u46;" [#function("vg2]<6D0e0\x80\x81i02g344;g2^<6W0e0\x80\x81i02g444;e0\x80\x81^g2342e1\x80e2~332e0\x80\x81i02g3342i026\x860e1\x80e3325\x8e0e1\x80e4\x7f332e5\x80~322e0\x80\x81i02g4342e5\x80\x7f42;" [compile-in emit :brf :ret :jmp mark-label]) make-label cadr caddr cdddr cadddr])
compile-for
#function("r5e0g4316a0e1~\x7f^g2342e1~\x7f^g3342e1~\x7f^g4342e2~e342;e4c541;" [1arg-lambda? compile-in emit :for error "for: third form must be a 1-argument lambda"])
compile-f
#function("s2c0e130e2\x7f31u43;" [#function("vi02A@6C0e0~e1325\x970e2\x7fe3326j0e0~e4\x7f31A6^0e55`0e6e7\x7f31335\x970e4\x7f31A6\x820e0~e8e7\x7f31335\x970e0~e9\x7f?6\x900`5\x950e7\x7f31332e:~e;\x7f31\x80K]e<\x8131342e0~e=322e>e?e@~3131eA~3142;" [emit :let length> MAX_ARGS lastcdr :largc :lvargc length :argc :vargc compile-in to-proper caddr :ret function encode-byte-code bcode:code const-to-idx-vec]) make-code-emitter cadr])
compile-call
#function("r4c0g3Mu42;" [#function("vc0~C16]02e1~\x8132@16]02~E16]02e2~3116]02e3~31G6h0e3~315i0~u42;" [#function("vc0~G16?02e1~31u42;" [#function("v~@6E0e0i20i21^\x80345F0^2c1e2i20i21i23N33u42;" [compile-in #function("v\x806C0c0e1e2\x80^33u42;e3i30i326S0e45U0e5~43;" [#function("v~16A02e0i43N~32@6O0e1i20~325P0^2c2i10u42;" [length= argc-error #function("v~e0=6X0i10`W6J0e1i50e242;e1i50i20i1043;~e3=6\x920i10`W6q0e1i50e442;i10b2W6\x840e1i50e542;e1i50i20i1043;~e6=6\xdd0i10`W6\xaa0e7i30a42;i10aW6\xbc0e1i50e842;i10b2W6\xcf0e1i50e942;e1i50i20i1043;~e:=6\x040i10`W6\xf60e1i50e;42;e1i50i20i1043;~e<=6*0i10`W6\x1c0e7i30a42;e1i50i20i1043;~e==6S1i10`W6E1e1i50e>c?43;e1i50i20i1043;~e@=6\x851i10b2X6m1e7i30b242;e1i50i526}1eA5\x7f1e@i1043;e1i50i2042;" [:list emit :loadnil :+ :load0 :add2 :- argc-error :neg :sub2 :* :load1 :/ :vector :loadv [] :apply :tapply])]) get arg-counts emit :tcall :call]) compile-arglist]) builtin->instruction]) in-env? constant? top-level-value])])
compile-begin
#function("r4g3?6B0e0~\x7fg2^44;g3N?6U0e0~\x7fg2g3M44;e0~\x7f^g3M342e1~e2322e3~\x7fg2g3N44;" [compile-in emit :pop compile-begin])
compile-arglist
#function("r3c0e1g2e232u42;" [#function("v~6a0e0\x80e1i02e232\x81332c3e4e5c6qe7~e23232Ku322e2ay;e0\x80i02\x81332e8i0241;" [just-compile-args list-head MAX_ARGS #function("ve0i10i11^~44;" [compile-in]) nconc map #function("r1e0~K;" [list]) list-partition length]) length> MAX_ARGS])
compile-app
#function("r4c0g3Mu42;" [#function("v~F16\\02~Mc0<16\\02e1e2~313116\\02e3e2~31e432@6l0e5\x80\x81i02i0344;e6\x80\x81i02i0344;" [lambda list? cadr length> MAX_ARGS compile-let compile-call])])
compile-and
#function("r4e0~\x7fg2g3]e146;" [compile-short-circuit :brf])
compile
#function("r1e0_~42;" [compile-f])
char?
#function("r1e0~31c1<;" [typeof wchar])
cddr
#function("r1~NN;" [])
cdddr
#function("r1~NNN;" [])
cddar
#function("r1~MNN;" [])
cdar
#function("r1~MN;" [])
cdadr
#function("r1~NMN;" [])
cdaar
#function("r1~MMN;" [])
cadr
#function("r1~NM;" [])
caddr
#function("r1~NNM;" [])
cadddr
#function("r1~NNNM;" [])
cadar
#function("r1~MNM;" [])
caar
#function("r1~MM;" [])
caadr
#function("r1~NMM;" [])
caaar
#function("r1~MMM;" [])
builtin->instruction
#function("r1c0e1e2c3~3231u42;" [#function("ve0e1~3216>02~;" [has? Instructions]) intern string #\:])
bq-process
#function("r1c0^u42;" [#function("vc0qm02e1\x80316U0\x80H6S0c2e3e4\x803131u42;\x80;\x80?6`0c5\x80L2;\x80Mc6<6v0e3e3e7\x80313141;\x80Mc8<6\x840e7\x8041;e9~\x8032@6\xa00c:e;\x8031e<e=\x8032u43;c>\x80_u43;" [#function("r1~F16H02~Mc0<17H02~Mc1<17Q02~c2<;" [*comma-at* *comma-dot* *comma*]) self-evaluating? #function("v~Mc0<6?0e1~NK;e2e1~L3;" [list vector apply]) bq-process vector->list quote backquote cadr *comma* any #function("v~A6;0c0\x7fK;e1c2\x7fKe3~31L142;" [list nconc list* bq-process]) lastcdr map bq-bracket1 #function("v^~F16?02~Mc0<@6U02e1~M31\x7fKm12~Nm05202c2~F6l0e3\x7fe4~31L1325\x850~A6y0e5\x7f315\x850e3\x7fe6~31L132u42;" [*comma* bq-bracket #function("v~NA6:0~M;c0~K;" [nconc]) nreconc cadr reverse! bq-process])])])
bq-bracket1
#function("r1~F16>02~Mc0<6G0e1~41;e2~41;" [*comma* cadr bq-process])
bq-bracket
#function("r1~?6A0e0e1~31L2;~Mc2<6S0e0e3~31L2;~Mc4<6e0c5e3~31L2;~Mc6<6s0e3~41;e0e1~31L2;" [list bq-process *comma* cadr *comma-at* copy-list *comma-dot*])
bcode:nconst
#function("r1~b2[;" [])
bcode:indexfor
#function("r2c0e1~31e2~31u43;" [#function("ve0~\x81326A0e1~\x8142;e2~\x81\x7f332\x7f\x80b2\x7fay\\2;" [has? get put!]) bcode:ctable bcode:nconst])
bcode:ctable
#function("r1~a[;" [])
bcode:code
#function("r1~`[;" [])
assv
#function("r2\x7f?690^;e0\x7f31~=6F0\x7fM;e1~\x7fN42;" [caar assv])
assoc
#function("r2\x7f?690^;e0\x7f31~>6F0\x7fM;e1~\x7fN42;" [caar assoc])
array?
#function("r1~H17C02c0e1~31u42;" [#function("v~F16=02~Mc0<;" [array]) typeof])
argc-error
#function("r2e0e1c2~c3\x7f\x7faW6G0c45I0c53541;" [error string "compile error: " " expects " " argument." " arguments."])
arg-counts
#table(:not 1  :set-cdr! 2  :cons 2  :number? 1  :equal? 2  :cdr 1  :vector? 1  :eqv? 2  := 2  :div0 2  :atom? 1  :aref 2  :compare 2  :< 2  :null? 1  :eq? 2  :car 1  :set-car! 2  :builtin? 1  :aset! 3  :bound? 1  :boolean? 1  :pair? 1  :symbol? 1  :fixnum? 1)
append
#function("s0~A690_;~NA6B0~M;e0~Me1~NQ242;" [copy-list append])
any
#function("r2\x7fF16J02~\x7fM3117J02e0~\x7fN42;" [any])
abs
#function("r1~`X6;0~{;~;" [])
__start
#function("r1e0302~NF6N0~Nk12e2e3~31315]0~k12e4e5312e6302e7`41;" [__init_globals *argv* __script cadr princ *banner* repl exit])
__script
#function("r1c0qc1qt;" [#function("r0e0\x8041;" [load]) #function("r1e0~312e1a41;" [print-exception exit])])
__init_globals
#function("r0e0c1<17K02e0c2<17K02e0c3<6Z0c4k52c6k75c0c8k52c9k72e:k;2e<k=2e>k?;" [*os-name* win32 win64 windows "\\" *directory-separator* "\r\n" *linefeed* "/" "\n" *stdout* *output-stream* *stdin* *input-stream* *stderr* *error-stream*])
MAX_ARGS
127
Instructions
#table(:sub2 74  :nop 0  :set-cdr! 32  :/ 37  :setc 63  :tapply 72  :lvargc 77  :cons 27  :loada1 79  dummy_nil 84  :equal? 14  :cdr 30  :call 3  :eqv? 13  := 39  :setg.l 60  :list 28  :atom? 15  :aref 43  :load0 48  :let 70  dummy_t 82  :argc 66  :< 40  :null? 17  :loadg 53  :load1 49  :car 29  :brt.l 10  :vargc 67  :loada 55  :set-car! 31  :setg 59  :aset! 44  :loadc01 81  :bound? 21  :pair? 22  :symbol? 19  :fixnum? 25  :loadi8 50  :not 16  :* 36  :neg 75  :pop 2  :largc 76  :loadnil 47  :brf 6  :vector 42  :- 35  :loadv 51  :loada.l 56  :seta.l 62  :closure 65  :loadc00 80  :number? 20  dummy_f 83  :trycatch 68  :add2 73  :loadv.l 52  :vector? 24  :brf.l 9  :seta 61  :apply 33  :dup 1  :div0 38  :setc.l 64  :copyenv 69  :for 71  :loada0 78  :loadc 57  :loadc.l 58  :compare 41  :eq? 12  :function? 26  :+ 34  :jmp 5  :loadt 45  :brt 7  :builtin? 23  :loadg.l 54  :tcall 4  :ret 11  :boolean? 18  :loadf 46  :jmp.l 8)
>=
#function("r2\x7f~X17=02~\x7fW;" [])
>
#function("r2\x7f~X;" [])
<=
#function("r2~\x7fX17=02~\x7fW;" [])
1arg-lambda?
#function("r1~F16`02~Mc0<16`02~NF16`02e1~31F16`02e2e1~31a42;" [lambda cadr length=])
1-
#function("r1~az;" [])
1+
#function("r1~ay;" [])
/=
#function("r2~\x7fW@;" [])
*whitespace*
"\t\n\v\f\r \u0085  ᠎           \u2028\u2029  　"
*syntax-environment*
#table(define #function("s1~C6?0c0~\x7fML3;c0~Mc1~N\x7fKKL3;" [set! lambda])  letrec #function("s1c0e1e2~32e3e1c4q~32\x7f32KKe1c5q~32K;" [lambda map car nconc #function("r1c0~K;" [set!]) #function("r1^;" [])])  backquote #function("r1e0~41;" [bq-process])  assert #function("r1c0~]c1c2c3~L2L2L2L4;" [if raise quote assert-failed])  label #function("r2c0~L1c1~\x7fL3L3^L2;" [lambda set!])  do #function("s2c0e130\x7fMe2e3~32e2e4~32e2c5q~32u46;" [#function("vc0~c1g2c2\x7fe3c4L1e5\x81N3132e3c4L1e5i0231e3~L1e5g43132L133L4L3L2L1e3~L1e5g33132L3;" [letrec lambda if nconc begin copy-list]) gensym map car cadr #function("r1e0~31F6A0e1~41;~M;" [cddr caddr])])  when #function("s1c0~c1\x7fK^L4;" [if begin])  unwind-protect #function("r2c0e130e130u43;" [#function("vc0\x7fc1_\x81L3L2L1c2c3\x80c1~L1c4\x7fL1c5~L2L3L3L3\x7fL1L3L3;" [let lambda prog1 trycatch begin raise]) gensym])  dotimes #function("s1c0~Me1~31u43;" [#function("vc0`c1\x7faL3e2c3L1~L1L1e4\x813133L4;" [for - nconc lambda copy-list]) cadr])  define-macro #function("s1c0c1~ML2c2~N\x7fKKL3;" [set-syntax! quote lambda])  unless #function("s1c0~^c1\x7fKL4;" [if begin])  let #function("s1c0^u42;" [#function("v\x80C6H0\x80m02\x81Mo002\x81No015I0^2c0c1e2c3q\x8032\x81KKe2c4q\x8032u43;" [#function("v\x806>0c0\x80~L35?0~\x7fK;" [label]) lambda map #function("r1~F6:0~M;~;" []) #function("r1~F6=0e0~41;^;" [cadr])])])  cond #function("s0c0^u42;" [#function("vc0qm02~\x8041;" [#function("r1~?690^;c0~Mu42;" [#function("v~Mc0<17?02~M]<6Q0~NA6K0~M;c1~NK;~NA6e0c2~Mi10\x80N31L3;c3~Mc1~NKi10\x80N31L4;" [else begin or if])])])])  throw #function("r2c0c1c2c3L2~\x7fL4L2;" [raise list quote thrown-value])  time #function("r1c0e130u42;" [#function("vc0~c1L1L2L1c2\x80c3c4c5c1L1~L3c6L4L3L3;" [let time.now prog1 princ "Elapsed time: " - " seconds\n"]) gensym])  let* #function("s1~?6J0e0c1L1_L1e2\x7f3133L1;e0c1L1e3~31L1L1e2~NF6w0e0c4L1~NL1e2\x7f3133L15x0\x7f3133e5~31L2;" [nconc lambda copy-list caar let* cadar])  case #function("s1c0^u42;" [#function("vc0qm02c1e230u42;" [#function("r2\x7fc0<6<0c0;\x7fA6C0^;\x7f?6S0c1~e2\x7f31L3;\x7fNA6e0c1~e2\x7fM31L3;c3~c4\x7fL2L3;" [else eqv? quote-value memv quote]) #function("vc0~i10L2L1e1c2L1e3e4c5qi11323132L3;" [let nconc cond copy-list map #function("r1i10\x80~M32~NK;" [])]) gensym])])  catch #function("r2c0e130u42;" [#function("vc0\x81c1~L1c2c3c4~L2c5c6~L2c7c8L2L3c5c9~L2\x80L3L4c:~L2c;~L2L4L3L3;" [trycatch lambda if and pair? eq car quote thrown-value cadr caddr raise]) gensym]))
*banner*
";  _\n; |_ _ _ |_ _ |  . _ _\n; | (-||||_(_)|__|_)|_)\n;-------------------|----------------------------------------------------------\n\n"