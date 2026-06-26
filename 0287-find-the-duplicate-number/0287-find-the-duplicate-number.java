class Solution {
    public int findDuplicate(int[] nums) {
        // looping..
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i] == nums[j]){
        //             return nums[i];
        //         }
        //     }
        // }
        // return -1;

        //hashing...
        HashMap<Integer, Integer > map = new HashMap <>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }
        }
        int singlefreq = 1;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() > singlefreq ){
                return e.getKey();
            }
        }
        return -1;
    }
}