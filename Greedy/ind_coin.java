import java.util.*;
public class ind_coin {

  private static int mxcoin(int coin[] , int amt){
    if(amt == 0) return 0 ;
    Arrays.sort(coin);
    int cnt = 0 ;
    for(int i = coin.length-1 ; i >= 0 ; i--){
      if(coin[i] <= amt){
        while(coin[i] <= amt){
          amt -= coin[i];
          cnt++;
        }
      }
    }
    return cnt ;
  }
  public static void main(String[] args) {
    int[] coin = {1,2,5,10,20,50,100,200,500,2000};
    int amt = 590 ;
    System.out.println(mxcoin(coin,amt));
  }
}
