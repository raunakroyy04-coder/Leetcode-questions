class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
       HashMap<String,String> mp=new HashMap<>();
        for(List<String> ele:knowledge){
            mp.put(ele.get(0),ele.get(1));
        }
        StringBuilder sb=new StringBuilder();
        int start=-1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
              start=i;  
            }
            else if(c==')'){
                String key=s.substring(start+1,i);
                sb.append(mp.getOrDefault(key,"?"));
                start=-1;
            }
            else if(start<0){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}