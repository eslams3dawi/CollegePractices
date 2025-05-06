-- 11. Display unique department IDs
SELECT DISTINCT DEPARTMENT_ID 
FROM EMPLOYEES

-- 12. Show table structure of EMPLOYEES
DESCRIBE EMPLOYEES

-- 13. Display first name of employee with ID = 103
SELECT FIRST_NAME 
FROM EMPLOYEES
WHERE EMPLOYEE_ID = 103

-- 14. Display first names that are not equal to 'Alexander'
SELECT FIRST_NAME 
FROM EMPLOYEES
WHERE FIRST_NAME <>'Alexander'

-- 15. Display employee_id, first_name, and salary for specific IDs
SELECT EMPLOYEE_ID, FIRST_NAME, SALARY 
FROM EMPLOYEES
WHERE EMPLOYEE_ID IN(100,101,102)
