class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int start = 0, res = 0;
        Map<Character, Integer> freq = new HashMap<>();

        for (int end = 0; end < n; end++) {
            char c = s.charAt(end);
            
            // shrink window if more than k unique
            if (freq.containsKey(c)) {
                start = Math.max(start, freq.get(c) + 1);
            }

            freq.put(c, end);
            res = Math.max(res,end-start+1);

            
        }

        return res;
        
    }
}