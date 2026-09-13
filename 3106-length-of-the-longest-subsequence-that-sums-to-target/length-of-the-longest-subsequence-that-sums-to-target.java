class Solution {
    public int count(int i,List<Integer> nums,int target,int dp[][]){
        if(target==0) return 0;
        if(i==nums.size()) return -1000000;
        if(dp[i][target]!=-1) return dp[i][target];
        int skip=count(i+1,nums,target,dp);
        int pick=-1000000;
        if(nums.get(i)<=target)
       {  pick=1+count(i+1,nums,target-nums.get(i),dp);}
        return dp[i][target]=Math.max(pick,skip);
    }
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int[][] dp = new int[nums.size()][target + 1];

        for (int i = 0; i < nums.size(); i++) {
            Arrays.fill(dp[i], -1);
        }
      int ans= count(0,nums,target,dp);  
        return ans < 0 ? -1 : ans;
    }
}