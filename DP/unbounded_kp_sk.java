package DP;
/*
  Unbounded knapsack :- we can take items multiple time 
*/
import java.util.* ;
public class unbounded_kp_sk {
  private static void print2D(int[][] dp){
    for(int i = 0 ; i < dp.length ; i++){
      for(int j = 0 ; j < dp[0].length ; j++){
        System.out.print(dp[i][j] + " ");
      }
      System.out.println();
    }
  }
  private static int UnBoundedknapSack(int[] wt , int[] val , int W){
    int[][] dp = new int[val.length+1][W+1] ;
    for(int i = 0 ; i < dp.length ; i++){
      dp[i][0] = 0 ; //0th col
    }

    for(int j = 0 ; j < dp.length ; j++){
      dp[0][j] = 0 ; //0th row
    }
    for(int i = 1 ; i < dp.length ; i++){
      for(int j = 1 ; j < dp[0].length ; j++){
        int w = wt[i-1];
        int v = val[i-1];

        if(w <= j){ // valid
          //include
          int inc = v + dp[i][j-w];
          //exclude
          int exc = dp[i-1][j];

          dp[i][j] = Math.max(inc, exc);
        } else { //invalid
          //exclude 
          dp[i][j] = dp[i-1][j];
        }
      }
    }
    print2D(dp);
    return dp[val.length][W] ;

  }
  public static void main(String[] args) {
    int[] wt =  { 2, 5, 1, 3, 4 };
    int[] val = { 15,14,10,45,30 };
    int W = 7;
    System.out.println(UnBoundedknapSack(wt, val, W)); // 100 => 3,3,1
  }
}
