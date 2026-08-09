# [Fizz Buzz](https://www.geeksforgeeks.org/problems/fizz-buzz/1)
## Easy
Fizz Buzz Problem involves that given an integer&nbsp;n, for every integer&nbsp;0 &lt; i &lt;= n, the task is to output,

"FizzBuzz"&nbsp;if&nbsp;i&nbsp;is divisible by&nbsp;3&nbsp;and&nbsp;5,
"Fizz"&nbsp;if&nbsp;i&nbsp;is divisible by&nbsp;3,
"Buzz"&nbsp;if&nbsp;i&nbsp;is divisible by&nbsp;5
"i"&nbsp;as a string, if none of the conditions are true.

Return an array of strings.
Examples :
Input: n = 3
Output: ["1", "2", "Fizz"]Explanation: 1 and 2 are neither divisible by 3 nor 5, so we just output 1 and 2, and 3 is divisible by 3 so we output "Fizz".

Input: n = 10
Output: ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
Input: n = 20
Output: [“1”, “2”, “Fizz”, “4”, “Buzz”, “Fizz”, “7”, “8”, “Fizz”, “Buzz”, “11”, “Fizz”, “13”, “14”, “FizzBuzz”, “16”, “17”, “Fizz”, “19”, “Buzz”]
Constraints:1 ≤ n ≤ 106