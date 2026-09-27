class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int count=0;
        int[] rowCount=new int[m];
        int[] colCount=new int[n];
        for(int[] cell:indices){
            rowCount[cell[0]]++;
            colCount[cell[1]]++;

        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((rowCount[i]+colCount[j])%2!=0){
                    count++;
                }
            }
        }
        return count;
    }
}