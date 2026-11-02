class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }

        // Keep the DP array as short as possible.
        if (s1.length() < s2.length()) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }

        // dp[j] indicates whether the current prefixes of s1 and s2
        // can form the corresponding prefix of s3.
        boolean[] dp = new boolean[s2.length() + 1];
        dp[0] = true;

        for (int j = 1; j <= s2.length(); j++) {
            dp[j] = dp[j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1);
        }

        for (int i = 1; i <= s1.length(); i++) {
            dp[0] = dp[0] && s1.charAt(i - 1) == s3.charAt(i - 1);

            for (int j = 1; j <= s2.length(); j++) {
                char target = s3.charAt(i + j - 1);

                dp[j] =
                    (dp[j] && s1.charAt(i - 1) == target) ||
                    (dp[j - 1] && s2.charAt(j - 1) == target);
            }
        }

        return dp[s2.length()];
    }
}