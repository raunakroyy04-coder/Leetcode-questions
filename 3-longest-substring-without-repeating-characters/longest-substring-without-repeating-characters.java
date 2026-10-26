class Solution {
    public int lengthOfLongestSubstring(String s) {
     int i=0;
     int max=0;
     Set<Character> st=new HashSet<>();
     for(int j=0;j<s.length();j++){
        char ch=s.charAt(j);
        while(st.contains(ch)){
            st.remove(s.charAt(i));
            i++;
        }
        st.add(ch);
        max=Math.max(max,j-i+1);
     }
     return max;
    }
}