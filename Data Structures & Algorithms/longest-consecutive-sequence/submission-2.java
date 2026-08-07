public class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Boolean> travel= new HashMap<>();
        for (int i : nums) {
            travel.put(i,Boolean.FALSE);
        }
        int longest = 0;
        for( int i: nums){
            int currLength=1;
            // ->check
            int next=i+1;
            while(travel.containsKey(next)&& (travel.get(next)==false)){
                currLength++;
                travel.put(next,Boolean.TRUE);
                next++;
            }

            // check <--
            int prev=i-1;
            while(travel.containsKey(prev)&& (travel.get(prev)==false)){
                currLength++;
                travel.put(prev,Boolean.TRUE);
                prev--;
            }
            longest= Math.max(currLength,longest);

        }

         
        return longest;
    }
}