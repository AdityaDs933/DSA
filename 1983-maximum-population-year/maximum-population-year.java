class Solution {
    public int maximumPopulation(int[][] logs) {
    int[] populationChange=new int[101];
    for(int i=0;i<logs.length;i++){
        int birth=logs[i][0];
        int death=logs[i][1];
        populationChange[birth-1950]++;
        populationChange[death-1950]--;
        }
        int maxPopulation=0;
        int maxYear=1950;
        int currentPopulation=0;
        for(int i=0;i<populationChange.length;i++){
            currentPopulation+=populationChange[i];
            if(currentPopulation>maxPopulation){
                maxPopulation=currentPopulation;
                maxYear=i+1950;
            }
        }
        return maxYear;
    }
}