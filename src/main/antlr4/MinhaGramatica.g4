grammar MinhaGramatica;

fragment LETRA: [a-zA-Z];
fragment ALFANUM: [a-zA-Z0-9];
fragment DIGITO: [0-9];
PalavraChave: 'if' | 'else' | 'while' | 'func' | 'proc' | 'return' | 'IN' | 'OUT' | ';';
Tipo: 'int' | 'double' | 'bool' | 'string';
BOOLEAN: 'true' | 'false';
OpArit: '+' | '-' | '*' | '/' | '%' | '**' | '=';
OpRel: '>' | '<' | '>=' | '<=' | '==' | '!=';
AChave: '{';
FChave: '}';
AParenteses: '(';
FParenteses: ')';
AComentario: '/*';
FComentario: '*/';
WS: [ \r\t\n]* ->skip;
ID: LETRA(ALFANUM)*;
ConstINT: (DIGITO)+;
ConstREAL: (DIGITO)+'.'(DIGITO)+;
ConstSTRING: '"'(ALFANUM)+'"';
ErrorChar: . ;
LAMBDA: ;

bloco: (comando)+;
comando : declaracaoVar | condicional | repeticao | atribuicao | entrada | saida | comentario |
funcao| procedimento;
comentario: AComentario (ConstSTRING)* FComentario;
entrada: ID '=' 'IN' ';';
saida: 'OUT' '=' expressao ';';
expressao: (AParenteses)* '!'* termo (FParenteses)* ((OpArit| OpRel) expressao)*;
termo: ConstREAL | ConstINT | ConstSTRING | ID | BOOLEAN;
declaracaoVar: Tipo ID ';';
condicional: 'if' AParenteses expressao FParenteses AChave bloco FChave condicionalSenao;
condicionalSenao: 'else' AChave bloco FChave | LAMBDA;
repeticao: 'while' AParenteses expressao FParenteses AChave bloco FChave;
funcao: 'func' Tipo ID AParenteses parametros FParenteses AChave corpoFuncao FChave;
parametros: Tipo ID ';' | Tipo ID;
corpoFuncao: comando corpoFuncao | comando 'return' expressao ';';
procedimento: 'proc' ID AParenteses parametros FParenteses AChave corpoProcedimento FChave;
corpoProcedimento: comando corpoFuncao | comando;
atribuicao: ID '=' expressao ';';