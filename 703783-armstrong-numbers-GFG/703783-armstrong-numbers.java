class Solution {
    static boolean armstrongNumber(int n) {
        if (n <0) return false;
        int temp = n;
        int count = 0;
        while(temp != 0){
            count++;
            temp /= 10;
        }
        temp = n;
        int sum = 0;
        while( temp > 0){
            int digit = temp %10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }
        if(sum == n) return true;
        return false;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna