ORG 100H

;A           
MOV SI, 0160H
MOV BYTE PTR [SI], 'n'
MOV BYTE PTR [SI + 1], 'e'
MOV BYTE PTR [[SI + 2], 'w'

;B
MOV DH, ABH
MOV BL, 22H

;C
MOV DI, 0260H
MOV BYTE PTR [DI + 30H], 11H
MOV BYTE PTR [DI + 30H + 1], 33H    

;D
INC BYTE PTR [DI + 30H] 
DEC DH 

;E
MOV CH, DH
ADD CH, BL                      
                  
;F
MOV AL, BYTE PTR [DI + 30H]
SUB AL, CH 

;G
NOT AL
OR BL, 11000000B
AND BL, 01110101B
XOR BL, 00000011B   

;H
XCHG AL, [DI + 30H]

;ANOTHER SOLUTION 
MOV BL, AL  
MOV AL, [DI + 30H] 
MOV [DI + 30H], BL          ;AL = 5 , BL = 0 , [DI + 30H] = 10
MOV BL, 0H                                                     



;00000000
;76543210  
;AND
;01110101                                                                  