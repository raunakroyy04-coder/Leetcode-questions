class Solution {
    public boolean canBeValid(String s, String locked) {
        int count=0;
        if(s.length()%2!=0) return false;
      for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(locked.charAt(i)=='0'){
                count++;
            }
            else if(ch=='('){
                count++;

            }
            else count--;
            if(count<0) return false;

        }
        count=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if(locked.charAt(i)=='0'){
                count++;
            }
            else if(ch==')'){
                count++;

            }
            else count--;
            if(count<0) return false;

        }
        return true;

    }
}