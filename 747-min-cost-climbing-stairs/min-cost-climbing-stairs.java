class Solution {
    public int mincost(int []cost,int n,int dp[]){
        if(n==0||n==1) return cost[n];
        if(dp[n]!=-1) return dp[n];
        return dp[n]=cost[n]+Math.min(mincost(cost,n-1,dp),mincost(cost,n-2,dp));
    }
    public int minCostClimbingStairs(int[] cost) {
      int n=cost.length;
      int dp[]=new int[n];
      Arrays.fill(dp,-1);
      return Math.min(mincost(cost,n-1,dp),mincost(cost,n-2,dp));
    }
}