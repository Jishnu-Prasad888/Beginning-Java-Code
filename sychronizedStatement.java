class Callme {
	void call(String msg) {
		System.out.print(" [ " + msg);
		try{
			Thread.sleep(100);
		}catch( InterruptedException e) {
			System.out.println("Exception  : " +e);
		}
		System.out.println(" ]");
	}
}


class caller implements Runnable {
	String msg ;
	Callme target;
	Thread t;

	public caller(Callme targ,String s) {
		target  = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}

	@Override 
	public void run() {
		synchronized(target) {
			target.call(msg);
		}
	}
}

class sychronizedStatement {
	public static void main(String[] args) {
		Callme target = new Callme();
		caller obj1 = new caller(target , "Hello");
		caller obj2 = new caller(target , "World");
		caller obj3 = new caller(target , "from java");

		try {
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
		}catch(InterruptedException e) {
			System.out.println("InterruptedException");
		}
	}
}