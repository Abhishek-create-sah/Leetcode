class Solution {
    private static long mod = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long e = (n+1)/2;
        long o = n/2 ;

        long f = pow(5,e); // 0,2,5,6,8
        long s = pow(4,o); //2,3,5,7

        return (int)((f*s)%mod);
    }

    private static long pow(int x ,long n){
        if(n == 0) return 1;

        long h = pow(x,n/2)%mod;

        if(n % 2 == 0){
          return (h*h)%mod;
        }
        return (h*h*x)%mod;
    }
}