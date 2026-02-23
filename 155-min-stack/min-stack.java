class MinStack {

    Stack<Integer> st= new Stack<>();

    ArrayList<Integer> lst= new ArrayList<>();



    int min=0;

    public MinStack() {
        
    }
    
    public void push(int val) {
        st.push(val);
        lst.add(val);


        


        
    }
    
    public void pop() {
        
        lst.remove(st.pop());
        
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {

        return Collections.min(lst);

        

        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */