class Solution {
    public int removeDuplicates(int[] nums) {


        int st=0;
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[st]){
                
                nums[k]=nums[i];
                k++;
  
            }
             st++;
           
            
            
        }
        return k;

        
    }
}