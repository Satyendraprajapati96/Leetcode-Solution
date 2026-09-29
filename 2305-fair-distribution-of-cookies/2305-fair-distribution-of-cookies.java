class Solution {
  int ans = Integer.MAX_VALUE;

    public int distributeCookies(int[] cookies, int k) {
        backtrack(cookies, 0, new int[k], k);
        return ans;
    }

    private void backtrack(int[] cookies, int index, int[] children, int k) {
        // Pruning: if current max already >= best answer, stop
        int max = 0;
        for (int c : children) {
            if (c > max) max = c;
        }
        if (max >= ans) return;

        // All bags distributed
        if (index == cookies.length) {
            ans = Math.min(ans, max);
            return;
        }

        for (int i = 0; i < k; i++) {
            children[i] += cookies[index];
            backtrack(cookies, index + 1, children, k);
            children[i] -= cookies[index];

            // Optimization: if this child had 0 cookies before, no point
            // trying subsequent empty children (symmetry breaking)
            if (children[i] == 0) break;
        }
    }
}