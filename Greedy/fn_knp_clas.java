import java.util.*;

public class fn_knp_clas {
  static class Item {
    int wt ;
    int val ;
    double ratio ;

    Item(int w , int v){
      this.wt = w ;
      this.val = v ;
      this.ratio = (double)v/w ;
    }
  }

  private static double ks(int[] wt , int[] val , int W){
    Item[] items = new Item[wt.length];
    for(int i = 0 ; i < wt.length ; i++){
      items[i] = new Item(wt[i], val[i]);
    }

    Arrays.sort(items, (a,b) -> Double.compare(b.ratio,a.ratio)); // sort in dec

    double mxproft = 0;
    int cap = W ;

    for(Item item : items){
      if(cap >= item.wt){
        mxproft += item.val ;
        cap -= item.wt ;
      }
      else {
        mxproft += item.ratio*cap ;
        cap = 0 ;
        break ;
      }
    }

    return mxproft;
  }
  public static void main(String[] args){
    int[] wt = {10,20,30};
    int[] val = {60,100,120};
    int W = 50 ; //240

    int[] wt1 = {20,10,50,50};
    int[] val1 = {100,60,100,200};
    int W1 = 90 ; // 380



    System.out.println(ks(wt,val,W));
    System.out.println(ks(wt1,val1,W1));

  }
}
