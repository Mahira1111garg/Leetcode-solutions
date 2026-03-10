# Write your MySQL query statement below

SELECT id
FROM
(SELECT *,
    LAG(temperature,1) OVER (ORDER BY recordDate  ) AS previous_temp,
    LAG(recordDate,1) OVER (ORDER BY recordDate) AS prev_date
    FROM Weather 
)
AS temp
WHERE previous_temp<temperature
AND DATEDIFF(recordDate, prev_date) = 1;