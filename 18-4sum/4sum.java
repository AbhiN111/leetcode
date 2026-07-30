class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> st =new HashSet<>();
        int n= nums.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                HashSet<Long> hashSet= new HashSet<>();
                for(int k =j+1;k<n;k++){
                    long sum = nums[i]+ nums[j];
                    sum+=nums[k];
                    long fourth = target -sum;

                    if(hashSet.contains(fourth)){
                        List<Integer> temp =new ArrayList<>();

                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add((int)fourth);

                        Collections.sort(temp);

                        st.add(temp);

                    }
                    hashSet.add((long) nums[k]);
                }
            }
        }
        return new ArrayList<>(st);
    }
}