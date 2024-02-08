class Solution {
    private Map<Integer, Integer> dp = new HashMap();
    public int numSquares(int n) {
        if (n == 0) {
            return 0;
        }

        if (dp.containsKey(n)) {
            return dp.get(n);
        }

        int ans = Integer.MAX_VALUE;
        for (int i=1; i<=n; i++) {
            if (i*i <= n) {
                int curr = numSquares(n-(i*i));
                ans = Math.min(ans, curr);
            } else {
                break;
            }
        }
        dp.put(n, ans + 1);
        return dp.get(n);
    }
}
