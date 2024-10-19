class varargsverloading {
	static void vaTest(int ... v) {
		System.out.print("vaTest(int ...): " +"Number of args: " + v.length +
		" Contents: ");
		for(int x : v)
		System.out.print(x + " ");
		System.out.println();
	}
}