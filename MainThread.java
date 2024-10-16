class MainThread {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();

		System.out.println("currentThread : " + t);
		t.setName("Hello from the main thread");
		System.out.println("After Name change ="+t);

		try{
			for(int i = 0;i<5;i++) {
				System.out.println("i = "+i);
				Thread.sleep(100);
			}
		}catch(InterruptedException e) {
				System.out.println("Caught Exception : "+e);
			}
		}
}