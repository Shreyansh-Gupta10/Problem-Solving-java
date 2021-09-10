package DYnamicProgramming;

public class Permutation {
    // static int fact(int n){
    //     if(n == 1){
    //         return 1;
    //     }
    //     return n*fact(n-1);
    // }
    static int Permutation(int dp[][], int n, int k){
        // if(n==k){
        //     dp[n][k] = fact(n);
        //     return dp[n][k];
        // }
        if(n<k){
            dp[n][k] = 0;
            return dp[n][k];
        }
        if(k==0){
            dp[n][k] = 1;
            return dp[n][k];
        }
        if(k == 1){
            dp[n][k] = n;
            return dp[n][k];
        }
        dp[n][k] = Permutation(dp, n-1, k) + k*Permutation(dp, n-1, k-1);
        return dp[n][k];
    }
    public static void main(String[] args) {
        int n = 5;
        int k = 2; 
        int dp[][] = new int[n+1][k+1];
        System.out.println(Permutation(dp, n, k));
    }
    
}
