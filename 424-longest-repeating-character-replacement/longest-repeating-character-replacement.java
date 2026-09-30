class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> mp=new HashMap<>();
        int i=0;
        int max=0;
        int ans=0;
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            max=Math.max(max,mp.get(ch));
            while((j-i+1)-max>k){
                char left=s.charAt(i);
                mp.put(left, mp.get(left) - 1);
                i++;
            }
            ans=Math.max(ans,j-i+1);
        }
        return ans;
    }
}