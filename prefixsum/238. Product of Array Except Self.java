/*
   Approach 1 : O(n^2) time and O(1) space
  two for loops i = 0 , j = 0  if i != j then product = product*nums[j]  

   Approach 2 : prefix and suffix arr product O(n) time and O(n) space
   pre[0] = 1 , suf[n-1] = 1
   Approach 3 : prefix and suffix product O(n) time and O(1) space

 */


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        int pre = 1 ; 
        int suf = 1 ;
        
        for (int i = 0; i < n; i++) {
            res[i] = pre ;
            pre = pre*nums[i] ;
        }
        for(int i = n-1 ; i >= 0 ;i--){
            res[i] = res[i]*suf ;
            suf = suf*nums[i];
        }
        return res ;
    }
}