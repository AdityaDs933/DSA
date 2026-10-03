class Solution {
    public int minCostToMoveChips(int[] position) {
        int evenCount=0;
        int oddCount=0;
        for(int i=0;i<position.length;i++){
            if(position[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        if(evenCount<oddCount){
            return evenCount;
        }else{
            return oddCount;
        }
    }
}