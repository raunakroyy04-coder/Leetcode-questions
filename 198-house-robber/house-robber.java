class Solution {
    public int maxcash(int nums[],int i,int dp[]){
        int n=nums.length;
        if(i>=n) return 0;
        if(dp[i]!=-1) return dp[i];
        int take=nums[i]+(maxcash(nums,i+2,dp));
        int skip=maxcash(nums,i+1,dp);
        return dp[i]=Math.max(take,skip);
    }
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return maxcash(nums,0,dp);

    }
}