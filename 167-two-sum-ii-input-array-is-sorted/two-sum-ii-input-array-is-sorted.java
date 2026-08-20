class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        int i=0;
        int j=0;

        while(left<right){
            int current_target=numbers[left]+numbers[right];
            if(current_target==target){
                return new int[]{left+1,right+1};
 
                
            }else if(current_target>target){
                right--;
            }else if(current_target<target){
                left++;
            }
        }
        return new int[]{};
        
    }
}