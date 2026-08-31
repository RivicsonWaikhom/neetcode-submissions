class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
            if(map.containsKey(target-i)){
                return new int[]{map.get(target-1),i+1};
            }

        }
        return new int[0];
    }
}
