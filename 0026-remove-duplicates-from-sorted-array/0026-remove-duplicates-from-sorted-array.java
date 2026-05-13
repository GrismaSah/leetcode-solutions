class Solution {
    public int removeDuplicates(int[] nums) {
        // k is used to store position of next unique element
        // first element is always unique
        int k = 1;
        // start checking from index 1
        for(int i = 1; i < nums.length; i++) {
            // if current element is different from previous
            // then it is a unique element
            if(nums[i] != nums[i - 1]) {
                // place unique element at index k
                nums[k] = nums[i];
                // move k to next position
                k++;
            }
        }
        // return total number of unique elements
        return k;
    }
}