class Solution {
    public static int getfib(int n){
        if(n<2){
            return n;
        }
        return getfib(n-2)+ getfib(n-1);
    }
    public int fib(int n) {
        return getfib(n);
    }
}