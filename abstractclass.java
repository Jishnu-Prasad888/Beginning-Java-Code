abstract class A {
	abstract void callme();

	void callmetoo() {System.out.println("Concerete method");}	
}

class B extends A {
	void callme() {
		System.out.println(" Class B callme method");
	}
}


class abstractclass {
	public static void main(String[] args) {
		B b = new B();
		b.callme();
		b.callmetoo();
	}
}