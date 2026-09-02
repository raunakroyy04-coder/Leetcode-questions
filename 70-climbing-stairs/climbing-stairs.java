class Solution {
    public int count(int n,int dp[]){
        if(n<=2) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=(count(n-1,dp)+count(n-2,dp));
    }
    public int climbStairs(int n) {
        // if (n <= 2) return n;

        // int a = 1;  // ways to reach step 1
        // int b = 2;  // ways to reach step 2
        // int c = 0;

        // for (int i = 3; i <= n; i++) {
        //     c = a + b;  // current ways
        //     a = b;      // shift window
        //     b = c;
        // }

        // return c;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return count(n,dp);
    }
}
