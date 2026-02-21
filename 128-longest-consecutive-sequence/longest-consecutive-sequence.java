class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set= new HashSet<>();

        for(int x:nums){
            set.add(x);
        }
        int max=0;
        for(int x: set){

            int crr=x;

            if(!set.contains(crr-1)){
                int c=0;
                while(set.contains(crr)){
                    crr++;
                    c++;
                }
                max= Math.max(max,c);
            }
        }
        return max;
        
    }
}