/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        int n= intervals.size();
        if(n==0) return true;
        Collections.sort(intervals, Comparator.comparingInt(i -> i.start));
        for (int i=0;i<n-1;i++){
            Interval i1=intervals.get(i);
            Interval i2= intervals.get(i+1);
            if(i1.end>i2.start) return false;
            
        }
        return true;
        

    }
}
