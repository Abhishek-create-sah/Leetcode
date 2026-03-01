// Question :- we have to make E 0 or below . At max 2 time a A[i] can use 
//Greedy Approach
import java.util.* ;
public class One_Energy
{
	private static int CalMin(int E , int[] A){
		Arrays.sort(A);
		int cnt = 0 ;
		for(int i = A.length-1 ; i >= 0 ; i--){
			for(int j = 0 ; j < 2 ;j++){
				E -= A[i];
				cnt++ ;
				if(E <= 0) return cnt ; // if satisfy return 
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int E = sc.nextInt();
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i = 0 ; i < N ; i++){
			A[i] = sc.nextInt();
		}
		System.out.println(CalMin(E,A));
	}
}