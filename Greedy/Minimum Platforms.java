import java.util.* ;
//Brute Force -> take s = arr[i],e = dep[i] and check if any interval come b/w them then incrs cnt and return mxcnt; TC=O(n^2)
//condn if(s < arr[i] || e < dep[i]) cnt++
class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i = 0 ;int j = 0 ; int cnt = 0 ; int mx = 0 ;
        while(i < arr.length){
            if(arr[i] <= dep[j]){
                cnt++;
                i++;
                
            }
            else {
                cnt--;
                j++;
            }
            mx = Math.max(mx,cnt);
        }
        return mx;
    }
}

2O(nlogn + n)