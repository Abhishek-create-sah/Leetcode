package DP;
// i = 0 n = " " || j = 0 m = " " => dp[i][j] = in i char s1 and j char of s2 dp[i][j] is common
public class lcs_table {
  private static int longcommonseq(String s1, String s2 , int n , int m){
    int dp[][] = new int[n+1][m+1];

    // 0th row and 0th col are zeroes

    for(int i = 1 ; i < dp.length ; i++){
      for(int j = 1 ; j < dp[0].length ; j++){
        if(s1.charAt(i-1) == s2.charAt(j-1)){
          dp[i][j] = dp[i-1][j-1]+1;
        }
        else {
          int a1 = dp[i-1][j];
          int a2 = dp[i][j-1];
          dp[i][j] = Math.max(a1, a2);
        }
      }
    }
    return dp[n][m];

  }
  public static void main(String[] args) {
    String s1 = "abcdgek";
    String s2 = "abedgk";
    int n = s1.length();
    int m = s2.length();

    System.out.println(longcommonseq(s1,s2,n-1,m-1));
  }
}
