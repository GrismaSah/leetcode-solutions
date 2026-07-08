class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length);
        return nums;
    }

    static void mergeSort(int[] arr, int start, int end) {

        // Base Case
        if (end - start == 1) {
            return;
        }

        int mid = start + (end - start) / 2;

        // Sort left half
        mergeSort(arr, start, mid);

        // Sort right half
        mergeSort(arr, mid, end);

        // Merge both halves
        merge(arr, start, mid, end);
    }

    static void merge(int[] arr, int start, int mid, int end) {

        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {

            if (arr[i] <= arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }

        while (i < mid) {
            mix[k++] = arr[i++];
        }

        while (j < end) {
            mix[k++] = arr[j++];
        }

        // Copy merged array back to original array
        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
    }
}