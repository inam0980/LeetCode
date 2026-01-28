class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % nums.length;

        ArrayList<Integer> lst = new ArrayList<>();

        for (int i = n - k; i < n; i++) {
            lst.add(nums[i]);
        }

        for (int i = 0; i < n - k; i++) {
            lst.add(nums[i]);
        }

        for (int i = 0; i < n; i++) {
            nums[i] = lst.get(i);
        }
    }
}
