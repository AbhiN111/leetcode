class Solution {
    public void rotate(int[] nums, int k) {
        // int n = nums.length;
        // k = k % n;

        // int[] temp = new int[k];

        // for (int i = 0; i < k; i++) {
        //     temp[i] =nums[i];
        // }

        // for (int i = k; i < n; i++) {
        //    nums[i - k] =nums[i];
        // }

        // for (int i = n - k; i < n; i++) {
        //     nums[i] = temp[i - (n - k)];
        // }

        int n = nums.length;
        k = k % n;
        int[] temp = new int[k];
        // Store the last k elements
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }
        // Shift the remaining elements to the right
        for (int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        // Copy temp to the beginning
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}