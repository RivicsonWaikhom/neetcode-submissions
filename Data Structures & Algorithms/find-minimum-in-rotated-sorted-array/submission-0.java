class Solution {
    public int findMin(int[] nums) {
        int start=0,end= nums.length-1;
        int min1= 10000;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]<min1 && nums[start]<nums[end]){
                end=mid;
            }
            else {
                start=mid+1;
            }
            min1=Math.min(min1,nums[mid]);

        }
        return min1;
        
    }
}
