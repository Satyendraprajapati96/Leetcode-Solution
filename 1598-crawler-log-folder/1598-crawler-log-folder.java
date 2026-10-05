class Solution {
    public int minOperations(String[] logs) {
         int depth = 0;
        for (String log : logs) {
            if (log.equals("../")) {
                // Move to parent folder, but never go above main
                depth = Math.max(0, depth - 1);
            } else if (!log.equals("./")) {
                // Entering a child folder
                depth++;
            }
            // "./" does nothing
        }
        return depth;
    }
}