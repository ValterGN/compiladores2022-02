grammar MinhaGramatica;

PalavraChave: 'if' | 'else' | 'while' | 'func' | 'proc' | 'return' | 'IN' | 'OUT' | ';';
Tipo: 'int' | 'double' | 'bool' | 'string';
OpArit: '+' | '-' | '*' | '/' | '%' | '**' | '=';
OpRel: '>' | '<' | '>=' | '<=' | '==' | '!=';
AChave: '{';
FChave: '}';
AParenteses: '(';
FParenteses: ')';
AComentario: '/*';
FComentario: '*/';
Id: LETRA(ALFANUM)*;
ConstINT: (DIGITO)+;
ConstREAL: (DIGITO)+'.'(DIGITO)+;
ConstSTRING: '"'(ALFANUM)+'"';
WS: [ \r\t\n]* ->skip;

fragment LETRA: [a-zA-Z];
fragment ALFANUM: [a-zA-Z0-9];
fragment DIGITO: [0-9];