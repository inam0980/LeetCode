import java.util.*;

class MinStack {
    Stack<Integer> st = new Stack<>();
    
    

    public MinStack() {}

    public void push(int val) {
        st.push(val);
      

        
    }

    public void pop() {
        int x=st.pop();

      

    }

    public int top() {
        return st.peek();
    }

    public int getMin() {

        int min=st.peek();
        for(int x: st){
            if(x<min){
                min=x;
            }
        }
        return min;

        
        
    }
}
