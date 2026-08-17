class Solution {
    public int fib(int n) {
        int i0=0;
        int i1=1;
        int fibo=0;
        if(n==0){
            return i0;
        }else if(n==1){
            return i1;
        }else{
            for(int i=2;i<=n;i++){
                fibo=i0+i1;
                
                i0=i1;
                i1=fibo;

            }
        }
        return fibo;
    }
}