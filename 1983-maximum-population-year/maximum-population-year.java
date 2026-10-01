class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] population=new int[101];
        for(int i=0;i<logs.length;i++){
            int birth=logs[i][0];
            int death=logs[i][1];
            population[birth-1950]++;
            population[death-1950]--;
        }
        int maxpopulation=population[0];
        int maxYear=1950;
        for(int i=1;i<101;i++){
            population[i]+=population[i-1];
            if(population[i]>maxpopulation){
                maxpopulation=population[i];
                maxYear=i+1950;
            }
        }
        return maxYear;
    }
}