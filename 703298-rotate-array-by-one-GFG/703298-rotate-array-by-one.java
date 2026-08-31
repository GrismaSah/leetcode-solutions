class Solution {
    public void rotate(int[] nums) {
        // int temp = nums[0];
        // int k=0;
        // for(int i=1; i<nums.length; i++){
        //     nums[k] = nums[i];
        //     k++;
        // }
        // nums[k] = temp; 
        
        int temp = nums[nums.length-1];
        int k =nums.length-1;
        for(int i = nums.length-2; i>=0; i--){
            nums[k] = nums[i];
            k--;
        }
        nums[0] = temp;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna