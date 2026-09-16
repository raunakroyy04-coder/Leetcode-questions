class Solution {
    public boolean out(int i,int nums[],int dp[]){
        if(i>=nums.length-1){
            return true;
        }
        if(dp[i]!=-1) return dp[i]==1;
        for(int j=1;j<=nums[i];j++){
            if(out(i+j,nums,dp)){
                dp[i]=1;
                return true;
            }
        }
          dp[i] = 0;
        return false;
    }
    public boolean canJump(int[] nums) {
        int dp[]=new int[nums.length];
         Arrays.fill(dp,-1);
        return out(0,nums,dp);
    }
}