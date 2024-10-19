class ChainExceptions {
	static void demo() {
		NullPointerException e = new NullPointerException("Top Layer");

		e.initCause(new ArithmeticException("Cause"));

		throw e;
	}

	public static void main(String[] args) {
		try {
			demo();
		}catch(NullPointerException e){
			System.out.println("Caught : " + e);
			System.out.println("Original Cause :"+e.getCause());
		}
	}
}