// How many maximum activity one can do the most 

// algorithm
// 1. Sort the end time 
// 2. Select the 1st activity
// 3. Run loop (to select non-overlaping(disjoint))
// 4. select if(start_time >= last_chosen activity end_time)
// 5. cnt++ ;

//code 

import java.util.*;

public class ActivitySelection {
public static void main(String[] args) {
  int start[] = {1, 3, 0, 5, 8, 5};
  int end[]= {2, 4, 6, 7, 9, 9};

  //end time sorted

  int mxact = 0 ;
  ArrayList<Integer> ans = new ArrayList<>();

  mxact  = 1 ;
  ans.add(0);

  int lastEnd = end[0];
  for(int i = 1; i < end.length ; i++){
    if(start[i] >= lastEnd){
      mxact++;
      ans.add(i);
      lastEnd = end[i];
    }
  }

  System.out.println("Maximum activities: " + mxact);

  for(int i : ans){
    System.out.print(i + " ");
  }
}
}