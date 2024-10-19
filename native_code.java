public 	class native_code { 
	public native int square(int number);

	static {
		System.loadLibrary("Square");
	}

	public static void main(String[] args) {
		native_code d = new native_code();
		int number = 5;
		int result = d.square(number);
		System.out.println("The square of " + number +"  is " + result );
	}
}