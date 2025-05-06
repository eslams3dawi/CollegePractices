-- 8. Concatenate FIRST_NAME and LAST_NAME with a space in between and label it as FULL_NAME
SELECT FIRST_NAME || ' ' || LAST_NAME AS FULL_NAME
FROM EMPLOYEES

-- 9. Concatenate literal string between names
SELECT FIRST_NAME || ' is a ' || LAST_NAME AS FULL_NAME
FROM EMPLOYEES

-- 10. Use alternative quote operator to display single quotes inside the string
SELECT DEPARTMENT_ID || q'[, it's assigned Manager Id: ]' || MANAGER_ID 
FROM EMPLOYEES
