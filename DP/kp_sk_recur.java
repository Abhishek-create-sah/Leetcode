package DP;

public class kp_sk_recur {
  private static int knapSack(int wt[] , int val[] , int W , int n){
    if(W==0 || n==0) return 0 ;

    if(wt[n-1] <= W){
      //include 
      int ans1 = val[n-1]+knapSack(wt,val,W-wt[n-1],n-1);
      //exclude
      int ans2 = knapSack(wt,val,W,n-1);

      return Math.max(ans1,ans2);
    }
    else {
      //exclude
      return knapSack(wt,val,W,n-1);
    }
  }
  public static void main(String[] args) {
    int[] wt = { 2,5,1,3,4 };
    int[] val = { 15,14, 10, 45, 30 };
    int W = 7;
    System.out.println(knapSack(wt, val, W, wt.length));
  }
}


// This recursion is inefficient as all items have choice of include/exclude . so it will take exponential time (2^n).