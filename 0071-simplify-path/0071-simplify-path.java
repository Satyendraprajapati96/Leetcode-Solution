class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        
        // Split by '/' and process each component
        for (String part : path.split("/")) {
            if (part.equals("") || part.equals(".")) {
                // Skip empty strings (from consecutive slashes) and current dir
                continue;
            } else if (part.equals("..")) {
                // Go up one level if possible
                if (!stack.isEmpty()) {
                    stack.pollLast();
                }
            } else {
                // Valid directory/file name
                stack.addLast(part);
            }
        }
        
        // Build the canonical path
        if (stack.isEmpty()) {
            return "/";
        }
        
        StringBuilder sb = new StringBuilder();
        for (String dir : stack) {
            sb.append("/").append(dir);
        }
        
        return sb.toString();
    }
}