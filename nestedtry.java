class nestedtry {
	public static void main(String[] args) {
		try {
			int a = args.length;
			/* If no command-line args are present, the following statement will generate a divide-by-zero exception. */

			int b = 42 / a;

			System.out.println("a = " + a );

			try { // nestd try block 
				/* If one command line arg  is used then a divide by zero exception will be raised by the following code */
				if(a==1) a = a/(a-a);

				/* If two command line arg  is used then a divide by zero exception will be raised by the following code */
				if(a==2) {
					int c[] = {1};
					c[42]  = 99; // generates out of bound exception	
				}

			}catch(ArrayIndexOutOfBoundsException e) { 
				System.out.println("ArrayIndexOutOfBoundsException");
				 }
		
		}catch (ArithmeticException e) {
			System.out.println("Divide by 0 : " + e);	
		}
	}
}