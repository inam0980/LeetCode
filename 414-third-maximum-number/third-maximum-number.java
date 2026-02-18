class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> tree = new TreeSet<>();

        for (int x : nums) {
            tree.add(x);   // duplicates remove
        }

        if (tree.size() < 3) {
            return tree.last();   // max return
        }

        return tree.lower(tree.lower(tree.last()));
    }
}
