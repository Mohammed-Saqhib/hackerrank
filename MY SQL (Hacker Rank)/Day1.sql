-- Day 1: HackerRank SQL practice
-- What I did: Ran three SELECT queries against the `city` table.
-- What happened:
--  - Query 1: SELECT * FROM city          -> returned all rows and columns.
--  - Query 2: SELECT * FROM city WHERE population > 100000 AND CountryCode = 'USA'
--     -> returned all columns for US cities with population > 100000.
--  - Query 3: SELECT name FROM city WHERE population > 120000 AND CountryCode = 'USA'
--     -> returned only the `name` column for US cities with population > 120000.
-- Notes: Normalized casing and added semicolons for clarity.

SELECT * FROM city;

SELECT * FROM city
WHERE population > 100000 AND CountryCode = 'USA';

SELECT name FROM city
WHERE population > 120000 AND CountryCode = 'USA';