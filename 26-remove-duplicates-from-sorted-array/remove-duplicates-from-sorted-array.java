class Solution {
    public int removeDuplicates(int[] nums) {

        TreeSet<Integer> tree= new TreeSet<>();

        for(int x: nums){
            tree.add(x);
        }
        int i=0;
        for(int x: tree){
            nums[i++]=x;
        }
        return tree.size();

        
    }
}