ORG 100H

MOV AX, 0800H
MOV DS, AX   


MOV SI, 0400H 
LEA SI, BLOCK1
MOV AL, 41H
MOV CX, 26

FILL_UPPERCASE:
MOV [SI], AL
INC AL
INC SI
LOOP FILL_UPPERCASE


LEA DI, BLOCK2
MOV AL, 61H
MOV CX, 26

FILL_LOWERCASE                                     :
MOV [SI], AL
INC AL
INC SI
LOOP FILL_LOWERCASE

          

LEA SI, BLOCK1
LEA DI, BLOCK2          
MOV CX, 26
              
EXCHANGE:
MOV AL, [SI]   ; AL = A
XCHG [DI], AL  ; DI = a, AL = A THEN DI = A, AL = a
MOV [SI], AL   ;                THEN SI = a      
INC SI
INC DI
LOOP EXCHANGE    
              
              


RET
BLOCK1 DB 26 DUP(?) 
BLOCK2 DB 26 DUP(?)