class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int current_number=nums[i];
            int needed_number=target-current_number;
            if(map.containsKey(needed_number)){
                int old_index=map.get(needed_number);
                return new int[]{old_index,i};
            }else{
                map.put(current_number,i);
            }
        }
        return new int[]{};
    }
}