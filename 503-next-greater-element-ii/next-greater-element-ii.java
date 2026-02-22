class Solution {
    public int[] nextGreaterElements(int[] nums) {

        Stack<Integer> st= new Stack<>();

        int n=nums.length;

        int arr[]= new int[nums.length];

        st.push(nums[nums.length-1]);

        for(int i=n*2-1;i>=0;i--){
            int x=i%n;

            while(!st.isEmpty() && nums[x]>=st.peek()){
                st.pop();
            }
            if(i<n){
                if(st.isEmpty()){
                    arr[i]=-1;
                }
                else{
                    arr[i]=st.peek();
                }
            }
            st.push(nums[x]);
        }
        return arr;


        
    }
}