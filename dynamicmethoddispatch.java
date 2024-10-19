class A{
	void callme(){
		System.out.println("Inside class A callme method ");
	}
}

class B extends A {
	void callme(){
		System.out.println("Inside Class B callme method");
	}
}

class C extends A {
	void callme() {
		System.out.println("Inside class C callme method");
	}
}

class dynamicmethoddispatch{
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();

		A r;

		r = a;
		r.callme();
		
		r= b;
		r.callme();
		
		r = c;	
		r.callme();
	}
}