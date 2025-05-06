-- 16. Display first names that end with letter 'a'
SELECT FIRST_NAME
FROM EMPLOYEES
WHERE FIRST_NAME LIKE '%a'

-- 17. Display first names that start with letter 'A'
SELECT FIRST_NAME
FROM EMPLOYEES
WHERE FIRST_NAME LIKE 'A%'

-- 18. Display first names with second letter as 'a'
SELECT FIRST_NAME
FROM EMPLOYEES
WHERE FIRST_NAME LIKE '_a%'

-- 19. Display first names with third letter as 'a'
SELECT FIRST_NAME
FROM EMPLOYEES
WHERE FIRST_NAME LIKE '__a%'

-- 20. Display first names that end with 'a' and are two letters long
SELECT FIRST_NAME
FROM EMPLOYEES
WHERE FIRST_NAME LIKE '%a_'

-- 21. Display first names with multiple 'a's starting with A
SELECT FIRST_NAME
FROM EMPLOYEES
WHERE FIRST_NAME LIKE 'A%a%a'