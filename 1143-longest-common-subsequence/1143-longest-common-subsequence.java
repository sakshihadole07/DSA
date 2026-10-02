class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n1=text1.length();
        int n2=text2.length();
        int[][] dp=new int[n1+1][n2+1];
        for(int i=0; i<=n1; i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(0,0, text1,text2,dp); 
    }
    public int helper(int i, int j, String text1, String text2, int[][] dp){
        if(i==text1.length() || j==text2.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(text1.charAt(i)==text2.charAt(j)){
            return 1+helper(i+1, j+1, text1, text2,dp);
        }else{
            dp[i][j] = Math.max(
                helper(i+1, j, text1, text2,dp), helper(i, j+1, text1, text2,dp)
            );
        }
         return dp[i][j];
    }
}