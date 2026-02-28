// Given a board of size m*n, we have to cut the board into 1*1 pieces. The cost of cutting along a horizontal line is given in an array Hcost[] and the cost of cutting along a vertical line is given in an array Vcost[]. We have to find the minimum cost to cut the board into 1*1 pieces.

//Approach 
// we have sort in desc both arr 
// compare the cost 
// if hcost < vcost
// then cost += vcost*hp
// else cost += hcost*vp


import java.util.*;
public class cholo_probm {

  private static int mncost(Integer[] Hcost , Integer[] Vcost){
    int cost = 0 ; int h = 0 , v = 0 ;
    int vp = 1 ; int hp = 1 ;
    Arrays.sort(Hcost , Collections.reverseOrder());
    Arrays.sort(Vcost , Collections.reverseOrder());

    while(h < Hcost.length && v < Vcost.length){
      if(Hcost[h] < Vcost[v]){
        cost += (Vcost[v]*hp) ;
        vp++;
        v++ ;
      } else {
        cost += (Hcost[h]*vp);
        hp++ ;
        h++ ;
      }
    }
    while(h < Hcost.length){
      cost += (Hcost[h]*vp);
        hp++ ;
        h++ ;
    }

    while(v < Vcost.length){
      cost += (Vcost[v]*hp) ;
      vp++;
      v++ ;
    }
    return cost ;
  }
  public static void main(String[] args) {
    Integer[] HC = {4,1,2};
    Integer[] VC = {2,1,3,1,4};

    Integer[] HC1 = {2,3,1};
    Integer[] VC1 = {2,3,1,4};
    
    System.out.println(mncost(HC1,VC1)); // 36
    System.out.println(mncost(HC,VC)); // 42
  }
}
