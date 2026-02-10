class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> st = new Stack<>();

        // NSL
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) st.pop();
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        // NSR
        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) st.pop();
            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        int max = 0;
        for(int i = 0; i < n; i++){
            max = Math.max(max, heights[i] * (right[i] - left[i] - 1));
        }
        return max;
        
    }
}