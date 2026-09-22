class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] output=new int[nums.length];
        int idx=0;
        for(int i=0;i<n;i++){
            output[idx]=nums[i];
            idx++;

            output[idx]=nums[i+n];
            idx++;
        }
        return output;
    }
}