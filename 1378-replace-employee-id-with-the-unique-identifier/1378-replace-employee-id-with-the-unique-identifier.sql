# Write your MySQL query statement below
SELECT unique_id, name
FROM Employees e
Left Join EmployeeUNI u
on e.id = u.id;

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna