-- 1. Display all columns from the EMPLOYEES table
SELECT * FROM EMPLOYEES

-- 2. Display only first and last names from EMPLOYEES
SELECT FIRST_NAME, LAST_NAME 
FROM EMPLOYEES

-- 3. Display half the salary for each employee
SELECT SALARY/2 
FROM EMPLOYEES

-- 4. Calculate the commission amount by multiplying SALARY with COMMISSION_PCT
SELECT SALARY * COMMISSION_PCT
FROM EMPLOYEES

-- 5. Display the COMMISSION_PCT column with alias "PCT"
SELECT COMMISSION_PCT AS PCT
FROM EMPLOYEES

-- 6. Same as above but without AS keyword
SELECT COMMISSION_PCT PCT
FROM EMPLOYEES

-- 7. Same as above but using double quotes for alias
SELECT COMMISSION_PCT "PCT"
FROM EMPLOYEES
