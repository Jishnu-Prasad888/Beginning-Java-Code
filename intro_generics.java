class Gen<t> {
	t ob;

	Gen(t o)  {
		ob = o;
	}

	t getob() {
		return ob;
	}

	void showtype() { 
		System.out.println("Type of t is : " + ob.getClass().getName());
	}
}


class intro_generics { 
public static void main(String[] args) {
	Gen<Integer> iob;

	iob = new Gen<Integer>(88);
	iob.showtype();

	int v = iob.getob();
	System.out.println("ob is :" + v);

	Gen<String> strOb = new Gen<String> ("Generics Test");
	strOb.showtype();

	String w = strOb.getob();
	System.out.println("ob is :" + w);	

}

}