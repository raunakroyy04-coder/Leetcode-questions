class Solution {
    public boolean checkValidString(String s) {
       Stack<Integer> st=new Stack<>();
       Stack<Integer> star=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='('&&ch!=')'&&ch!='*') return false;
            if(ch=='('){
                st.push(i);
            }
            else if(ch==')') {
                if(!st.isEmpty()){
                    st.pop();
                }
                else if(!star.isEmpty()){
                    star.pop();
                }
                else return false;
            }
            else{
                star.push(i);
            }
            
        }
        while(!st.isEmpty()&&!star.isEmpty()){
           if(st.peek()<star.peek())
            {st.pop();
            star.pop();}
            else return false;
        }
        return st.isEmpty();
    }
}