class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int sum=candies[0];
        for(int i=1;i<candies.length;i++){
            if(candies[i]>sum){
                sum=candies[i];
            }
        }
        List<Boolean> result=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=sum){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}