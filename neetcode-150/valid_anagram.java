/*Complete the function below*/
class GfG {
    public int remAnagrams(String s1, String s2) {
        // add code here.
        int[] frq = new int[26];
        
        for(char c: s1.toCharArray()){
            frq[c-'a']++;
        }
        for(char c: s2.toCharArray()){
            frq[c-'a']--;
        }
        
        int cnt = 0 ;
        for(int i : frq){
            cnt += Math.abs(i);
        }
        return cnt;
    }
}


/*
s1 = "bcadeh", s2 = "hea"  => Output: 3
s1 = "cddgk", s2 = "gcd"  => Output: 2
TC = O(n) 
 */