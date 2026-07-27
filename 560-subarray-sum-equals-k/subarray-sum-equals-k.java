class Solution {
    public int subarraySum(int[] arr, int k) {
    //     int left = 0, right =0;
    //     long sum = nums[0];
    //     int maxLen= 0;
    //     int n =nums.length;
    //     while(right<n){
    //         while(left<=right && sum>k){
    //             sum-=nums[left];
    //             left++;
    //         }
    //         if(sum==k){
    //             maxLen=Math.max(maxLen, right -left+1);
    //         }
    //         right++;
    //         if(right<n)
    //         sum+=nums[right];
    //     }
    //     return maxLen;
    // }

        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1);
        int preSum=0;
        int cnt=0;
        int n= arr.length;
        for(int i=0; i<n; i++){
            preSum += arr[i];
            int remove = preSum-k;
            cnt += mpp.getOrDefault(remove, 0);
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }
}