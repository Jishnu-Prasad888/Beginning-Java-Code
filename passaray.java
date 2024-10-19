class passarray {
	static void variableTest(int v[] ) {
		System.out.println("Number of args "  + v.length );
		System.out.println("Contents :");

		for(int x : v) {
			System.out.println(x + " ");
			System.out.println();
		}
	}


	public static void main(String[] args) {
		int a1[] = {10};
		int a2[] = {1,2,3};
		int a3[] = {};

		variableTest(a1);
		variableTest(a2);
		variableTest(a3);
	}

}
