class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, res = 0;
        Map<Character, Integer> freq = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            
            // shrink window if more than k unique
            if (freq.containsKey(c)) {
                left = Math.max(left, freq.get(c) + 1);
            }

            freq.put(c, right);
            res = Math.max(res,right-left+1);

            
        }

        return res;
        
    }
}