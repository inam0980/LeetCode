class Solution {
    public int thirdMax(int[] nums) {

        TreeSet<Integer> tree= new TreeSet<>();


        for(int x: nums){
            tree.add(x);

        }

        if(tree.size()<3){
            return tree.last();
        }
        return tree.lower(tree.lower(tree.last()));
        
    }
}