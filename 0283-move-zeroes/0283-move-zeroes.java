class Solution {
    public void moveZeroes(int[] nums) {
         int k = 0;

        // put non-zero elements at front
        for(int i=0;i<nums.length;i++){

            if(nums[i] != 0){

                nums[k] = nums[i];
                k++;
            }
        }

        // fill remaining positions with 0
        while(k < nums.length){

            nums[k] = 0;
            k++;
        }
    }
}