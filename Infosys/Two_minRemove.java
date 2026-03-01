/*****

Question : We have to remove min V from front so that hero win . Condn H*HP > V*VP or H*HP = V*VP

 ******/
import java.util.* ;
public class Two_minRemove
{
	private static int MinRemove(int V , int H , int HP , int VP[]){
		int mxhp = H * HP ; int temp = 0 ;
		for(int i = 0 ; i < VP.length ; i++){
			temp += VP[i];
		}
		int idx = 0 ;
		if(mxhp >= temp) return 0 ;
		while(mxhp < temp){
			temp -= VP[idx++];
		}
		return idx ;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int H = sc.nextInt();
		int HP = sc.nextInt();
		int VP[] = new int[V];
		for(int i = 0 ;i < VP.length;i++){
			VP[i] = sc.nextInt();
		}
		System.out.println(MinRemove(V,H,HP,VP));
		
	}
}