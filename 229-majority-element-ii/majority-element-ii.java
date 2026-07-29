class Solution {
    public List<Integer> majorityElement(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n= arr.length;
        List<Integer> ans = new ArrayList<>();
        int min=(n/3)+1;

        for(int i =0;i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            
            if (map.get(arr[i]) == min) {
                ans.add(arr[i]);
            }

            if(ans.size()==2) break;
        }
        return ans;
    }
}