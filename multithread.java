class NewThread implements Runnable {
	String name ;
	Thread t;

	NewThread(String ThreadName) {
		name = ThreadName;
		t = new Thread(this,name);
		System.out.println("New Thread : " + t);
		t.start();
	}

	public void run() {
		try {
			for (int i = 0; i<5 ; i++ ) {
				System.out.println(name + " : " + i);
				Thread.sleep(100);
			}
		}catch(InterruptedException e ) {
			System.out.println(name +  " : " + "InterruptedException");
		}
		
		System.out.println( name + " Exiting");
	}

}

class multithread {
	public static void main(String[] args) {
		new NewThread("one");
		new NewThread("Two");
		new NewThread("Three");

		try{
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main Thred Exiting");
	}
}

