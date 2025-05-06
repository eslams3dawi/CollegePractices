-- 22. Display employee_id and first names that start with 'A' ordered by name ascending
SELECT EMPLOYEE_ID, FIRST_NAME
FROM EMPLOYEES
WHERE FIRST_NAME LIKE 'A%'
ORDER BY FIRST_NAME

-- 23. Same as above but ordered descending
SELECT EMPLOYEE_ID, FIRST_NAME
FROM EMPLOYEES
WHERE FIRST_NAME LIKE 'A%'
ORDER BY FIRST_NAME DESC

-- 24. Display employee_id, first_name, department_id, salary for names starting with A, order by department then salary descending
SELECT EMPLOYEE_ID, FIRST_NAME, DEPARTMENT_ID, SALARY
FROM EMPLOYEES
WHERE FIRST_NAME LIKE 'A%'
ORDER BY DEPARTMENT_ID, SALARY DESC

-- 25. Case-insensitive search using LOWER
SELECT FIRST_NAME
FROM EMPLOYEES
WHERE LOWER(FIRST_NAME) = 'adam'

-- 26. Case-insensitive search using UPPER
SELECT FIRST_NAME
FROM EMPLOYEES
WHERE UPPER(FIRST_NAME) = 'ADAM'

-- 27. Case-insensitive search using INITCAP
SELECT FIRST_NAME
FROM EMPLOYEES
WHERE INITCAP(FIRST_NAME) = 'Adam'