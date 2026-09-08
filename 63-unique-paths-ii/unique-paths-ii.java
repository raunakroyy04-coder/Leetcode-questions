class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        if(arr[0][0]==1||arr[m-1][n-1]==1) return 0;
        arr[0][0]=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if (i == 0 && j == 0) {
                    continue;
                }
              if(arr[i][j]==1){
                arr[i][j]=0;
              }
               else if(i==0){
                arr[i][j]=arr[i][j-1];
               }
               else if(j==0){
                arr[i][j]=arr[i-1][j];
               }
              else arr[i][j]+=arr[i-1][j]+arr[i][j-1];
            }
        }
        return arr[m-1][n-1];
    }
}