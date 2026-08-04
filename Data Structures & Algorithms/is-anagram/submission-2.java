class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> counter = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            // char ch = s.charAt(i);
            counter.put(s.charAt(i), counter.getOrDefault(s.charAt(i), 0) + 1);
            counter.put(t.charAt(i), counter.getOrDefault(t.charAt(i), 0) - 1);
        }

        for(int count:counter.values()){
            if(count!=0){
                return false;
            }

        }

        // for (int i = 0; i < t.length(); i++) {
        //     char ch = t.charAt(i);
        //     if (!counter.containsKey(ch)|| counter.get(ch)==0) {
        //         return false;
        //     }
        //     counter.put(ch, counter.get(ch) - 1);
        // }

        return true;        
    }
}