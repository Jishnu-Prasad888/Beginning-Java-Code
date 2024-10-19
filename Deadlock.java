class A {
	synchronized void foo(B b) {
		String name = Thread.currentThread().getName();

		System.out.println(name + " Entered A.foo ");

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("A InterruptedException");
		}

		System.out.println(name + " trying to call B.last()");
		b.last();
	}

	synchronized void last() {
		System.out.println("Inside A.last");
	}
}

class B {
	synchronized void bar(A a) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " Entered B.bar");

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("B InterruptedException");
		}

		System.out.println(name + " trying to call A.last()");
		a.last();
	}

	synchronized void last() {
		System.out.println("Inside B.last");
	}
}

class Deadlock implements Runnable {
	A a = new A();
	B b = new B();

	Deadlock() {
		Thread.currentThread().setName("Main Thread");
		Thread t = new Thread(this, "Racing Thread");
		t.start();

		// Ensure a consistent lock order
		synchronized (a) {
			a.foo(b);
		}

		System.out.println("Back in the Main Thread");
	}

	public void run() {
		synchronized (b) {
			b.bar(a);
		}

		System.out.println("Back in the other Thread");
	}

	public static void main(String[] args) {
		new Deadlock();
	}
}
