class Solution {
    public List<String> restoreIpAddresses(String s) {
         List<String> res = new ArrayList<>();
        int n = s.length();
        if (n < 4 || n > 12) return res;
        backtrack(s, 0, new String[4], 0, res);
        return res;
    }

    private void backtrack(String s, int start, String[] segs, int idx, List<String> res) {
        if (idx == 4) {
            if (start == s.length()) {
                res.add(String.join(".", segs));
            }
            return;
        }
        for (int len = 1; len <= 3 && start + len <= s.length(); len++) {
            String seg = s.substring(start, start + len);
            if (seg.length() > 1 && seg.charAt(0) == '0') break; // no leading zeros
            if (Integer.parseInt(seg) > 255) break;               // out of range
            segs[idx] = seg;
            backtrack(s, start + len, segs, idx + 1, res);

        }
    }
}