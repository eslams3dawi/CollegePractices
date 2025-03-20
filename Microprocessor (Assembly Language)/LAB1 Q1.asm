ORG 100H
;a
MOV [0160H], 'n'
MOV [0160H + 1], 'e'
MOV [0160H + 2], 'w'
  
;b
MOV DH, 0ABH
MOV BL, 22H

;c
MOV DI, 0260H
MOV BYTE PTR [DI, 30H], 11H
MOV BYTE PTR [DI, 30H + 1], 33H

;d
INC BYTE PTR [DI + 30H]
DEC DH

;e        
MOV CH, BL 
ADD CH, DH

;f                         
MOV AL, BYTE PTR [DI + 30H]
SUB AL, CH
                              
;g
NOT AL
OR BL, 11000000B
AND BL, 01110101B 
XOR BL, 00000011B   

;00000000
;76543210
;01110101
;00000011  

;h
MOV BL, AL       ;AL = 10H, BL =  , [DI+30H] = 5H
MOV AL, [DI + 30H]
MOV [DI + 30H], BL
                          
;ANOTHER SOLVE
XCHG AL, BYTE PTR [DI + 30H]




