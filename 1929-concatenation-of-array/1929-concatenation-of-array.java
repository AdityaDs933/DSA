class Solution {
    public int[] getConcatenation(int[] nums) {
        int length=2*nums.length;
        int n=nums.length;
        int[] ans=new int[length];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
}