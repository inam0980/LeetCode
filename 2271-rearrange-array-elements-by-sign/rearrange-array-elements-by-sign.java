class Solution {
    public int[] rearrangeArray(int[] nums) {

        ArrayList<Integer> lst= new ArrayList<>();
        ArrayList<Integer> lst2= new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                lst.add(nums[i]);
            }
            else{
                lst2.add(nums[i]);
            }
        }
        int k=0;
        
        while(!lst.isEmpty() && !lst2.isEmpty()){
            nums[k++]=lst.remove(0);
            nums[k++]=lst2.remove(0);
            
        }
        return nums;
        
    }
}