package DP;

import java.util.*;

public class lis {
  private static int lis(int[] arr){
    HashSet<Integer> set = new HashSet<>();

    for (int i = 0; i < arr.length; i++) {
      set.add(arr[i]);
    }

    int[] arr2 = new int[set.size()];
    int idx = 0 ;
    for (int val : set) {
      arr2[idx++] = val ;
    }

    Arrays.sort(arr2);
    int n = arr.length ; int m = arr2.length ;
    int[][] dp = new int[n+1][m+1] ;

    for(int i = 1 ; i < dp.length ; i++){
      for(int j = 1 ; j < dp[0].length ; j++){
        if(arr[i-1] == arr2[j-1]){
          dp[i][j] = dp[i-1][j-1]+1;
        } else {
          int a1 = dp[i-1][j];
          int a2 = dp[i][j-1];
          dp[i][j] = Math.max(a1, a2);
        }
      }
    }
    return dp[n][m];
  }
  public static void main(String[] args) {
    int[] arr1 = {50,3,10,7,40,80};
    System.out.println(lis(arr1));
  }
}
