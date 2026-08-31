class Solution {
    public int findMin(int[] nums) {
        int start=0,end= nums.length-1;
        int min1= 10000;
        while(start<=end){
            int mid=(start+end)/2;
            // right side check
            if(nums[start]<nums[mid]){
                if(min1>=nums[start] && nums[mid]>=min1)
                end=mid;
                else start=mid+1;
            }
            else {
                if(min1<=nums[mid] && min1>= nums[end]){
                    start=mid+1;
                }
                else end=mid;
            }
            min1=Math.min(min1,nums[mid]);

        }
        return min1;
        
    }
}
