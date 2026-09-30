class Solution {
    public int uniquePaths(int m, int n) {
       int[][] dp=new int[m+1][n+1];
       for(int i=0; i<m; i++){
         for(int j=0; j<n; j++){
            dp[i][j]=-1;
         }
       }
      return rec(0,0,m,n,dp);
    }
    public int rec(int i, int j, int m, int n,int[][]dp){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i>=m || j>=n){
            return 0;
        }
        if(dp[i][j]!=-1){
           return dp[i][j];
        }
        int down=rec(i+1, j, m,n,dp);
        int right=rec(i,j+1,m,n,dp);
        dp[i][j] = down+right; 
        return dp[i][j];
    }
}