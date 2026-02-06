class MyStack {

    int top = -1;
    int[] arr;

    public MyStack() {
        arr = new int[1000]; // fixed size
    }

    public void push(int x) {
        arr[++top] = x;
    }

    public int pop() {
        return arr[top--];
    }

    public int top() {
        return arr[top];
    }

    public boolean empty() {
        return top == -1;
    }
}
