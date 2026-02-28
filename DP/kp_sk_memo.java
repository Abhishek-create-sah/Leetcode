package DP;

public class kp_sk_memo {
  private static int knapSack(int wt[] , int val[] , int W , int n , int dp[][]){
    if(W==0 || n==0) return 0 ;

    if(dp[n][W] != -1){
      return dp[n][W];
    }

    if(wt[n-1] <= W){
      //include 
      int ans1 = val[n-1]+knapSack(wt,val,W-wt[n-1],n-1,dp);
      //exclude
      int ans2 = knapSack(wt,val,W,n-1,dp);

      dp[n][W] =  Math.max(ans1,ans2);
      return dp[n][W]; 
    }
    else {
      //exclude
      dp[n][W] = knapSack(wt,val,W,n-1,dp);
      return dp[n][W];
    }
  }

  public static void main(String[] args) {
    int[] wt = { 2,5,1,3,4 };
    int[] val = { 15,14, 10, 45, 30 };
    int W = 7;
    int[][] dp = new int[val.length+1][W+1];

    for(int i = 0 ; i < dp.length ; i++){
      for(int j = 0 ; j < dp[0].length ; j++){
        dp[i][j] = -1 ;
      }
    }
    System.out.println(knapSack(wt, val, W, wt.length,dp));
  }
}


// TC = O(n*W)

//There is chance of stack overflow as we are using recursion. so we can use tabulation to avoid that.