class Solution {
    public boolean hasDuplicate(int[] nums) {
        for (int i=0; i<=nums.length/2;i++){
            int j=i+1;
            if(nums[i]==nums[j]) return true;


        }
        return false;
    }
}