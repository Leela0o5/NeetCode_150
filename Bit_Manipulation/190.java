package Bit_Manipulation;

class Solution {
    public int reverseBits(int n) {
        // o(1)
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int bit = (n >> i) & 1;
            res |= (bit << (31 - i));
        }
        return res;
    }
}