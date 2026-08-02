class Solution {
    // public static void swapIfGreater(int[] arr1, int[] arr2, int ind1, int ind2){
    //     if (arr1[ind1] > arr2[ind2]){
    //         int temp = arr1[ind1];
    //         arr1[ind1] = arr2[ind2];
    //         arr2[ind2] = temp;
    //     }
    // }

    // public void merge(int[] arr1, int m, int[] arr2, int n) {
    //     int len = (n+m);
    //     int gap =(len/2) + (len%2);
    //     while(gap>0){
    //         int left =0;
    //         int right = left + gap;
    //         while(right<len){
    //             if(left<n && right>=n){
    //                 swapIfGreater(arr1, arr2, left, right - n);
    //             }else if(left>=n){
    //                 swapIfGreater(arr2, arr2, left - n, right - n);
    //             }else{
    //                 swapIfGreater(arr1, arr1, left, right);
    //             }
    //             left++;
    //             right++;
    //         }
    //         if(gap == 1) break;
    //         gap=(gap/2) + (gap%2);
    //     }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;          // Last valid element in nums1
        int j = n - 1;          // Last element in nums2
        int k = m + n - 1;      // Last position in nums1

        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        // Copy remaining elements from nums2
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}