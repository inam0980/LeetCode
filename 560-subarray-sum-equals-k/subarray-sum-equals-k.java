class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int c=0;

        for(int i=0;i<nums.length;i++){

            int s=0;
            for(int j=i;j<nums.length;j++){
                s+=nums[j];
                if(s==k){
                    c++;
                }
            }
        }
        return c;
        
    }
}

// class Solution {
//     public int subarraySum(int[] nums, int k) {

//         HashMap<Integer,Integer> map= new HashMap<>();

//         int s=0;
//         int c=0;
//         map.put(0,1);

//         for(int i=0;i<nums.length;i++){
//             s+=nums[i];

//             if(map.containsKey(s-k)){
//                 c+=map.get(s-k);

//             }
//             map.put(s,map.getOrDefault(s,0)+1);
//         }

//         return c;
        
//     }
// }