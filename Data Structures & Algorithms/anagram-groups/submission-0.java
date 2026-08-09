class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map= new HashMap<>();
        for( String s: strs){
            char[] a= s.toCharArray();
            Arrays.sort(a);
            String str1= new String(a);
            if(!map.containsKey(str1)){
                map.put(str1,new ArrayList<String>());
            }
            map.get(str1).add(s);
        }
        return new ArrayList<>(map.values());
        
    }
}