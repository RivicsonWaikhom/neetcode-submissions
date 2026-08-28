class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int end = 0;
        int maxJump = 0;
        int ans = 0;

        for (int i = 0; i < n - 1; i++) {
            maxJump = Math.max(maxJump,nums[i]+i);
            if(maxJump>=n-1){
                ans++;
                return ans;
            }

            if (i == end) {
                ans++;
                end = maxJump;
            }
        }

        return ans;
    }
}
