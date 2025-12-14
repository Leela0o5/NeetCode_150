package Arrays_Hashing;

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for (int num : nums) {
            map.add(num);
        }
        if (map.size() < nums.length) {
            return true;
        }
        return false;
    }
}
