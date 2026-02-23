class MyQueue {

    Queue<Integer> st= new LinkedList<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {

        st.add(x);
          
    }
    
    public int pop() {

        return st.remove();
        
    }
    
    public int peek() {

        return st.peek();
        
    }
    
    public boolean empty() {

        return st.isEmpty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */