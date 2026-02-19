class Solution {
    public int majorityElement(int[] nums) {


        // HashMap<Integer,Integer> map= new HashMap<>();

        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }

        // int max=Integer.MIN_VALUE;

        // int key=-1;

        // for(Map.Entry<Integer,Integer>  x: map.entrySet()){
        //     if(x.getValue()>max){
        //         max=x.getValue();
        //         key=x.getKey();
        //     }
        // }
        // return key;

        int n=nums.length;

        Arrays.sort(nums);
        return(nums[n/2]);
        
    }
}