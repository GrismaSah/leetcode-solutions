class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int pos = 0; 
        int neg = 1;
        for(int num : nums){
            if(num > 0){
                ans[pos] = num;
                pos += 2;
            }
            else{
                ans[neg] = num;
                neg += 2;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna