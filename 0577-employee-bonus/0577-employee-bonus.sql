# Write your MySQL query statement below
SELECT * FROM
(SELECT name,bonus 
    FROM Employee 
    LEFT JOIN Bonus 
    ON Employee.empId=Bonus.empId
) as sub
WHERE bonus IS NULL OR bonus<1000;
