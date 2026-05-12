// Simple Logic:
// A palindrome number remains the same after reversing.
// So:
// Reverse Number == Original Number
// Here, we store the original number in 'duplicate'
// because 'n' changes during the reversing process.

class Solution {
    public boolean isPalindrome(int n) {
        // storing original number
        // because n will change inside loop
        int duplicate = n;
        int rev = 0;
        // loop runs until number becomes 0
        while(n > 0) {
            // extract last digit
            int lastdigit = n % 10;
            // remove last digit
            n = n / 10;
            // build reversed number
            rev = rev * 10 + lastdigit;
        }
        // checking:
        // reversed number == original number
        if(rev == duplicate) {
            return true;
        } else {
            return false;
        }
    }
}
