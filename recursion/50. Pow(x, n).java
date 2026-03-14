// why it best no stack overflow

class Solution {
    private double help(double x , long n){
        if(n == 0) return 1.0;

        double h = help(x,n/2);
        if(n%2 == 0){
            return h*h;
        }
        else return h*h*x;
    }
    public double myPow(double x, int n) {
        long N = n ;
        if(N < 0){
            x = 1/x;
            N = -N;
        }
        return help(x,N);
    }
}