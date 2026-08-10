class Solution {
    public boolean solve(int n,Boolean dp[]){
        if(n == 0) return false;
        if(dp[n] != null) return dp[n];
        for(int i = 1;i*i<=n;i++){
            int square = i*i;
            if(!solve(n-square,dp)){
                dp[n] = true;
                return true;
            }
        }
        dp[n]  = false;
        return dp[n];
    }

    public boolean winnerSquareGame(int n) {
        Boolean dp[] = new Boolean[n+1];
       return solve(n,dp);
    }
}
