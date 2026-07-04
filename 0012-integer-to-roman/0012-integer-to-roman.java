class Solution {
    static int[] val={1000,900,500,400,100,90,50,40,10,9,5,4,1};
    static String[] symbol={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    public String intToRoman(int num) {
        String result="";
        for (int i=0;i<13;i++){
            int times=num/val[i];
            while(times>0){
                result+=symbol[i];
                times--;
            }
            num=num%val[i];

        }
        return result;
        
    }
}