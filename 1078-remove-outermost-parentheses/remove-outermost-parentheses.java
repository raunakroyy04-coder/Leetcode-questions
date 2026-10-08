class Solution {
    public String removeOuterParentheses(String s) {
        int bal=0;
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(bal>0){
                    ans.append(ch);
                }
                bal++;
            }
            else{
                bal--;
                if(bal>0){
                   ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
}
