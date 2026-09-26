class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> map=new HashMap<>();
        for(List<String> list:knowledge){
            map.put(list.get(0),list.get(1));
        }
        StringBuilder result=new StringBuilder();
        StringBuilder currentKey=new StringBuilder();
        boolean insideKey=false;

        for(char c:s.toCharArray()){
            if(c=='('){
                insideKey=true;
            }else if(c==')'){
                insideKey=false;
                result.append(map.getOrDefault(currentKey.toString(),"?"));
                currentKey.setLength(0);
            }else{
                if(insideKey){
                    currentKey.append(c);
                }else{
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}