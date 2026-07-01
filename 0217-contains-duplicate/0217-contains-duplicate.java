class Solution {
    public boolean containsDuplicate(int[] nums) {
        // int n=nums.length;
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         if(nums[i] == nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        // optimal solution,, 
        int n = nums.length;
        HashMap<Integer, Integer> map =new HashMap<>();
        for(int num:nums){
          map.put(num, map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() >= 2){
                return true;
            }
        }
        return false;
    }
}