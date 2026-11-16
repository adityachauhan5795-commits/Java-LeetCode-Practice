
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        long a = dividend;
        long b = divisor;
        boolean negative = false;
        if (a < 0) {
            a = -a;
            negative = !negative;
        }
        if (b < 0) {
            b = -b;
            negative = !negative;
        }
        long ans = 0;
        while (a >= b) {
            long temp = b;
            long count = 1;
            while (a >= temp + temp) {
                temp = temp + temp;
                count = count + count;
            }
            a = a - temp;
            ans = ans + count;
        }
        if (negative) {
            ans = -ans;
        }
        return (int) ans;
    }
}

