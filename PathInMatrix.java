class Solution {
    long numberOfPath(int n, int k, int [][]arr) {
        // code here
        long[][][] dp = new long[n+1][n+1][k+1];
        
        for (long[][] a : dp) {
            for (long[] b : a) {
                Arrays.fill(b, -1);
            }
        }
        return helper(arr, k, n-1, n-1, dp);
    }
    
    public long helper(int[][] arr, int k, int i, int j, long[][][] dp) {
        if (i < 0 || j < 0) {
            return 0;
        }
        
        if (k >= 0 && dp[i][j][k] != -1) {
            return dp[i][j][k];
        }
        
        if (i == 0 && j==0) {
            k = k - arr[i][j];
            return k == 0 ? 1 : 0;
        }
        int a = 0;
        if (k-arr[i][j] >= 0) {
            a += helper(arr, k-arr[i][j], i-1, j, dp) + helper(arr, k-arr[i][j], i, j-1, dp);
        }
        return dp[i][j][k] = a;
    }
}
