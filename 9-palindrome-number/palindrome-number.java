class Solution{
    public boolean isPalindrome(int n){
        if(n<0){
            return false;
        }
        String str=String.valueOf(n);
        StringBuilder palindrome=new StringBuilder(str);
        palindrome.reverse();

        return palindrome.toString().equals(str);
    }
}