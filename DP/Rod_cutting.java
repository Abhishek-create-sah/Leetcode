package DP;
// val = price, wt = length , W = totalRod
// unbounded kp sack

class Rod_cutting {
  private static int mxPrice(int[] len, int[] price , int T){
    int n = price.length ; // n = len.length
    int[][] dp = new int[n+1][T+1]; // dp[i][j] => i pices of rod ko use karke j length ka rod banane pe maximum profit kya hoga

    for(int i = 1 ; i < dp.length ; i++){
      for(int j = 1 ; j < dp[0].length ; j++){
        int p = price[i-1];
        int l = len[i-1];
        // valid
        if(l <= j){
          //include
          int include = p + dp[i][j-l];
          //exclude
          int exclude = dp[i-1][j];
          dp[i][j] = Math.max(include,exclude);
        }else{
          //exclude
          dp[i][j] = dp[i-1][j];
        }
      }
    }
    return dp[n][T] ;

  }
  public static void main(String[] args) {
    int len[] = {1,2,3,4,5,6,7,8};
    int price[] = {1,5,8,9,10,17,17,20};
    int T = 8;
    System.out.println(mxPrice(len, price, T));
  }
}