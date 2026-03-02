package DP;

import java.util.* ;
public class Coin_change {
  private static int MinCoin(int[] coins , int amt){
    int dp[] = new int[amt+1];
    Arrays.fill(dp,amt+1);
    dp[0]= 0 ; // 0 coins to get sum = 0

    for(int coin : coins){
      for(int j = coin ; j <= amt ; j++){ // single coin can be used multiple time
        dp[j] = Math.min(dp[j-coin]+1 , dp[j]); // include + exclude
      }
    }
    return dp[amt] > amt ? -1 : dp[amt];
  }
  private static int Total_ways(int[] coins , int amt){
    
    int dp[][] = new int[coins.length+1][amt+1] ;
    //i -> coins , j -> amount , dp[i][j] -> total ways to get sum = j with coins 1 to i

    for(int i = 0 ; i < dp.length ; i++){
      dp[i][0] = 1 ; // 0th col 
    } 
    // 0th row already 0 in java ,bcoz we can't get sum = n with 0 coins

    for(int i = 1 ; i < dp.length ; i++){
      for(int j = 1 ; j < dp[0].length ; j++){
        int a = coins[i-1];
        if(j >= a){
          dp[i][j] =  dp[i][j-a]+dp[i-1][j]; // include + exclude
        } else {
          dp[i][j] = dp[i-1][j];
        }
      }
    }
    return dp[coins.length][amt] ;
  }
  public static void main(String[] args) {
    int[] coins = { 2, 5,3,6 };
    int amount = 10;
    System.out.println(Total_ways(coins, amount)); // 5  {{2,2,2,2,2},{3,3,2,2},{2,3,5},{2,2,6},{5,5}}
    System.out.println(MinCoin(coins, amount)); // 2 => {5,5}
  }
}
