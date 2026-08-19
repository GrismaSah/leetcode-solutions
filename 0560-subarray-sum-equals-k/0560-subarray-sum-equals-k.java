class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer, Integer> map = new HashMap<>();
       map.put(0, 1);

       int prefixSum  = 0; 
       int result = 0;
       for(int num : nums){
        prefixSum += num;
        if(map.containsKey(prefixSum - k)){
            result += map.get(prefixSum - k);
        }
        
        map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
        
       }
       return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna