grammar MinhaGramatica;

fragment LETRA: [a-zA-Z];
fragment ALFANUM: [a-zA-Z0-9];
fragment DIGITO: [0-9];

palavraChave: 'if' | 'else' | 'while' | 'func' | 'proc' | 'return' | 'IN' | 'OUT' | ';';
tipo: 'int' | 'double' | 'bool' | 'string';
opArit: '+' | '-' | '*' | '/' | '%' | '**' | '=';
opRel: '>' | '<' | '>=' | '<=' | '==' | '!=';
aChave: '{';
fChave: '}';
aParenteses: '(';
fParenteses: ')';
aComentario: '/*';
fComentario: '*/';
WS: [ \r\t\n]* ->skip;
id: LETRA(ALFANUM)*;
constINT: (DIGITO)+;
constREAL: (DIGITO)+'.'(DIGITO)+;
constSTRING: '"'(ALFANUM)+'"';