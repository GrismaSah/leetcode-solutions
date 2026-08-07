class Solution {
    public void rotate(int[] arr) {
        int n = arr.length;
        int k = n-1;
        int last = arr[n-1];
        for(int i=n-2; i>=0; i--){
            arr[k--] = arr[i];
        }
        arr[0] = last;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna