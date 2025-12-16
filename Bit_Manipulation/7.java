package Bit_Manipulation;

class Solution {
    public int reverse(int n) {
        int res = 0;
        boolean isNeg = false;
        if (n < 0) {
            n *= -1;
            isNeg = true;
        }
        while (n != 0) {
            int ld = n % 10;
            if (res > (Integer.MAX_VALUE - ld) / 10) {
                return 0;
            }
            res = (res * 10) + ld;
            n /= 10;
        }
        if (isNeg) {
            res *= -1;
        }
        return res;
    }
}
