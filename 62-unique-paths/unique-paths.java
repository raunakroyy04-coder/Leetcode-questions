class Solution {
    public int paths(int cr,int cc,int lr,int lc,int dp[][]){
        if(cc==lc&&cr==lr) return 1;
        if(cc>lc||cr>lr) return 0;
         if (dp[cr][cc] != -1)
            return dp[cr][cc];

        return (dp[cr][cc]=paths(cr,cc+1,lr,lc,dp) + paths(cr+1,cc,lr,lc,dp));
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return paths(0,0,m-1,n-1,dp);
    }
}