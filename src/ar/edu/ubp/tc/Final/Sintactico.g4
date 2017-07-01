
grammar Sintactico;

fragment NUMERO:[0-9];
fragment LETRA:[a-zA-Z];
fragment SIGNO: ('-'|'+');
ENTERO: SIGNO? NUMERO+;
FLOTANTE: ENTERO ('.'NUMERO+)?;
TIPODEDATO:('int'|'void'|'float'|'double'|'bool'|'char');


TIPO_INT: 'int';
TIPO_FLOAT:'float';
TIPO_DOUBLE:'double';
TIPO_BOOL:'bool';
TIPO_CHAR:'char';

CARACTER: '\''LETRA'\'';
CADENA: '"'(LETRA|NUMERO)*'"';
PARA:'for' ;
SI:'if';
MIENTRAS:'while';
HACER:'do';
SINO:'else';
SWITC:'switch';
CASO:'case';
RETURNO:'return';
ID:(LETRA|'_')((LETRA|NUMERO|'_')+)?;
OPLOGICAS:('&&'|'||'|'!');
COMPARACIONES:('=='|'!='|'<='|'>='|'<'|'>');
OPMATEMATICAS:('+'|'-'|'*'|'/'|'%'|'++'|'--');
ASIGNACION:('='|'-='|'+='|'*='|'/=');
PUNTOYCOMA:';';
COMA:',';
CORCHETEA: '[';
CORCHETEC: ']';
PARENTESISA: '(';
PARENTESISC: ')';
LLAVEA:'{';
LLAVEC: '}';
VALOR:(ENTERO|FLOTANTE|CARACTER|CADENA|TRUEFALSE);
TRUEFALSE: ('true'|'false');
WS:[ \n\u000D]->skip;

codigo: instrucciones+;

instrucciones:  declaracion
             ;

declaracion: funcion
             |(declarar_variables | declarar_funcion | variable) PUNTOYCOMA
             | faltapuntoycoma
             | faltaparentesis
             ;

instruccion: 
            (declarar_variables | variable | llamada_funcion | operacion) PUNTOYCOMA
           | estructuras_de_control
           | faltapuntoycoma2
           | faltaparentesis2
           ;

faltapuntoycoma: declarar_variables 
                | declarar_funcion 
                | variable 
                ;

faltapuntoycoma2: declarar_variables 
                | variable 
                | llamada_funcion
                | operacion
                ;

faltaparentesis: TIPODEDATO ID (parametros_funcion)? PARENTESISC PUNTOYCOMA
               | TIPODEDATO ID (declarar_variables)? PARENTESISC bloque
               | TIPODEDATO ID (parametros_funcion_decl)? PARENTESISC bloque
               | TIPODEDATO ID PARENTESISA (parametros_funcion)? PUNTOYCOMA
               | TIPODEDATO ID PARENTESISA (declarar_variables)? bloque
               | TIPODEDATO ID PARENTESISA (parametros_funcion_decl)? bloque 
               ;

faltaparentesis2: ID (ID (COMA ID)*)? PARENTESISC PUNTOYCOMA
                |   ( MIENTRAS condicion PARENTESISC
                     | PARA ID ASIGNACION (ENTERO|ID) PUNTOYCOMA condicion  PUNTOYCOMA variable PARENTESISC) (instruccion | bloque)
                | ID PARENTESISA (ID (COMA ID)*)?  PUNTOYCOMA
                |   ( MIENTRAS PARENTESISA condicion 
                     | PARA PARENTESISA ID ASIGNACION (ENTERO|ID) PUNTOYCOMA condicion  PUNTOYCOMA variable) (instruccion | bloque)
                | SI PARENTESISA condicion  (instruccion|bloque) (SINO (instruccion | bloque))?
                | SI condicion PARENTESISC (instruccion|bloque) (SINO (instruccion | bloque))?
                ;

datos:  llamada_funcion
     | llamada_funcion_mal
     | ( FLOTANTE
       | CARACTER
       | ENTERO
       | TRUEFALSE
       | ID)
       ;

operacion : datos OPMATEMATICAS (datos)? ;

asignacion: ASIGNACION (operacion+|datos); // = 3 | = valor

variable: ID (asignacion)?  ; // a (= 3) | b

parametros_funcion: (TIPODEDATO ID?) (COMA TIPODEDATO ID?)*
                    |parametros_funcion_mal
                    ;

parametros_funcion_mal: TIPODEDATO ID? (COMA TIPODEDATO ID?)* (TIPODEDATO ID?) (COMA TIPODEDATO ID?)* ;

declarar_variables:  TIPODEDATO variable (COMA variable)* 
                  | declarar_variable_mal 
                  ;

declarar_funcion: TIPODEDATO ID PARENTESISA (parametros_funcion)? PARENTESISC; 

declarar_variable_mal: TIPODEDATO variable (COMA variable)* variable (COMA variable)* ;

declarar_variable_mal_tipo: TIPO_INT ID (ASIGNACION (FLOTANTE|CARACTER|TRUEFALSE))//? (COMA ID ASIGNACION (FLOTANTE|CARACTER|TRUEFALSE))?
                          | TIPO_CHAR ID (ASIGNACION (FLOTANTE|ENTERO|TRUEFALSE))? (COMA ID ASIGNACION (FLOTANTE|ENTERO|TRUEFALSE))?
                          | (TIPO_DOUBLE|TIPO_FLOAT) ID (ASIGNACION (ENTERO|CARACTER|TRUEFALSE))? (COMA ID ASIGNACION (ENTERO|CARACTER|TRUEFALSE))?
                          | TIPO_BOOL ID (ASIGNACION (FLOTANTE|CARACTER|ENTERO))? (COMA ID ASIGNACION (FLOTANTE|CARACTER|ENTERO))?
                          ;


parametros_funcion_decl: (TIPODEDATO variable) (COMA TIPODEDATO variable)*;

funcion: TIPODEDATO ID PARENTESISA (parametros_funcion_decl)? PARENTESISC (bloque_mal | bloque);

llamada_funcion: ID PARENTESISA (ID (COMA ID)*)? PARENTESISC 
               | llamada_funcion_mal
               ;

llamada_funcion_mal: ID (ID (COMA ID)*)? PARENTESISC 
                   | ID PARENTESISA (ID (COMA ID)* ID (COMA ID)*)? PARENTESISC 
                   | ID PARENTESISA (ID (COMA ID)*)?  
                   ;

bloque: LLAVEA instruccion* (returno)? LLAVEC ;
bloque_mal: LLAVEA instruccion* (returno)? instruccion*; //Agregar * luego de instruccion

returno: RETURNO datos PUNTOYCOMA
       | returno_mal
       ;

returno_mal: RETURNO (datos|PUNTOYCOMA)?;

condicion: PARENTESISA? OPLOGICAS? (TRUEFALSE | (datos) COMPARACIONES (datos)) (OPLOGICAS condicion)? PARENTESISC? (OPLOGICAS condicion)?;

estructuras_de_control: ( si | mientras | para) (instruccion | bloque)
                        | (si_entonces)
                        ;

si : SI PARENTESISA condicion PARENTESISC;

mientras : MIENTRAS PARENTESISA condicion PARENTESISC;

para: PARA PARENTESISA ID ASIGNACION (ENTERO|ID) PUNTOYCOMA condicion  PUNTOYCOMA variable PARENTESISC;
                      
sino: SINO;

si_entonces: si (instruccion|bloque) sino (instruccion|bloque);
