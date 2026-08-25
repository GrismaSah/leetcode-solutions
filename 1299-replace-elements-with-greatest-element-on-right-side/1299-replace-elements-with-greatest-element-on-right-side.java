class Solution {
    public int[] replaceElements(int[] nums) {
        int max = -1;

        for(int i = nums.length - 1; i>=0; i--){
            int curr = nums[i];
            nums[i] = max;
            max = Math.max(max, curr);
           
        }
        return nums;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna