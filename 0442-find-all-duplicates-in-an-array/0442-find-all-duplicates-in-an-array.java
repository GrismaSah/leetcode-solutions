class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      //optimal negative-marking solution  
    //   ArrayList<Integer> list = new ArrayList<>();
    //   for(int i=0; i<nums.length; i++){
    //     int freq =1;
    //     for(int j=i+1; j<nums.length; j++){
    //         if(nums[i] == nums[j]){
    //             freq++;
    //             if(freq == 2){
    //                 list.add(nums[i]);
    //             }
    //         }
    //     }
    //   }
    //   return list;

    HashMap<Integer, Integer> map = new HashMap <>();
    for(int num:nums){
        if(map.containsKey(num)){
            map.put(num, map.get(num) +1);
        }
        else{
            map.put(num, 1);
        }
    }

    ArrayList<Integer> list = new ArrayList<>();
    for(Map.Entry<Integer, Integer> e: map.entrySet()){
        if(e.getValue() == 2){
            list.add(e.getKey());
        }
    }
    return list;
    }
}