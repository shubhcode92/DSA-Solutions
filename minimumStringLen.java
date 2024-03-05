class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        int left = 0;
        int right = n-1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) break;
            int prefix = left+1;
            int sufix = right-1;
            while (prefix < right && s.charAt(prefix) == s.charAt(left)) {
                prefix++;
            }
            left = prefix;

            while(sufix > left && s.charAt(sufix) == s.charAt(right)) {
                sufix--;
            }
            right = sufix;
        }

        return (right - left) + 1;
    }
}
