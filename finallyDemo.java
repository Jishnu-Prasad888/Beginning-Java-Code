class finallyDemo {
	static void procA() {
		try {
			System.out.println("Inside ProcA");
			throw new RuntimeException("demo");
		}finally {
			System.out.println("procA finally");
		}
	}

	static void procB()  {
		try {	
			System.out.println("Inside Procb");
			throw new RuntimeException("demo");
	} finally {
			System.out.println("procB finally");
	}
}

	static void procC()  {
		try {	
			System.out.println("Inside ProcC");
			throw new RuntimeException("demo");
	} finally {
			System.out.println("procC finally");
	}
}

public static void main(String[] args) {
	try {
		procA();
	}catch(Exception e) {
		System.out.println("Exception caught");
	}

	procB();
	procC();

}

}