class Q {
	int n ;
	boolean valueSet = false;

	synchronized int get() {
		while(!valueSet)
		  try{
		  	wait();
		  }catch(InterruptedException e) {
		  	System.out.println("Exception");
		  }

		System.out.println("Got : " + n);
		valueSet = false;
		notify();
		return n;
	}

	synchronized void put(int n) {
		while(!valueSet)
		  try{
		  	wait();
		  }catch(InterruptedException e) {
		  	System.out.println("Exception");
		  }
		this.n = n;
		valueSet = true;
		System.out.println("put : "+ n);
		notify();
	}
}

class producer implements Runnable {
	Q q;

	producer(Q q) {
		this.q = q;
		new Thread(this,"producer").start();
	} 

	public void run() {
		int i = 0;

		while(true) {
			q.put(i++);
		}
	}
}

class consumer implements Runnable {
	Q q;

	consumer(Q q) {
		this.q = q;
		new Thread(this,"consumer").start();
	}

	public void run() {
		while(true) {
			q.get();
		}
	}
}

class ThreadProperties  {
	public static void main(String[] args) {
		Q q = new Q();
		new producer(q);
		new consumer(q);

		System.out.println("press ctrl +c to stop");
	}
}
