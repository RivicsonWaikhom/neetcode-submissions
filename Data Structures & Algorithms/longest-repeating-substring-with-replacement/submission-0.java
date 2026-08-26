class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int low = 0, maxFreq = 0, res = 0;

        for (int high = 0; high < s.length(); high++) {
            int idx = s.charAt(high) - 'A';
            freq[idx]++;

            maxFreq = Math.max(maxFreq, freq[idx]);

            while ((high - low + 1) - maxFreq > k) {
                freq[s.charAt(low) - 'A']--;
                low++;
            }

            res = Math.max(res, high - low + 1);
        }

        return res;
    }
}