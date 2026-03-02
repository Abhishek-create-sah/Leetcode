package DP;
/*
  we will given a arr of integer and a tar , we have to return true if we can make the tar
 */

import java.util.* ;

class tar_sum {
  private static boolean Ispossible(int n ,int arr[] , int tar){
    boolean[][] dp = new boolean[n+1][tar+1];
    // i = number of val , j = tar , dp[i][j] => with i val we have to j sum

    for(int i = 0 ; i < dp.length ; i++){
        dp[i][0] = true ; // 0th colmn
    }

    //0th row already false  , bcoz with 0 val we can get any sum other then 0

    for(int i = 1 ; i < dp.length ; i++){
      for(int j = 1 ; j < dp[0].length ; j++){
        //valid
        if(arr[i-1] <= j && dp[i-1][j-arr[i-1]] == true) dp[i][j] = true;
        if(dp[i-1][j] == true) dp[i][j] = true ;
      }
    }
    return dp[n][tar] ;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    int tar = sc.nextInt();
    for(int i = 0 ; i < n ;i++){
      arr[i] = sc.nextInt() ;
    }
    System.out.println(Ispossible(n,arr,tar));
    sc.close();
  }
}