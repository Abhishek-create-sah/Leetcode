//brute force for-loop 2 one i = 0 ,sum = 0 j = i
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0;
        int sum = 0 ;
        HashMap<Integer,Integer> m = new HashMap<>();
        m.put(0,1);
        for(int i = 0 ; i < n ; i++){
            sum += nums[i];
            int val = sum - k ;
            if(m.containsKey(val)){
                cnt += m.get(val);
            }
            m.put(sum,m.getOrDefault(sum,0)+1);
        }
        return cnt ;
    }
}