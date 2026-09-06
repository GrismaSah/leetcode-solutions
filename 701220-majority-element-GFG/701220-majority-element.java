class Solution {
    int majorityElement(int nums[]) {
        int majority = 0 ;
        int vote = 0;
        for(int num: nums){
            if(vote == 0){
               majority = num; 
               vote++; 
            } 
            else if(majority == num) vote++;
            else vote--;
        }
        int count =0; 
        for(int num : nums){
            if(majority == num ){
                count++;
            }
        }
        if(count > nums.length/2) return majority;
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna