class MyStack {
    Queue<Integer> Q= new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        Q.add(x);

        int a=Q.size();

        while(a>1){
            Q.add(Q.remove());
            a--;
        }
        
    }
    
    public int pop() {
        return Q.remove();
        
    }
    
    public int top() {
        return Q.peek();
        
    }
    
    public boolean empty() {
        return Q.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */