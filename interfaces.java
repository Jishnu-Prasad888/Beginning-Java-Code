public interface interfaces{
	int constant = 10;

	void method();

 	default void defaultMethod() {
 		System.out.println("default implementation");
 	} 

 	static void staticMethod() {
 		System.out.println("Static method in interface");
 	}
}

