class Solution {
    boolean twoSum(int nums[], int target) {
        HashSet<Integer> set = new HashSet<>();
        // int ans;
        for(int num : nums){
           int ans = target - num;
            if(set.contains(ans)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna