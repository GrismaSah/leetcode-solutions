# Write your MySQL query statement below
select start.machine_id, ROUND(AVG(end.timestamp - start.timestamp), 3) AS processing_time
from Activity start
JOIN Activity end
on start.machine_id = end.machine_id
AND start.process_id = end.process_id
where start.activity_type = 'start' 
AND end.activity_type = 'end'
GROUP BY start.machine_id;

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna