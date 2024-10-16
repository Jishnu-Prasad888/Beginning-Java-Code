class trycatch {
	public static void main(String[] args) {
		int d,a;

		try {
			d = 0;
			a = 42/d;
			System.out.println("Ths will not be printed");
		}

		catch(ArithmeticException e) {
			System.out.println("Division By 0");
		}

		System.out.println("After catch Statement");
	}
}