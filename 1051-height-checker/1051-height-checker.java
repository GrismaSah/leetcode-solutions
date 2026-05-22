class Solution {
    public int heightChecker(int[] heights) {
        // Create copy array
        int[] expected = heights.clone();

        // Sort copy
        Arrays.sort(expected);

        int count = 0;

        // Compare both arrays
        for(int i = 0; i < heights.length; i++){

            if(heights[i] != expected[i]){
                count++;
            }
        }

        return count;
    }
}