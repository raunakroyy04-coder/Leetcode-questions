class Solution {
    public int findpath(int grid[][],int i,int j,int m,int n,int dp[][]){
        if(i==m-1&&j==n-1) return grid[m-1][n-1];
        if(dp[i][j]!=-1) return dp[i][j];
        if(i==m-1) return dp[i][j]= grid[i][j]+findpath(grid,i,j+1,m,n,dp);
        if(j==n-1) return dp[i][j]= grid[i][j]+findpath(grid,i+1,j,m,n,dp);
        return dp[i][j]= grid[i][j]+Math.min(findpath(grid,i+1,j,m,n,dp),findpath(grid,i,j+1,m,n,dp));
    }
  public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return findpath(grid,0,0,m,n,dp);
    }
}