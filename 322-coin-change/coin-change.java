class Solution {
    public long count(int i,int []coin,int amount,long dp[][]){
        if(i==coin.length){
            if(amount==0) return 0;
            else return Integer.MAX_VALUE;
        }
        if(dp[i][amount]!=-1) return dp[i][amount];
        long skip=count(i+1,coin,amount,dp);
        if(amount-coin[i]<0) return skip;
        long pick=1+count(i,coin,amount-coin[i],dp);
        return dp[i][amount]=Math.min(skip,pick);
    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        long dp[][]=new long[n][amount+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
       int ans=(int)count(0,coins,amount,dp);
       if(ans==Integer.MAX_VALUE) return -1;
       return ans;

     }
}