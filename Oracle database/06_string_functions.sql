-- 28. Concatenate first name and last name
SELECT CONCAT(FIRST_NAME, LAST_NAME)
FROM EMPLOYEES

-- 29. Display the first 3 characters of first name
SELECT SUBSTR(FIRST_NAME, 1, 3)
FROM EMPLOYEES

-- 30. Display length of each first name
SELECT LENGTH(FIRST_NAME)
FROM EMPLOYEES

-- 31. Show index of letter 'a' in first name
SELECT INSTR(FIRST_NAME, 'a')
FROM EMPLOYEES

-- 32. Pad left of salary with '*' to make it 10 characters long
SELECT LPAD(SALARY, 10, '*')
FROM EMPLOYEES

-- 33. Pad right of salary with '*' to make it 10 characters long
SELECT RPAD(SALARY, 10, '*')
FROM EMPLOYEES

-- 34. Replace 'J' with 'BL' in a string
SELECT REPLACE('JACK AND JUE', 'J', 'BL')
FROM EMPLOYEES

-- 35. Trim 'E' from both ends of string
SELECT TRIM('E' FROM 'Eslam Seadawi')
FROM EMPLOYEES

-- 36. Trim spaces from both ends of string
SELECT TRIM('   ESLAM         SEADAWI')
FROM EMPLOYEES