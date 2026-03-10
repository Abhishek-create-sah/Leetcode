// Brute Force Approach :- two for loops i = 0 , j = i , product = 1 and update the product and res(mx)

// current  soln is prefix sum + dp 
class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length ;
        int mx = nums[0];
        int mn = nums[0];
        int res = mx ;

        for(int i = 1 ; i < n ; i++){
            int cur = nums[i];
            int tmpmx = mx ;

            mx = Math.max(cur,Math.max(cur*mx,cur*mn));
            mn = Math.min(cur,Math.min(cur*tmpmx,cur*mn)); // it will store -ve . e.g [-2,3,-4] --> 24

            res = Math.max(res,mx);
        }
        return res ;
    }
}