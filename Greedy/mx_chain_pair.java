 import java.util.*;
public class mx_chain_pair {

private static int mxpair(int[][] p){
  Arrays.sort(p,(a,b) -> Integer.compare(a[1],b[1]));
  int st = p[0][1] ;
  int cnt = 1 ;

  for(int i =1 ; i < p.length ; i++){
    if(p[i][0] >= st){
      cnt++ ;
      st = p[i][1];
    }
  }
  return cnt ;
}
  public static void main(String[] args) {
    int[][] pairs = {{5,24},{39,60},{5,28},{27,40},{50,90}};
    System.out.println(mxpair(pairs));
  }
}
