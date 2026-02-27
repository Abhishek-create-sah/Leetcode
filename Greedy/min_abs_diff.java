import java.util.*;

public class min_abs_diff {
  private static int msd(int[]a , int[]b){
    Arrays.sort(a);
    Arrays.sort(b);

    int s = 0 ;
    for(int i = 0 ; i < a.length ; i++){
      s += Math.abs(a[i]-b[i]);
    }
    return s ;
  }
  public static void main(String[] args) {
    int[] A = {1,2,3};
    int[] B = {2,1,3};

    int[] C = {2,3,4,6};
    int[] D = {7,3 ,5 ,8};

    
    System.out.println(msd(A,B));
    System.out.println(msd(C,D));
  }
}
