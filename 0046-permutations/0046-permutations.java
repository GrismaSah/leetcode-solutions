class Solution {

    public static void backtrack(List<List<Integer>> resultList, ArrayList<Integer> tempList, int[] nums){

        if(tempList.size() == nums.length){
            resultList.add(new ArrayList<>(tempList));
            return;
        }

        for(int number : nums){
            if(tempList.contains(number))
            continue;

            tempList.add(number);

            backtrack(resultList, tempList, nums);

            tempList.remove(tempList.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtrack(resultList, new ArrayList<>(), nums);
        return resultList;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna