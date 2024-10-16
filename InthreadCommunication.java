class Q {
	int n ;

	synchronized int get() {
		System.out.println("Got : " + n);
		return n;
	}

	synchronized void put(int n) {
		this.n = n;
		System.out.println("put : "+ n);
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

class InthreadCommunication  {
	public static void main(String[] args) {
		Q q = new Q();
		new producer(q);
		new consumer(q);

		System.out.println("press ctrl +c to stop");
	}
}