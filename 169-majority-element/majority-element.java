class Solution {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);
        int k=0;
        int g=0;
        int c=1;
        int temp=c;
        
        if((nums.length)==1){
            return nums[0];
        }
        else{
        for(int i=1;i<nums.length;i++){

            if(nums[i]==nums[k]){
                c++;
            }
            else{
                c=1;
            }
            k++;

            if(c>temp){
                temp=c;
                g=nums[i];
            }
        }
        return g;
    
        }

    }
}