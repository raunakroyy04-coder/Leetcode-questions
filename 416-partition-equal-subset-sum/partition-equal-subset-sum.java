class Solution {
    public boolean subset(int i,int nums[],int target,int dp[][]){
        if(i==nums.length){
            if(target==0) return true;
            return false;
        }
        if(dp[i][target]!=-1) return (dp[i][target]==1);
        boolean ans=false;
        boolean skip=subset(i+1,nums,target,dp);
        if(target-nums[i]<0){
            ans=skip;
        }
        else{
            boolean pick=subset(i+1,nums,target-nums[i],dp);
            ans=skip||pick; 
        }
        if(ans) dp[i][target]=1;
        else dp[i][target] =0;
        return ans;
    }
    public boolean canPartition(int[] nums) {
    int sum=0;
    for(int ele:nums) sum+=ele;
        if(sum%2!=0) return false;
        int target=sum/2;
        int n=nums.length;
        int dp[][]=new int [n][target+1];
        for(int i=0;i<dp.length;i++)
        for(int j=0;j<dp[0].length;j++)
        dp[i][j]=-1;
            
            return subset(0,nums,target,dp);
    }
}