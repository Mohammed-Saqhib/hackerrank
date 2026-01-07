-- Problem: Weather Observation Station 4 - Find the difference between the total number of city entries and the number of distinct city entries in the station table (i.e., the number of duplicate cities).
-- This query calculates the number of duplicate city entries in the station table by subtracting the count of distinct cities from the total count of cities.
select count(city) - count(distinct city) from  station;




----query 2
-- Problem: Weather Observation Station 5 - Query the two cities in STATION with the shortest and longest CITY names, as well as their respective lengths.
-- Shortest city name:
SELECT city , length(city) from station
order by length(city)asc,city ASC
LIMIT 1;

-- Longest city name:
SELECT city , length(city) from station
order by length(city)DESC,city DESC
LIMIT 1;