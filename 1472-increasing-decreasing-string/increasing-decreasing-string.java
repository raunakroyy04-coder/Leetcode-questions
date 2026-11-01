class Solution {
    public String sortString(String s) {
        int frq[]=new int[26];
        for(char ch:s.toCharArray()){
            frq[ch-'a']++;
        }
        StringBuilder ans=new StringBuilder();
        while(ans.length()<s.length()){
            for(int i=0;i<26;i++){
                if(frq[i]>0){
                    ans.append((char)(i+'a'));
                    frq[i]--;

                }
            }
             for(int i=25;i>=0;i--){
            if(frq[i]>0){
                ans.append((char)(i+'a'));
                frq[i]--;
            }
        }
        }
       return ans.toString();

    }

}