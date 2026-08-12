class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res= new int[2];
        int start=0,end=nums.length-1;
        while(start<end){
            int sum= nums[start]+nums[end];
            if(sum==target){
                res[0]= start+1;
                res[1]= end+1;
                return res;
            }else if(sum<target){
                start++;
            }
            else{
                end--;
            }

        }
        return null;
    }
}
