class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            // if already exists
            if(set.contains(num)){
                return true;
            }
            // otherwise store it
            set.add(num);
        }
        return false;
    }
}