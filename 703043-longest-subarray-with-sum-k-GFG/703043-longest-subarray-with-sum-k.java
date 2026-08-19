class Solution {
    public int longestSubarray(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int prefixSum = 0; 
        int len = 0;
        
        map.put(0, -1);
        for(int i=0; i<nums.length; i++){
            prefixSum += nums[i];
            if(map.containsKey(prefixSum -k)){
                len = Math.max(len, i - map.get(prefixSum - k));
            }
            if(!map.containsKey(prefixSum)){
                map.put(prefixSum, i);
            }
        }
        return len;
        
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna