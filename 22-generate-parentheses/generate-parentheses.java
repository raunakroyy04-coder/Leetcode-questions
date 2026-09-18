class Solution {
    public void generate(int l,int r, int n,String s,List<String> ans){
        if(r==n){
            ans.add(s);
            return;
        }
        if(l<n) generate(l+1,r,n,s+"(",ans);
        if(r<l) generate(l,r+1,n,s+")",ans);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        generate(0,0,n,"",ans);
        return ans;
    }
}