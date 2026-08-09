class Solution {
    public int[] sortColors(int[] nums) {
        // case:0 - swap with the element at start pointer, start++, middle++;
        // case1: no swapping, middle++;
        //case 2 - swap with the end pointer, end-- ;

        // if else condition..
        int n = nums.length;
        int start = 0, middle = 0, end = n-1;
        // while(middle <= end){
        //     if(nums[middle] == 2){
        //         int temp = nums[middle];
        //         nums[middle] = nums[end];
        //         nums[end] = temp;

        //         end--;
            
        //     }
        //     else if( nums[middle] == 1 ){
        //         middle++;
        //     }
        //     else{
        //         int temp = nums[middle];
        //         nums[middle] = nums[start];
        //         nums[start] = temp;

        //         start++;
        //         middle++;
        //     }
        // }
        // return nums;

        // swtich case..
        while(middle <= end){
            switch(nums[middle]){
                 case 0:
                    int temp0 = nums[middle];
                    nums[middle] = nums[start];
                    nums[start] = temp0;

                    start++;
                    middle++;
                    break;

                case 1:
                    middle++;
                    break;

                case 2:
                    int temp2 = nums[middle];
                    nums[middle] = nums[end];
                    nums[end] = temp2;

                    end--;
                    // Don't increment middle here
                    break;
            }

        }
        
            return nums;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna