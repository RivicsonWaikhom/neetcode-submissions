class Solution {
    public int maxArea(int[] heights) {
        int start=0,end=heights.length-1;
        int ar=0;
        while(start< end){
            // int l=Math.min(heights[start],heights[end]);
            // int b= end-start;
            ar=Math.max(ar,(Math.min(heights[start],heights[end]))*(end-start));
            if(heights[start]<heights[end]){
                start++;
            }else end--;
        }
        return ar;
    }
}
