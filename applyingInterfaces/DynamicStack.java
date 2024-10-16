interface IntStack {
    void push(int item);
    int pop(); // Change return type to int
}

class DynStack implements IntStack {
    private int[] stack;
    private int tos;

    DynStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    public void push(int item) {
        // If stack is full, allocate a larger stack
        if (tos == stack.length - 1) {
            int[] temp = new int[stack.length * 2]; // Double size
            for (int i = 0; i <= tos; i++) {
                temp[i] = stack[i];
            }
            stack = temp;
        }
        stack[++tos] = item;
    }

    public int pop() {
        if (tos < 0) {
            throw new IllegalStateException("Stack underflow");
        }
        return stack[tos--];
    }
}

public class DynamicStack {
    public static void main(String[] args) {
        DynStack mystack1 = new DynStack(5);
        DynStack mystack2 = new DynStack(5);

        for (int i = 0; i < 12; i++) mystack1.push(i);
        for (int i = 0; i < 20; i++) mystack2.push(i);

        System.out.println("Stack of mystack1");
        for (int i = 0; i < 12; i++) System.out.println(mystack1.pop());

        System.out.println("Stack of mystack2");
        for (int i = 0; i < 20; i++) System.out.println(mystack2.pop());
    }
}
