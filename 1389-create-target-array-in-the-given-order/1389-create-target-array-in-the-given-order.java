class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> List=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            List.add(index[i],nums[i]);
        }
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i]=List.get(i);
        }
        return result;

    }
}