class A {
	int i;

	private int j;

	void setij(int x ,int y) {
		this.i = x;
		this.j = y;
	}

	class B extends A {

		int total;

		void sum() {
			total = i  + j;
		}

	}
}

class inheriatanceacess {
	public static void main(String[] args) {
		
		A superobj = new A();
		A.B subOb = superobj.new B();

		subOb.setij(10,12);

		subOb.sum();
		System.out.println(subOb.total);
		System.out.println(subOb.j);
		System.out.println(subOb.i);

	}
}