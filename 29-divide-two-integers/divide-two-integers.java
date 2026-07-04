class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        int quotient = 0;

        for (int i = 31; i >= 0; i--) {
            if ((dvd >> i) >= dvs) {
                dvd -= (dvs << i);
                quotient += (1 << i);
            }
        }

        if ((dividend < 0) ^ (divisor < 0)) {
            quotient = -quotient;
        }

        return quotient;
    }
}