-- 42. Format hire date in a readable format
SELECT FIRST_NAME,
TO_CHAR(HIRE_DATE, 'fmDD Month YYYY') AS HIREDATE
FROM EMPLOYEES

-- 43. Format salary with currency formatting
SELECT SALARY, 
TO_CHAR(SALARY, '$99,999.00') AS SALARY
FROM EMPLOYEES

-- 44. Format hire date and filter by date
SELECT FIRST_NAME, TO_CHAR(HIRE_DATE, 'DD-Mon-YYYY')
FROM EMPLOYEES
WHERE HIRE_DATE < TO_DATE('01-Jan-90', 'DD-Mon-RR')
