package DP;
// i = items j = weight
// BC i == 0 => profit = 0 ; j == 0 => profit = 0
public class kp_sk_table {
  private static int knapSack(int wt[],int val[],int W ){
    int n = val.length ;
    int[][] dp = new int[n+1][W+1];

    for(int i = 0 ; i < dp.length ; i++){
      dp[i][0] = 0 ; //0th col
    }
    for(int j = 0 ; j < dp[0].length ; j++){
      dp[0][j] = 0 ; //0th row
    }

    for(int i = 1 ; i < dp.length ; i++){
      for(int j = 1 ; j < dp[0].length ;j++){
        int v = val[i-1];
        int w = wt[i-1];
        //valid
        if(w <= j){
          int incProfit = v + dp[i-1][j-w];
          int excProfit = dp[i-1][j];
          dp[i][j] = Math.max(incProfit, excProfit);
        } else {
          //invalid
          int excProfit = dp[i-1][j];
          dp[i][j] = excProfit ;
        }
        
      }
    }
    return dp[n][W];
  }
  public static void main(String[] args) {
    int[] wt = { 2,5,1,3,4 };
    int[] val = { 15,14, 10, 45, 30 };
    int W = 7;
    System.out.println(knapSack(wt, val, W));
  }
}
