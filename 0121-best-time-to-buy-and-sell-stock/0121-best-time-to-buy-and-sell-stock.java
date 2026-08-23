class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        int max = 0;

        for(int num : prices){
            if(num < buy){
                buy = num;
            }
            else if(num > buy){
                profit = num - buy;
                max = Math.max(max, profit);
            }
        }
        return max;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna