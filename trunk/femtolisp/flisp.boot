zero?
#function("n1e0_V;" [])
vector.map
#function("n2b0d1e131p42;" [#function("qb0d1e031p42;" [#function("q_f00`ub0lr2e0;" [#function("n1f00e0f20f21e0Z31[;" [])]) vector.alloc]) length])
vector->list
#function("n1b0d1e031^p43;" [#function("q`e0b0lr2e1;" [#function("n1f10f00e0uZf01Kj01;" [])]) length])
untrace
#function("n1b0d1e031p42;" [#function("qd0e0316K0d1f00d2e031a2Z42;];" [traced? set-top-level-value! function:vals]) top-level-value])
transpose
#function("n1d0d1e0s3;" [mapcar list])
traced?
#function("n1d0e031d0f0031>;" [function:code] #0=[#function("o0d0b1e0K312b2e0s2;" [println x #.apply] #0#) ()])
trace
#function("n1b0d1e031p322b2;" [#function("qb0d130p42;" [#function("qd0f0031@6p0d1f10d2b3e0b4b5b6b7f10L2e0L3L2b8b7f00L2e0L3L3L33142;];" [traced? set-top-level-value! eval lambda begin println cons quote apply]) gensym]) top-level-value ok])
to-proper
#function("n1e0A6;0e0;e0?6F0e0L1;e0Md0e0N31K;" [to-proper])
table.values
#function("n1d0b1l^e043;" [table.foldl #function("n3e1e2K;" [])])
table.pairs
#function("n1d0b1l^e043;" [table.foldl #function("n3e0e1Ke2K;" [])])
table.keys
#function("n1d0b1l^e043;" [table.foldl #function("n3e0e2K;" [])])
table.invert
#function("n1b0d130p42;" [#function("qd0b1l^f00332e0;" [table.foldl #function("n3d0f00e1e043;" [put!])]) table])
table.foreach
#function("n2d0b1l^e143;" [table.foldl #function("n3f00e0e1322\\;" [])])
table.clone
#function("n1b0d130p42;" [#function("qd0b1l^f00332e0;" [table.foldl #function("n3d0f00e0e143;" [put!])]) table])
symbol-syntax
#function("n1d0d1e0]43;" [get *syntax-environment*])
string.trim
#function("n3b0]]p43;" [#function("qb0li02b1li12b2d3f0031p42;" [#function("n4e2e3W16J02d0e1d1e0e232326a0f00e0e1d2e0e232e344;e2;" [string.find string.char string.inc]) #function("n3d0e2_3216R02d1e1d2e0d3e0e23232326g0f01e0e1d3e0e23243;e2;" [> string.find string.char string.dec]) #function("qd0f10f00f10f11_e034f01f10f12e03343;" [string.sub]) length])])
string.tail
#function("n2d0e0d1e0_e13342;" [string.sub string.inc])
string.rpad
#function("n3d0e0d1e2e1d2e031u3242;" [string string.rep length])
string.rep
#function("n2e1a4W6q0d0e1_326G0b1;e1`V6U0d2e041;e1a2V6f0d2e0e042;d2e0e0e043;d3e1316\x8b0d2e0d4e0e1`u3242;d4d2e0e032e1a2U242;" [<= "" string odd? string.rep])
string.map
#function("n2b0d130d2e131p43;" [#function("qb0_p322d1e041;" [#function("q]e0f01W6`02d0f00f10d1f11e03231322d2f11e032i0520;" [io.putc string.char string.inc]) io.tostring!]) buffer length])
string.lpad
#function("n3d0d1e2e1d2e031u32e042;" [string string.rep length])
string.join
#function("n2e0A6;0b0;b1d230p42;" ["" #function("qd0e0f00M322d1b2lf00N322d3e041;" [io.write for-each #function("n1d0f00f11322d0f00e042;" [io.write]) io.tostring!]) buffer])
splice-form?
#function("n1e0F16K02e0Mb0<17K02e0Mb1<17U02e0b2<;" [*comma-at* *comma-dot* *comma*])
simple-sort
#function("n1e0A17>02e0NA6D0e0;b0e0Mp42;" [#function("qb0d1b2lf00N32p42;" [#function("qd0d1e0M31f00L1d1e0N3143;" [nconc simple-sort]) separate #function("n1e0f00W;" [])])])
set-syntax!
#function("n2d0d1e0e143;" [put! *syntax-environment*])
separate
#function("n2f00e0e1^^44;" [] #0=[#function("n4e1A6>0e2e3K;e0e1M316[0f00e0e1Ne1Me2Ke344;f00e0e1Ne2e1Me3K44;" [] #0#) ()])
self-evaluating?
#function("n1e0?16>02e0C@17_02d0e03116_02e0C16_02e0d1e031<;" [constant? top-level-value])
reverse
#function("n1d0d1^e043;" [foldl cons])
revappend
#function("n2d0d1e031e142;" [nconc reverse])
repl
#function("n0b0]]p43;" [#function("qb0li02b1li12e1302d240;" [#function("n0d0b1312d2d3312b4b5lb6lmp42;" [princ "> " io.flush *output-stream* #function("qd0d131@16H02b2d3e031p42;" [io.eof? *input-stream* #function("qd0e0312e0h12\\;" [print that]) load-process]) #function("n0d040;" [read]) #function("n1d0d1312d2e041;" [io.discardbuffer *input-stream* raise])]) #function("n0b0lb1lm6G0d2302f0140;];" [#function("n0f003016@02d040;" [newline]) #function("n1d0e041;" [print-exception]) newline]) newline])])
remainder
#function("n2e0e0e1U2e1T2u;" [])
ref-uint32-LE
#function("n2d0e0e1_tZ_32d0e0e1`tZa832d0e0e1a2tZa@32d0e0e1a3tZaH32R4;" [ash])
ref-uint16-LE
#function("n2d0e0e1_tZ_32d0e0e1`tZa832t;" [ash])
random
#function("n1d0e0316F0d1d230e042;d330e0T2;" [integer? remainder rand rand.double])
quote-value
#function("n1d0e0316>0e0;b1e0L2;" [self-evaluating? quote])
println
#function("o0d0e0Q2d1302;" [print newline])
print-to-string
#function("n1b0d130p42;" [#function("qd0e0f00322d1e041;" [io.print io.tostring!]) buffer])
print-exception
#function("n1b0]]p43;" [#function("qb0li02b1li12f00F16[02f00Mb2<16[02d3f00a4326\x850e0b4d5f0031b6d7f0031b8352e1d9f0031315H1f00F16\x9f02f00Mb:<16\x9f02f00NF6\xb40e0b;d5f0031b<335H1f00F16\xc402f00Mb=<6\xd90e0b>312e0f00NQ25H1f00F16\xe902f00Mb?<6\x080d@d7f0031312e0bAd5f0031325H1dBf003116\x1d02d3f00a2326:1e0f00MbC322bDd5f0031p325H1e0bE312e1f00312e0dF312\\;" [#function("o0d0d1e0s3;" [io.princ *error-stream*]) #function("o0d0d1e0s3;" [io.print *error-stream*]) type-error length= "type-error: " cadr ": expected " caddr ", got " cadddr unbound-error "unbound-error: eval: variable " " has no value" error "error: " load-error print-exception "in file " list? ": " #function("qd0e03117?02e0C6H0f005K0f01e041;" [string?]) "*** Unhandled exception: " *linefeed*])])
print
#function("o0d0d1e0s3;" [io.print *output-stream*])
princ
#function("o0d0d1e0s3;" [io.princ *output-stream*])
positive?
#function("n1d0e0_42;" [>])
peephole
#function("n1e0;" [])
odd?
#function("n1d0e031@;" [even?])
nreverse
#function("n1b0^p42;" [#function("q]f00F6Q02f00Nf00e0f00i02P2j005202e0;" [])])
nreconc
#function("n2d0d1e031e142;" [nconc nreverse])
nlist*
#function("o0e0N?6=0e0M;e0d0e0NQ2P;" [nlist*])
newline
#function("n0d0d1312\\;" [princ *linefeed*])
nestlist
#function("n3d0e2_326>0^;e1d1e0e0e131e2`u33K;" [<= nestlist])
negative?
#function("n1e0_W;" [])
mod
#function("n2e0e0e1U2e1T2u;" [])
memv
#function("n2e1?6:0];e1Me0=6F0e1;d0e0e1N42;" [memv])
member
#function("n2e1?6:0];e1Me0>6F0e1;d0e0e1N42;" [member])
mark-label
#function("n2d0e0d1e143;" [emit :label])
mapcar
#function("o1f00e0e142;" [] #0=[#function("n2e1A6=0e040;e1M?6H0e1M;e0d0d1e132Q2f00e0d0d2e13232K;" [map car cdr] #0#) ()])
map-int
#function("n2d0e1_326>0^;b1e0_31^K^p43;" [<= #function("qe0i12`f01`ub0lr2e0;" [#function("n1f01f10e031^KP2f01Nj01;" [])])])
map!
#function("n2e1]e1F6O02e1e0e1M31O2e1Ni15502;" [])
map
#function("n2e1?6;0e1;e0e1M31d0e0e1N32K;" [map])
make-system-image
#function("n1b0d1e0d2d3d434b5d6p44;" [#function("q]h02b1b2lp42;" [*print-pretty* #function("qb0lb1lme0302;" [#function("n0d0b1ld2d3d430313142;" [for-each #function("n1e0E16m02d0e031@16m02d1e031G@16m02d2e0f1132@16m02d3d1e03131@6\x9c0d4f10e0322d5f10b6322d4f10d1e031322d5f10b642;];" [constant? top-level-value memq iostream? io.print io.write "\n"]) nreverse simple-sort environment]) #function("n1f00302d0e041;" [raise])]) #function("n0d0f00312f02h1;" [io.close *print-pretty*])]) file :write :create :truncate (*linefeed* *directory-separator* *argv* that *print-pretty* *print-width* *print-readably*) *print-pretty*])
make-label
#function("n1d040;" [gensym])
make-enum-table
#function("n2b0d130p42;" [#function("q_d0d1f013131b2lr;" [1- length #function("n1d0f00f11e0Zf10e0t43;" [put!])]) table])
make-code-emitter
#function("n0^d030_Y3;" [table])
macroexpand-in
#function("n2e0?6;0e0;b0d1e0Me132p42;" [#function("qe06M0d0d1e031f00NQ2d2e03142;b3d4f0031p42;" [macroexpand-in cadr caddr #function("qe06F0d0e0f10NQ2f1142;f10Mb1<6T0f10;f10Mb2<6\x810d3b2d4f1031d0d5f1031f1132d6f103144;f10Mb7<6\xa30b8d4f1031d9d:f103131p43;d;b<lf1042;" [macroexpand-in quote lambda nlist* cadr caddr cdddr let-syntax #function("qd0e1d1d2b3le032f213242;" [macroexpand-in nconc map #function("n1e0Md0d1e031f3132f31L3;" [macroexpand-in cadr])]) f-body cddr map #function("n1d0e0f2142;" [macroexpand-in])]) macrocall?]) assq])
macroexpand-1
#function("n1e0?6;0e0;b0d1e031p42;" [#function("qe06?0e0f00Ns2;f00;" []) macrocall?])
macroexpand
#function("n1d0e0^42;" [macroexpand-in])
macrocall?
#function("n1e0MC16E02d0d1e0M]43;" [get *syntax-environment*])
lookup-sym
#function("n4e1A6;0b0;b1e1Mp42;" [(global) #function("qb0d1f00e0_33p42;" [#function("qe06M0f136C0b0e0L2;b1f12e0L3;d2f10f11Nf1317b02f00A6k0f125p0f12`t]44;" [arg closed lookup-sym]) index-of])])
load-process
#function("n1d0e041;" [eval])
load
#function("n1b0d1e0d232p42;" [#function("qb0lb1lm;" [#function("n0b0]p32]]]43;" [#function("qb0li0;" [#function("n3d0f1031@6R0f00d1f1031e0d2e13143;d3f10312d2e141;" [io.eof? read load-process io.close])])]) #function("n1d0f00312d1b2f10e0L341;" [io.close raise load-error])]) file :read])
list?
#function("n1e0A17I02e0F16I02d0e0N41;" [list?])
list-tail
#function("n2d0e1_326?0e0;d1e0Ne1`u42;" [<= list-tail])
list-ref
#function("n2d0e0e132M;" [list-tail])
list-partition
#function("n2b0]p42;" [#function("qb0li02d1f01_326I0d2b341;d4e0f00f01_^^3541;" [#function("n5e0?6O0d0e2_326L0d1e331e4K;e4;d2e2e1326o0f00e0e1_^d1e331e4K45;f00e0Ne1`e2te0Me3Ke445;" [> nreverse >=]) <= error "list-partition: invalid count" nreverse])])
list-head
#function("n2d0e1_326>0^;e0Md1e0Ne1`u32K;" [<= list-head])
list->vector
#function("n1d0e0s2;" [vector])
list*
#function("o0e0N?6=0e0M;e0Md0e0NQ2K;" [list*])
length>
#function("n2e1_W6<0e0;e1_V6N0e0F16M02e0;e0A6Y0e1_W;d0e0Ne1`u42;" [length>])
length=
#function("n2e1_W6;0];e1_V6F0e0A;e0A6Q0e1_V;d0e0Ne1`u42;" [length=])
lastcdr
#function("n1e0?6;0e0;d0e0N41;" [lastcdr])
last-pair
#function("n1e0?6;0e0;e0N?6E0e0;d0e0N41;" [last-pair])
just-compile-args
#function("n3d0b1le142;" [for-each #function("n1d0f00f02]e044;" [compile-in])])
iota
#function("n1d0d1e042;" [map-int identity])
io.readline
#function("n1d0e0b142;" [io.readuntil #\x000a])
index-of
#function("n3e1A6:0];e0e1M<6F0e2;d0e0e1Ne2`t43;" [index-of])
in-env?
#function("n2d0b1le142;" [any #function("n1d0f00e042;" [memq])])
identity
#function("n1e0;" [])
hex5
#function("n1d0d1e0a@32a5b243;" [string.lpad number->string #\0])
get-defined-vars
#function("n1d0f00e03141;" [delete-duplicates] #0=[#function("n1e0?6:0^;e0Mb0<16I02e0NF6\x8c0d1e031C16`02d1e031L117\x8b02d1e031F16\x8502d2e031C16\x8502d2e031L117\x8b02^;e0Mb3<6\xa40d4d5f00e0N32s2;^;" [define cadr caadr begin append map] #0#) ()])
for-each
#function("n2e1F6J0e0e1M312d0e0e1N42;\\;" [for-each])
foldr
#function("n3e2A6;0e1;e0e2Md0e0e1e2N3342;" [foldr])
foldl
#function("n3e2A6;0e1;d0e0e0e2Me132e2N43;" [foldl])
fits-i8
#function("n1e0I16O02d0e0a\xb03216O02d1e0a\xaf42;" [>= <=])
filter
#function("n2f00e0e1^43;" [] #0=[#function("n3e1A6;0e2;e0e1M316V0f00e0e1Ne1Me2K43;f00e0e1Ne243;" [] #0#) ()])
f-body
#function("n1b0f00e031p42;" [#function("qb0d1e031p42;" [#function("qe0A6;0f00;b0e0f00L3d1b2le032K;" [lambda map #function("n1];" [])]) get-defined-vars])] [#function("n1e0?6:0];e0N^<6F0e0M;b0e0K;" [begin]) ()])
expand
#function("n1d0e041;" [macroexpand])
every
#function("n2e1?17O02e0e1M3116O02d0e0e1N42;" [every])
even?
#function("n1d0e0`32_V;" [logand])
eval
#function("n1d0d1e0313140;" [compile-thunk expand])
error
#function("o0d0b1e0K41;" [raise error])
encode-byte-code
#function("n1b0d1d2e03131p42;" [#function("qb0d1d2e031a3d3b4le032T2tb532p42;" [#function("qb0d1f0031p42;" [#function("qb0d1e031_d230d230d330]p47;" [#function("q]e1e0W6\xbc02f00e1Zi52e5d0<6k0d1e2f00e1`tZd2e431332e1a2ti15\xb90d3e4d4d5d6f1016\x8502d7e5b8326\x920b9e5p325\x940e53231322e1`ti12e1e0W6\xb80b:f00e1Zp325\xb90]5202d;b<le3322d=e441;" [:label put! sizeof io.write byte get Instructions memq (:jmp :brt :brf) #function("qe0d0=6<0d1;e0d2=6G0d3;e0d4=6R0d5;];" [:jmp :jmp.l :brt :brt.l :brf :brf.l]) #function("qb0f05p42;" [#function("qd0e0b1326T0d2f14d3f0031322f11`tj11;d0e0b4326w0d2f14d5f0031322f11`tj11;d0e0b6326\xb60d2f14d5f0031322f11`tj112d2f14d5f20f11Z31322f11`tj11;d0e0b7326\xf40d8f13d9f1431f00332d2f14f306\xe30d35\xe50d:_31322f11`tj11;];" [memv (:loadv.l :loadg.l :setg.l) io.write uint32 (:loada :seta :call :tcall :loadv :loadg :setg :list :+ :- :* :/ :vector :argc :vargc :loadi8 :apply :tapply) uint8 (:loadc :setc) (:jmp :brf :brt) put! sizeof uint16])]) table.foreach #function("n2d0f04e0322d1f04f206L0d25N0d3d4f02e1323142;" [io.seek io.write uint32 uint16 get]) io.tostring!]) length table buffer]) list->vector]) >= length count #function("n1d0e0b142;" [memq (:loadv :loadg :setg :jmp :brt :brf)]) 65536]) peephole nreverse])
emit-nothing
#function("n1e0;" [])
emit
#function("o2d0e1b1326I0b2e0`Zp325J0]2e0_d3e1e2Ke0_Z32[2e0;" [memq (:loadv :loadg :setg) #function("qb0f00a2Zp42;" [#function("qb0f12Mp42;" [#function("qb0d1f10e0326K0d2f10e0325f0d3f10e0f00332f00`tj002f00`up42;" [#function("qf30a2f10[2e0L1j322d0e0b1326Z0b2f31p32j31;];" [>= 256 #function("qe0d0=6<0d1;e0d2=6G0d3;e0d4=6R0d5;];" [:loadv :loadv.l :loadg :loadg.l :setg :setg.l])]) has? get put!])])]) nreconc])
display
#function("n1d0e0312\\;" [princ])
disassemble
#function("o1e1A6J0d0e0_322d1302\\;5K0]2b2e1Md3e031d4e031p44;" [disassemble newline #function("qb0]p42;" [#function("qb0li02b1_d2f0131p43;" [#function("n1e0J16>02e0G@6T0d0b1312d2e0f10`t42;d3e041;" [princ "\n" disassemble print]) #function("q]e0e1W6M02b0d1b2l]d333p32520;" [#function("qd0f00_326C0d1305D0]2_f20`ub2lr2d3d4f0031b5d6d7e031`32b8342f00`tj002b9e0p42;" [> newline #function("n1d0b141;" [princ "\t"]) princ hex5 ":  " string.tail string "\t" #function("qd0e0b1326Z0f20f32d2f31f1032Z312f10a4tj10;d0e0b3326\x7f0f20f32f31f10ZZ312f10`tj10;d0e0b4326\xa30d5d6f31f10Z31312f10`tj10;d0e0b7326\xe20d5d6f31f10Z31b8322f10`tj102d5d6f31f10Z31312f10`tj10;d0e0b9326\x0c0d5b:d;d<f31f103231322f10a2tj10;d0e0b=32661d5b:d;d2f31f103231322f10a4tj10;];" [memv (:loadv.l :loadg.l :setg.l) ref-uint32-LE (:loadv :loadg :setg) (:loada :seta :call :tcall :list :+ :- :* :/ :vector :argc :vargc :loadi8 :apply :tapply) princ number->string (:loadc :setc) " " (:jmp :brf :brt) "@" hex5 ref-uint16-LE (:jmp.l :brf.l :brt.l)])]) table.foldl #function("n3e217J02e1f21f00Z<16J02e0;" []) Instructions]) length])]) function:code function:vals])
delete-duplicates
#function("n1e0?6;0e0;b0e0Me0Np43;" [#function("qd0e0e1326C0d1e141;e0d1e131K;" [member delete-duplicates])])
count
#function("n2b0]p42;" [#function("qb0li02e0f00f01_43;" [#function("n3e1A6;0e2;f00e0e1Ne0e1M316T0e2`t5V0e243;" [])])])
copy-tree
#function("n1e0?6;0e0;d0e0M31d0e0N31K;" [copy-tree])
copy-list
#function("n1e0?6;0e0;e0Md0e0N31K;" [copy-list])
const-to-idx-vec
#function("n1b0d1e0a2Z31p42;" [#function("qd0b1lf00`Z322e0;" [table.foreach #function("n2f00e1e0[;" [])]) vector.alloc])
cond-clauses->if
#function("n1e0?6:0];b0e0Mp42;" [#function("qe0Mb0<17A02e0M\\<6K0b1e0NK;b2e0Mb1e0NKd3f00N31L4;" [else begin if cond-clauses->if])])
cond->if
#function("n1d0e0N41;" [cond-clauses->if])
compile-while
#function("n4b0d1e031d1e031p43;" [#function("qd0f00f01]]342d1f00e0322d0f00f01]f02342d2f00d3e1332d2f00d4322d0f00f01]f03342d2f00d5e0332d1f00e142;" [compile-in mark-label emit :brf :pop :jmp]) make-label])
compile-thunk
#function("n1d0b1^e0L341;" [compile lambda])
compile-sym
#function("n4b0d1e2e1_\\34p42;" [#function("qb0e0Mp42;" [#function("qe0b0=6M0d1f10f13_Zd2f003143;e0b3=6p0d1f10f13`Zd2f0031d4f003144;d1f10f13a2Zf1243;" [arg emit cadr closed caddr])]) lookup-sym])
compile-short-circuit
#function("n6e3?6E0d0e0e1e2e444;e3N?6Z0d0e0e1e2e3M44;b1d2e031p42;" [compile-in #function("qd0f00f01]f03M342d1f00d2322d1f00f05e0332d1f00d3322d4f00f01f02f03Nf04f05362d5f00e042;" [compile-in emit :dup :pop compile-short-circuit mark-label]) make-label])
compile-prog1
#function("n3d0e0e1]d1e231342d2e231F6e0d3e0e1]d2e231342d4e0d542;];" [compile-in cadr cddr compile-begin emit :pop])
compile-or
#function("n4d0e0e1e2e3]d146;" [compile-short-circuit :brt])
compile-let
#function("n4b0e3Me3Np43;" [#function("qd0e1d1d2e03131326H0]5T0d3d4b5e032312d6f00d7d8f01e0\\33332b9d:f00f01e133p42;" [length= length cadr error string "apply: incorrect number of arguments to " emit :loadv compile-f #function("qd0f10d1322d0f10f126K0d25M0d3`e0t43;" [emit :copyenv :tcall :call]) compile-arglist])])
compile-in
#function("n4e3C6E0d0e0e1e3b144;e3?6\xba0e3_<6[0d2e0d342;e3`<6k0d2e0d442;e3\\<6{0d2e0d542;e3]<6\x8b0d2e0d642;e3^<6\x9b0d2e0d742;d8e3316\xaf0d2e0d9e343;d2e0d:e343;b;e3Mp42;" [compile-sym [:loada :loadc :loadg] emit :load0 :load1 :loadt :loadf :loadnil fits-i8 :loadi8 :loadv #function("qe0b0=6J0d1f00d2d3f033143;e0b4=6g0d5f00f01f02d6f033144;e0b7=6\x800d8f00f01f02f0344;e0b9=6\x9a0d:f00f01f02f03N44;e0b;=6\xb00d<f00f01f0343;e0b==6\xd60d1f00d2d>f01f0332332d1f00d?42;e0b@=6\xf00dAf00f01f02f03N44;e0bB=6\x0a0dCf00f01f02f03N44;e0bD=6.0dEf00f01d3f0331b9dFf0331K44;e0bG=6V1dHf00f01d3f0331dIf0331dJf033145;e0bK=6{1d5f00f01\\d3f0331342d1f00dL42;e0bM=6\xaa1d5f00f01]dIf0331342dNf00f01d3f0331bO44;e0bP=6\x001d5f00f01]b=^d3f0331L3342dQdIf0331316\xdc1]5\xe21dRbS312d5f00f01]dIf0331342d1f00dT42;dUf00f01f02f0344;" [quote emit :loadv cadr cond compile-in cond->if if compile-if begin compile-begin prog1 compile-prog1 lambda compile-f :closure and compile-and or compile-or while compile-while cddr for compile-for caddr cadddr return :ret set! compile-sym [:seta :setc :setg] trycatch 1arg-lambda? error "trycatch: second form must be a 1-argument lambda" :trycatch compile-app])])
compile-if
#function("n4b0d1e031d1e031p43;" [#function("qd0f00f01]d1f0331342d2f00d3e0332d0f00f01f02d4f0331342f026w0d2f00d5325\x820d2f00d6e1332d7f00e0322d0f00f01f02d8f0331F6\xad0d9f03315\xae0]342d7f00e142;" [compile-in cadr emit :brf caddr :ret :jmp mark-label cdddr cadddr]) make-label])
compile-for
#function("n5d0e4316h0d1e0e1]e2342d1e0e1]e3342d1e0e1]e4342d2e0d342;d4b541;" [1arg-lambda? compile-in emit :for error "for: third form must be a 1-argument lambda"])
compile-f
#function("o2b0d130d2e131p43;" [#function("qf02A@6D0d0e0d1325w0d2e131A6_0d0e0d3d4e131335w0d0e0d5e1?6o0_5u0d4e131332d6e0d7e131f00K\\d8f0131342d0e0d9322d:d;e0_Z31d<e03142;" [emit :let lastcdr :argc length :vargc compile-in to-proper caddr :ret function encode-byte-code const-to-idx-vec]) make-code-emitter cadr])
compile-call
#function("n4b0e3Mp42;" [#function("qb0e0C16d02d1e0f0132@16d02e0E16d02d2e03116d02d3e031G6p0d3e0315r0e0p42;" [#function("qb0e0G16A02d1e031p42;" [#function("qe0@6H0d0f20f21]f00345I0]2b1d2f20f21f23N33p42;" [compile-in #function("qf006G0b0d1d2f00]33p42;d3f30f326W0d45Y0d5e043;" [#function("qe016C02d0f43Ne032@6R0d1f20e0325S0]2b2f10p42;" [length= argc-error #function("qe0d0=6Y0f10_V6K0d1f50d242;d1f50f20f1043;e0d3=6\x940f10_V6s0d1f50d442;f10a2V6\x860d1f50d542;d1f50f20f1043;e0d6=6\xe00f10_V6\xad0d7f30`42;f10`V6\xbf0d1f50d842;f10a2V6\xd20d1f50d942;d1f50f20f1043;e0d:=6\x080f10_V6\xfa0d1f50d;42;d1f50f20f1043;e0d<=6/0f10_V6!0d7f30`42;d1f50f20f1043;e0d==6Y1f10_V6K1d1f50d>b?43;d1f50f20f1043;e0d@=6\x8c1f10a2W6t1d7f30a242;d1f50f526\x841dA5\x861d@f1043;d1f50f2042;" [:list emit :loadnil :+ :load0 :add2 :- argc-error :neg :sub2 :* :load1 :/ :vector :loadv [] :apply :tapply])]) get arg-counts emit :tcall :call]) compile-arglist]) builtin->instruction]) in-env? constant? top-level-value])])
compile-begin
#function("n4e3?6D0d0e0e1e2]44;e3N?6Y0d0e0e1e2e3M44;d0e0e1]e3M342d1e0d2322d3e0e1e2e3N44;" [compile-in emit :pop compile-begin])
compile-arglist
#function("n3b0d1e2d232p42;" [#function("qe06g0d0f00d1f02d232f01332b3d4d5b6ld7e0d23232Kp322d2`t;d0f00f02f01332d8f0241;" [just-compile-args list-head MAX_ARGS #function("qd0f10f11]e044;" [compile-in]) nconc map #function("n1d0e0K;" [list]) list-partition length]) length> MAX_ARGS])
compile-app
#function("n4b0e3Mp42;" [#function("qe0F16N02e0Mb0<16N02d1d2e031316b0d3f00f01f02f0344;d4f00f01f02f0344;" [lambda list? cadr compile-let compile-call])])
compile-and
#function("n4d0e0e1e2e3\\d146;" [compile-short-circuit :brf])
compile
#function("n1d0^e042;" [compile-f])
char?
#function("n1d0e031b1<;" [typeof wchar])
cddr
#function("n1e0NN;" [])
cdddr
#function("n1e0NNN;" [])
cddar
#function("n1e0MNN;" [])
cdar
#function("n1e0MN;" [])
cdadr
#function("n1e0NMN;" [])
cdaar
#function("n1e0MMN;" [])
cadr
#function("n1e0NM;" [])
caddr
#function("n1e0NNM;" [])
cadddr
#function("n1e0NNNM;" [])
cadar
#function("n1e0MNM;" [])
caar
#function("n1e0MM;" [])
caadr
#function("n1e0NMM;" [])
caaar
#function("n1e0MMM;" [])
builtin->instruction
#function("n1b0d1d2b3e03231p42;" [#function("qd0d1e03216@02e0;" [has? Instructions]) intern string #\:])
bq-process
#function("n1d0e0316T0e0H6Q0b1d2d3e03131p42;e0;e0?6a0b4e0L2;e0Mb5<6y0d2d2d6e0313141;e0Mb7<6\x890d6e041;d8d9e032@6\xa90b:d;e031d<d=e032p43;b>e0^p43;" [self-evaluating? #function("qe0Mb0<6A0d1e0NK;d2d1e0L3;" [list vector apply]) bq-process vector->list quote backquote cadr *comma* any splice-form? #function("qe0A6=0b0e1K;d1b2e1Kd3e031L142;" [list nconc nlist* bq-process]) lastcdr map bq-bracket1 #function("q]e0F16A02e0Mb0<@6Z02d1e0M31e1Ki12e0Ni05202b2e0F6t0d3e1d4e031L1325\x910e0A6\x830d5e1315\x910d3e1d6e031L132p42;" [*comma* bq-bracket #function("qe0NA6<0e0M;b0e0K;" [nconc]) nreconc cadr nreverse bq-process])])
bq-bracket1
#function("n1e0F16@02e0Mb0<6J0d1e041;d2e041;" [*comma* cadr bq-process])
bq-bracket
#function("n1e0?6C0d0d1e031L2;e0Mb2<6W0d0d3e031L2;e0Mb4<6k0b5d3e031L2;e0Mb6<6{0d3e041;d0d1e031L2;" [list bq-process *comma* cadr *comma-at* copy-list *comma-dot*])
assv
#function("n2e1?6:0];d0e131e0=6J0e1M;d1e0e1N42;" [caar assv])
assoc
#function("n2e1?6:0];d0e131e0>6J0e1M;d1e0e1N42;" [caar assoc])
array?
#function("n1e0H17E02b0d1e031p42;" [#function("qe0F16?02e0Mb0<;" [array]) typeof])
argc-error
#function("n2d0d1b2e0b3e1e1`V6J0b45L0b53541;" [error string "compile error: " " expects " " argument." " arguments."])
arg-counts
#table(:not 1  :set-cdr! 2  :cons 2  :number? 1  :equal? 2  :cdr 1  :vector? 1  :eqv? 2  := 2  :atom? 1  :aref 2  :compare 2  :< 2  :null? 1  :eq? 2  :car 1  :set-car! 2  :builtin? 1  :aset! 3  :bound? 1  :boolean? 1  :pair? 1  :symbol? 1  :fixnum? 1)
append2
#function("n2e0A6;0e1;e0Md0e0Ne132K;" [append2])
append
#function("o0e0A6:0^;e0NA6E0e0M;d0e0Md1e0NQ242;" [append2 append])
any
#function("n2e1F16O02e0e1M3117O02d0e0e1N42;" [any])
abs
#function("n1e0_W6=0e0v;e0;" [])
__start
#function("n1d0302e0NF6Q0e0Nh12d2d3e031315a0e0h12d4d5312d6302d7_41;" [__init_globals *argv* __script cadr princ *banner* repl exit])
__script
#function("n1b0lb1lm;" [#function("n0d0f0041;" [load]) #function("n1d0e0312d1`41;" [print-exception exit])])
__init_globals
#function("n0d0b1<17K02d0b2<17K02d0b3<6Z0b4h52b6h75c0b8h52b9h72d:h;2d<h=2d>h?;" [*os-name* win32 win64 windows "\\" *directory-separator* "\r\n" *linefeed* "/" "\n" *stdout* *output-stream* *stdin* *input-stream* *stderr* *error-stream*])
MAX_ARGS
127
Instructions
#table(:sub2 69  :nop 0  :set-cdr! 32  :/ 37  :setc 58  :tapply 67  :cons 27  dummy_nil 73  :equal? 14  :cdr 30  :call 3  :eqv? 13  := 38  :setg.l 59  :list 28  :atom? 15  :aref 42  :load0 47  :let 65  dummy_t 71  :argc 62  :< 39  :null? 17  :loadg 52  :load1 48  :car 29  :brt.l 10  :vargc 63  :loada 53  :set-car! 31  :setg 56  :aset! 43  :bound? 21  :pair? 22  :symbol? 19  :fixnum? 25  :loadi8 49  :not 16  :* 36  :neg 70  :pop 2  :loadnil 46  :brf 6  :vector 41  :- 35  :loadv 50  :closure 60  dummy_f 72  :number? 20  :trycatch 61  :add2 68  :loadv.l 51  :vector? 24  :brf.l 9  :seta 57  :apply 33  :dup 1  :copyenv 64  :for 66  :loadc 54  :compare 40  :eq? 12  :function? 26  :+ 34  :jmp 5  :loadt 44  :brt 7  :builtin? 23  :loadg.l 55  :tcall 4  :ret 11  :boolean? 18  :loadf 45  :jmp.l 8)
>=
#function("n2e1e0W17A02e0e1V;" [])
>
#function("n2e1e0W;" [])
<=
#function("n2e0e1W17A02e0e1V;" [])
1arg-lambda?
#function("n1e0F16e02e0Mb0<16e02e0NF16e02d1e031F16e02d2d1e031`42;" [lambda cadr length=])
1-
#function("n1e0`u;" [])
1+
#function("n1e0`t;" [])
/=
#function("n2e0e1V@;" [])
*whitespace*
"\t\n\v\f\r \u0085  ᠎           \u2028\u2029  　"
*syntax-environment*
#table(define #function("o1e0C6B0b0e0e1ML3;b0e0Mb1e0Nd2e131L3L3;" [set! lambda f-body])  letrec #function("o1b0d1d2e032d3d4d1b5le032e13231L3d1b6le032K;" [lambda map car f-body nconc #function("n1b0e0K;" [set!]) #function("n1];" [])])  backquote #function("n1d0e041;" [bq-process])  assert #function("n1b0e0\\b1b2b3e0L2L2L2L4;" [if raise quote assert-failed])  label #function("n2b0e0L1b1e0e1L3L3]L2;" [lambda set!])  do #function("o2b0d130e1Md2d3e032d2d4e032d2b5le032p46;" [#function("qb0e0b1e2b2e1d3b4L1d5f01N3132d3b4L1d5f0231d3e0L1d5e43132L133L4L3L2L1d3e0L1d5e33132L3;" [letrec lambda if nconc begin copy-list]) gensym map car cadr #function("n1d0e031F6C0d1e041;e0M;" [cddr caddr])])  when #function("o1b0e0d1e131]L4;" [if f-body])  dotimes #function("o1b0e0Md1e031p43;" [#function("qb0_b1e1`L3b2e0L1d3f0131L3L4;" [for - lambda f-body]) cadr])  unwind-protect #function("n2b0d130d130p43;" [#function("qb0e1b1^f01L3L2L1b2b3f00b1e0L1b4e1L1b5e0L2L3L3L3e1L1L3L3;" [let lambda prog1 trycatch begin raise]) gensym])  define-macro #function("o1b0b1e0ML2b2e0Nd3e131L3L3;" [set-syntax! quote lambda f-body])  unless #function("o1b0e0]d1e131L4;" [if f-body])  let #function("o1b0]p42;" [#function("qf00C6P0f00i02f01Mj002f01Nj015Q0]2b0b1d2b3lf0032d4f0131L3d2b5lf0032p43;" [#function("qf006C0b0f00e0L35E0e0e1K;" [label]) lambda map #function("n1e0F6<0e0M;e0;" []) f-body #function("n1e0F6?0d0e041;];" [cadr])])])  throw #function("n2b0b1b2b3L2e0e1L4L2;" [raise list quote thrown-value])  time #function("n1b0d130p42;" [#function("qb0e0b1L1L2L1b2f00b3b4b5b1L1e0L3b6L4L3L3;" [let time.now prog1 princ "Elapsed time: " - " seconds\n"]) gensym])  let* #function("o1e0?6?0d0e141;b1d2e031L1d3b4L1e0NL1d5e13133L3d6e031L2;" [f-body lambda caar nconc let* copy-list cadar])  case #function("o1b0]p42;" [#function("qb0li02b1d230p42;" [#function("n2e1b0<6=0b0;e1A6E0];e1?6X0b1e0d2e131L3;e1NA6m0b1e0d2e1M31L3;b3e0b4e1L2L3;" [else eqv? quote-value memv quote]) #function("qb0e0f10L2L1d1b2L1d3d4b5lf11323132L3;" [let nconc cond copy-list map #function("n1f10f00e0M32e0NK;" [])]) gensym])])  catch #function("n2b0d130p42;" [#function("qb0f01b1e0L1b2b3b4e0L2b5b6e0L2b7b8L2L3b5b9e0L2f00L3L4b:e0L2b;e0L2L4L3L3;" [trycatch lambda if and pair? eq car quote thrown-value cadr caddr raise]) gensym]))
*banner*
";  _\n; |_ _ _ |_ _ |  . _ _\n; | (-||||_(_)|__|_)|_)\n;-------------------|----------------------------------------------------------\n\n"