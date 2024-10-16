class A {
	public interface nestedIF {
		boolean isNotNegative(int x);
	}
}

class B implements A.nestedIF {
	public boolean isNotNegative(int x){
		return x < 0 ? false :true;
	}
}


class nestedinterfaces{
	public static void main(String[] args) {
		A.nestedIF nif  = new B();

		if(nif.isNotNegative(10)) System.out.println("10 is not negative");
		if(nif.isNotNegative(-10)) System.out.println("This wont be displayed");
	}
}