class Solution {
    public int divide(int dividend, int divisor) {
         if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        // Determine the sign of the result
        boolean negative = (dividend < 0) ^ (divisor < 0);
        
        // Work with positive values to avoid overflow issues
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);
        
        int quotient = 0;
        
        // Subtract divisor multiples from dividend using bit shifting
        while (absDividend >= absDivisor) {
            long temp = absDivisor;
            int multiple = 1;
            
            // Find the largest multiple where divisor * multiple <= dividend
            while (absDividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            
            absDividend -= temp;
            quotient += multiple;
        }
        
        // Apply sign
        return negative ? -quotient : quotient;
    }
}