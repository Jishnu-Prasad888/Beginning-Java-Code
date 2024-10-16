class Stack implements IntStack {
	private int stack[];
	private int tos; // top of stack

 	Stack(int size) {
 		stack = new int[size];
 		tos = -1;
 	}

 	public void push(int item) {
 		if(tos == stack.length - 1 ) 
 			System.out.println("Stack is full");
 		else 
 			stack[++tos] = item;
 	}

 	public int pop() {
 		if(tos < 0) {
 			System.out.println("Stack underflow");
 			return 0;
 		}

 		else return stack[tos--];
 	}
}


class FixedStack {
	public static void main(String[] args) {
		Stack mystack1 = new Stack(5);
		Stack mystack2 = new Stack(6);

		for(int i = 0 ; i< 5 ; i++) mystack1.push(i);
		for (int i = 10; i>5 ;  --i ) mystack2.push(i);


		System.out.println("Stack of mystack1");
		for (int i = 0 ; i<5 ;i++ ) System.out.println(mystack1.pop());
		System.out.println("Stack of mystack2");
		for (int i = 0 ; i<5 ;i++ ) System.out.println(mystack2.pop());

	}
}