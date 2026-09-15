class Solution {
    public long ans(int i,int[] nums,int parity,int x,long dp[][]){
        if(i==nums.length){
            return 0;
        }
        if(dp[i][parity]!=-1) return dp[i][parity];
        long skip=ans(i+1,nums,parity,x,dp);
          int currParity = nums[i] % 2;
         long cost = 0;
        if (currParity != parity) {
            cost = x;
        }
        long pick = nums[i] - cost+ ans(i + 1,nums, currParity, x,dp);

        return dp[i][parity] = Math.max(skip, pick);

    }
    public long maxScore(int[] nums, int x) {
        int n=nums.length;
        long dp[][]=new long[n][2];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int parity=nums[0]%2;
        return nums[0]+ans(1,nums,parity,x,dp);
    }
}