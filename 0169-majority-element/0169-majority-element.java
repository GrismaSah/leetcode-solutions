class Solution {
    public int majorityElement(int[] nums) {
       int majority = nums[0], vote = 1;
       for(int i=1; i<nums.length; i++){
        if(nums[i] == majority){
            vote++;
        }
        else if( vote == 0){
            vote++;
            majority = nums[i];

        }
        else{
            vote--;
        }
       }
       return majority;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna