class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Pass 1:  products of left side of index
        int prod = 1;
        for (int i = 0; i < n; i++) {
            answer[i] = prod;
            prod *= nums[i];
        }

        // Pass 2: multiply right side of index
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i];
        }

        return answer;
    
    }
}