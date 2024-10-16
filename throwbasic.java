class throwbasic {
	static void demoproc() {
		try {
			throw new NullPointerException("Hello from NullPointerException");
		} catch(NullPointerException e) {
			System.out.println("Caugth inside demoproc");
			throw e;
		}
	}

	public static void main(String[] args) {
		try {
			demoproc();
		}catch(NullPointerException e) {
			System.out.println("Caught again in Main :" + e);
		}
	}
}