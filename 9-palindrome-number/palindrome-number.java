class Solution{
    public boolean isPalindrome(int n){
        int original=n;
        int reverse=0;
        if(original<0){
            return false;
        }

        while(n>0){
            int rem=(n%10);
            reverse=reverse*10+rem;
            n/=10;
        }
        if(original==reverse){
            return true;
        }else{
            return false;
        }
    }
}