-- This query calculates the number of duplicate city entries in the station table by subtracting the count of distinct cities from the total count of cities.
select count(city) - count(distinct city) from  station;




----query 2