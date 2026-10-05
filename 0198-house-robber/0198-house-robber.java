class Solution {
    public int rob(int[] nums) {
        if(nums==null || nums.length==0) return 0;

        int rob1=0;
        int rob2=0;
        for(int num:nums){
            int currentMax=Math.max(num+rob1,rob2);
            rob1=rob2;
            rob2=currentMax;
        }
        return rob2;
    }
}