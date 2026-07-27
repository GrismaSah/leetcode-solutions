class Solution {
    public int countOdds(int low, int high) {
      // Time Complexity: O(1) | Space Complexity: O(1)
      // This is the optimal complexity for this problem.
      
      int check = high - low;
     
        if((check + 1)%2 == 0){
            // BUG ALERT: Operator precedence issue here. 
            // 'check + 1 / 2' performs division before addition.
            // It should be '(check + 1) / 2'.
            return (check +1) /2;
        }
        else {
           if(low %2 != 0){
            return (check /2) + 1;
           }
           else{
             return check /2;
           }
        }
      
    }
    // COACH TIP: A more concise way to solve this is:
    // return (high + 1) / 2 - low / 2;
    // This calculates the number of odds from 0 to high and subtracts odds from 0 to low-1.
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna