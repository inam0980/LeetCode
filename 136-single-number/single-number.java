
class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }
}






// class Solution {
//     public int singleNumber(int[] nums) {

        
//             for(int i=0;i<nums.length;i++){
//                 int k=0;
//                 for(int j=0;j<nums.length;j++){
//                     if(nums[i]==nums[j]){
                        
//                         k+=1;
//                     }
//                 }
//                 if(k==1){
//                     return nums[i];
//                 }
//             }
        
//         return nums[0];

        
//     }
// }