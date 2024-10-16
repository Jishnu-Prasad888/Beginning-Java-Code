
class A {
	int i,j;

	void showij() {
		System.out.println("i = " + i + " j =" + j);
	}

	class B extends A {

	 	int k;

	 	void showk() {
	 		System.out.println("k = " +  k);
	 	} 

	 	void sum(){
	 		System.out.println("i+j+k : " + (i+j+k)); 
	 	}
	}
}


class simpleinheritance {
	public static void main(String[] args) {
		A superobj = new A();
		A.B subobj = superobj.new B();

		superobj.i = 10;
		superobj.j = 20;

		 subobj.i = 5;
		 subobj.j = 6;
		 subobj.k = 7;

		 superobj.showij();
		 subobj.showk();
		 subobj.sum();

	}
}
