class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int k = 0;
        int i = 0;
        int j = n;
        while(i<n){
            ans[k++] = nums[i++];

            ans[k++] = nums[j++];
        }
        return ans;

    }
}