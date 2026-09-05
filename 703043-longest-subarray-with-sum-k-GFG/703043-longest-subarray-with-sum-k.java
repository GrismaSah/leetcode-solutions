class Solution {
    public int longestSubarray(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap <>();
        int pSum = 0, len = 0;
         
        map.put(0, -1);
        
        for(int i=0; i<nums.length; i++){
            pSum += nums[i];
            if(map.containsKey(pSum - k)){
                len = Math.max(len, i - map.get(pSum -k));
            }
            if(!map.containsKey(pSum)){
                map.put(pSum, i);
            }
        }
        return len;
         
         
        
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna