package DP;
//i = s1 , j = s2 . dp[i][j] = lc Substring in i ,j
public class lcsubstring {
  private static int lcs(String s1,String s2){
    int n = s1.length(); int m = s2.length() ;
    if(n == 0 || m == 0 ) return 0;

    int[][] dp = new int[n+1][m+1];

    int mx  = 0 ; // max val can be store at any point of time in dp
    for(int i = 1; i < dp.length ; i++){
      for(int j = 1 ; j < dp[0].length ; j++){
        if(s1.charAt(i-1) == s2.charAt(j-1)){
          dp[i][j] = dp[i-1][j-1]+1;
          mx = Math.max(mx,dp[i][j]);
        } else {
          dp[i][j] = 0 ;
        }
      }
    }

    return mx ;
  }
 public static void main(String[] args) {
    String s1 = "abcfdek";
    String s2 = "acfdk";  
    System.out.println(lcs(s1,s2));  
  }
}
