class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap< Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }
        }
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(e.getValue() >= 2){
                return true;
            }
        }
        return false;
    }
}