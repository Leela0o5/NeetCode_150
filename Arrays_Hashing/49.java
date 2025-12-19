package Arrays_Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hash = new HashMap<>();
        for (String s : strs) {
            int count[] = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i : count) {
                sb.append(i);
                sb.append('#');
            }
            String key = sb.toString();
            if (!hash.containsKey(key)) {
                hash.put(key, new ArrayList<>());
            }
            hash.get(key).add(s);
        }

        return new ArrayList<>(hash.values());

    }
}
