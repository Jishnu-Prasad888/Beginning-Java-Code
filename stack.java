class stack {
	public static void main(String args[]) {
		createStack obj1 = new createStack();
		createStack obj2 = new createStack();

		// pushing numbers into the stack 
		for(int i = 0;i<10;i++) obj1.push(i);
		for(int i = 0;i<10;i++) obj2.push(i);

		//poping numbers
		for(int i =0;i<10;i++) System.out.println(obj1.pop());
		System.out.println();
		for(int i =0;i<10;i++) System.out.println(obj2.pop());

	}
}

class createStack {
	int[] s = new int[10];
	int topofStack;

	// Intialising the top of the stack 
	// -1 indicates that the stack is empty
	createStack(){
		topofStack = -1;
	}

	void push(int item) {
		if(topofStack == 9) System.out.println("Stack is Full");
		else s[++topofStack] = item;

	}

	int pop() {
		if (topofStack < 0) {
			System.out.println("Stack underflow");
			return -1;
		}
		else { 
			return s[topofStack--]; 
		}
	}


}