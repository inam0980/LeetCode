class Solution {
    public void moveZeroes(int[] nums) {


        int count=0;
        int i=0;
        for(int x:nums){
            if(x==0){
                count++;
            }
            else{

            nums[i++]=x;

            }
        }

        for(i=nums.length-count;i<nums.length;i++){
            nums[i]=0;
        }
        


        
    }
}