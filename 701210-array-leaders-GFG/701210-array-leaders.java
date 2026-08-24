class Solution {
    static ArrayList<Integer> leaders(int nums[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[nums.length-1]);
        int max = nums[nums.length-1];
        
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i] >= max){
                list.add(nums[i]);
                max = nums[i];
            }
            
        }
        Collections.reverse(list);
        return list;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna