class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j< nums.length; j++){
        //         if(nums[i] + nums[j] == target){
        //             return new int[] {i,j};

        //         }
        //     }
        // }
        // return new int[] {};
        // // return -1

        //  optimal solution,
        int complement;
        HashMap<Integer, Integer> map = new HashMap <>();
        for(int i=0; i<nums.length; i++){
            complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[]{};

    }
}