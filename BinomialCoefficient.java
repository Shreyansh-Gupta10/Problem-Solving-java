package DYnamicProgramming;

public class BinomialCoefficient {
     static int BinomialCoefficient(int n, int r, int dp[][]){
        if(dp[n][r] != 0){
            return dp[n][r];
        }
        if(n-r == 1){
            dp[n][r] = n;
            return dp[n][r];
        }
        if(n==r){
            dp[n][r] = 1;
            return dp[n][r];
        }
        if(r == 1){
            dp[n][r] = n;
            return dp[n][r];
        }
        dp[n][r] = BinomialCoefficient(n-1, r-1, dp) + BinomialCoefficient(n-1, r, dp);
        return dp[n][r];
    }
    
    public static void main(String[] args) {
        int n = 6;
        int r = 4;
         
        int dp[][] = new int[n+1][r+1];
         
        System.out.println(BinomialCoefficient(n,r,dp));
    }
}
