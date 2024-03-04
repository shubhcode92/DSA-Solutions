class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int shubhc = 0;
        int n = tokens.length;

        Arrays.sort(tokens);
        int left = 0;
        int right = n-1;

        while (left <= right) {
            if (power >= tokens[left]) {
                shubhc++;
                power -= tokens[left];
                left++;
            } else {
                if (left != right && shubhc >= 1) {
                    power += tokens[right];
                    shubhc--;
                }
                right--;
            }
        }

        return shubhc;
    }
}
