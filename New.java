import java.util.Arrays;

class New {
  private static int cnt = 0 ;
  private static int[] wavesort(int[] nums){
    int n = nums.length;
    if(n==1) return nums; 
    for(int i = 0 ; i < nums.length-1 ; i++){
      int temp = nums[i];
      nums[i] = nums[i+1];
      nums[i+1] = temp ;
      i++;
    }
    
    return nums;
  }
  
  private static int substring(String s1 , String s2 , int n , int m){
    if(n < 2 || n < 2) return 0 ;

    if(n >= 0 && m >= 0){
      if(s1.charAt(n) == s2.charAt(m)){
        cnt++ ;
        substring(s1,s2,n-1,m-1);
      }
      else {
        substring(s1,s2,n-1,m);
        substring(s1,s2,n,m-1);
      }   
    } 
  }
  public static void main(String[] args) {
    int[] arr= {1,2,3,4,5};
    System.out.println(Arrays.toString(wavesort(arr)));
  }
}
