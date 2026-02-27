// for capacity W maximum profit 

// Approach 
//  weight min profit max

//  ratio = profit/weight 
//  higher ratio first
//  sort the items according to ratio in decreasing order

//  pseudo code

//  cal ratio
//  sort
//  for loop n-1
//  if cap >= weight[i]
//  profit += profit[i]
//  cap -= weight[i]
//  else val += ratio[i] * cap
//  break

import java.util.*;
class fract_knap{
  public static void main(String[] arg){
    int[] weight = {10,20,30};
    int[] val = {60,100,120};
    
    int W = 50 ;

    int ratio[] = new int[weight.length];

    for(int i = 0 ; i < weight.length ; i++){
      ratio[i] = val[i]/weight[i];
    }

    Arrays.sort(ratio);
    int profit = 0 ;
    int cap = W ;

    for(int i = ratio.length-1 ; i >= 0 ; i--){
      if(cap >= weight[i]){
        profit += val[i];
        cap -= weight[i];
      } else {
        profit += ratio[i] * cap;
        cap = 0 ;
        break;
      }
    }
    System.out.println(profit);
  }
}