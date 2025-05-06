-- 37. Select job_id and first name where job ends with REP
SELECT JOB_ID, FIRST_NAME
FROM EMPLOYEES
WHERE SUBSTR(JOB_ID, 4) = 'REP'

-- 38. Display salary with conversion and round to 2 decimal places
SELECT SALARY*1.3253, ROUND(SALARY*1.3253, 2)
FROM EMPLOYEES

-- 39. Math Functions Examples
SELECT ROUND(45.926, 2) AS Rounded, 
       TRUNC(45.926, 2) AS Truncated, 
       MOD(1600, 300) AS Modulus
FROM DUAL

-- 40. Display employee name and weeks worked in department 90
SELECT FIRST_NAME, ROUND((SYSDATE-HIRE_DATE)/7) AS WEEKS
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 90