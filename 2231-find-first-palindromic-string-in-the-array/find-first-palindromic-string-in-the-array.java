class Solution {
    public String firstPalindrome(String[] words) {
      int n=words.length;
      for(int i=0;i<n;i++){
        String s=words[i];
        int left=0;
        int right=s.length()-1;
        boolean hai=true;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
               hai=false;
               break;
            }
            left++;
            right--;
        }
        if(hai) return s;

      }  
      return "";
    }
}