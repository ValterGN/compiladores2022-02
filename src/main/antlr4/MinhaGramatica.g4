grammar MinhaGramatica;

fragment LETRA: [a-zA-Z];
fragment ALFANUM: [a-zA-Z0-9];
fragment DIGITO: [0-9];
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
WS: [ \r\t\n]* ->skip;
ID: LETRA(ALFANUM)*;
ConstINT: (DIGITO)+;
ConstREAL: (DIGITO)+'.'(DIGITO)+;
ConstSTRING: '"'(ALFANUM)+'"';
ErrorChar: . ;
LAMBDA: ;

comando : expressao comando | expressao;
expressao: declaracaoVar | condicional | repeticao | atribuicao;

declaracaoVar: Tipo Id ';';
condicional: 'if' AParenteses expressaoLogica FParenteses AChave expressao FChave condicionalSenao;
condicionalSenao: 'else' AChave expressao FChave | LAMBDA;

repeticao: 'while' AParenteses expressaoLogica FParenteses AChave expressao FChave;

expressaoLogica: ID OpRel ID | expressaoLogicaString | expressaoLogicaInt | expressaoLogicaReal;
expressaoLogicaString: ID OpRel ConstSTRING | ConstSTRING OpRel ID | ID OpRel ID;
expressaoLogicaInt: ID OpRel ConstINT | ConstINT OpRel ID | ID OpRel ID;
expressaoLogicaReal: ID OpRel ConstREAL | ConstREAL OpRel ID | ID OpRel ID;

atribuicao: atribuicaoString | atribuicaoInt | atribuicaoReal;

atribuicaoString: ID OpIgual ConstSTRING ';';
atribuicaoInt: ID OpIgual ConstINT ';' | ID OpIgual expressaoAritInt ';';
atribuicaoReal: ID OpIgual ConstREAL ';' | ID OpIgual expressaoAritReal ';';

expressaoAritInt: ConstINT OpArit ConstINT | ID OpArit ConstINT | ConstINT OpArit ID | ID OpArit ID;
expressaoAritReal: ConstREAL OpArit ConstREAL | ID OpArit ConstREAL | ConstREAL OpArit ID | ID OpArit ID;