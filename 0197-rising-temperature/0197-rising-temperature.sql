# Write your MySQL query statement below
select today.id
from Weather today
JOIN Weather previous
on today.recordDate = DATE_ADD(previous.recordDate, INTERVAL 1 DAY)
where today.temperature > previous.temperature;

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna