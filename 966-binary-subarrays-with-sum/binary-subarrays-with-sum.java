class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        Map<Integer, Integer> count = new HashMap<>();
        count.put(0, 1);

        int prefix = 0;
        int ans = 0;

        for (int num : nums) {
            prefix += num;
            ans += count.getOrDefault(prefix - goal, 0);

            count.put(prefix, count.getOrDefault(prefix, 0) + 1);
        }

        return ans;
    }
}
