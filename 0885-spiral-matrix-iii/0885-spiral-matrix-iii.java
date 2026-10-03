class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result=new int[rows*cols][2];
        int[][] dirs={{0,1},{1,0},{0,-1},{-1,0}};

        int count=0;
        int r=rStart;
        int c=cStart;
        int d=0;
        int len=0;
        result[count++]=new int[]{r,c};
        while(count<rows*cols){
            if(d==0 || d==2){
                len++;
            }
            for(int i=0;i<len;i++){
                r+=dirs[d][0];
                c+=dirs[d][1];

                if(r>=0 && c>=0 && r<rows&& c<cols){
                    result[count++]=new int[]{r,c};
                }
            }
            d=(d+1)%4;
        }
        return result;
    }
}