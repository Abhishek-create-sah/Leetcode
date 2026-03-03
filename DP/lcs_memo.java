package DP;
//n = s1 , m = s2 for dp[n][m] = max common subsequence
public class lcs_memo {
  private static int longcommonseq(String s1 , String s2 , int m , int n , int[][] dp){
    if(m == 0 || n == 0) return 0 ;
    if(dp[n][m] != -1) return dp[n][m];

    if(s1.charAt(n) == s2.charAt(m)){
      dp[n][m] = longcommonseq(s1,s2,m-1,n-1,dp)+1;
      return dp[n][m] ;
    }
    else {
      int ans1 = longcommonseq(s1,s2,m-1,n,dp);
      int ans2 = longcommonseq(s1,s2,m,n-1,dp);
      dp[n][m] = Math.max(ans1,ans2);
      return dp[n][m];
    }
  }
  public static void main(String[] args) {
    String s1 = "abcdge";
    String s2 = "abedg";
    int n = s1.length();
    int m = s2.length();
    int[][] dp = new int[n][m];
    for(int i = 0 ; i < dp.length ; i++){
      for (int j = 0 ; j < dp[0].length ; j++){
        dp[i][j] = -1;
      }
    }
    System.out.println(longcommonseq(s1,s2,m-1,n-1,dp));
  }
}
