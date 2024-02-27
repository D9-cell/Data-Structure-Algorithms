import java.util.Arrays;

public class Fibonacci {

    private int fiboMemo(int n,int[] dp){
        if(n <= 1) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = fiboMemo(n-1,dp) + fiboMemo(n-2,dp);
    }

    private int fiboTab(int n){
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    private int fiboSpaceOpti(int n){
        int prev2 = 0,prev = 1;
        for (int i = 2; i <= n; i++) {
            int curI = prev + prev2;
            prev2 = prev;
            prev = curI;
        }
        return prev;
    }
}
