class Solution {
    public int findPeakElement(int[] nums) {
        int m = nums[0];
        int k = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < m) {
                k = i - 1;   
                return k;
            }
            m = nums[i];
        }
        return nums.length - 1; 
    }
}
