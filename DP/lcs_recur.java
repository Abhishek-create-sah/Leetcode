package DP;

public class lcs_recur {
  private static int longcommonseq(String s1 , String s2 , int m , int n){
    if(m == 0 || n == 0) return 0 ;

    if(s1.charAt(m) == s2.charAt(n)){
      return longcommonseq(s1,s2,m-1,n-1)+1;
    }
    else {
      int ans1 = longcommonseq(s1,s2,m-1,n);
      int ans2 = longcommonseq(s1,s2,m,n-1);
      return Math.max(ans1, ans2);
    }
  }
  public static void main(String[] args) {
    String s1 = "abcdge";
    String s2 = "abedg";
    int m = s1.length();
    int n = s2.length();
    System.out.println(longcommonseq(s1,s2,m-1,n-1));
  }
}
