class ThreadPriority {
	public static void main(String[] args) {
		
		Thread highprioritythread = new Thread(() -> {
			for (int i = 0; i < 5 ;i++ ) {
				System.out.println("High priority thread"  + i);
			} 
		});

	   	Thread lowprioritythread = new Thread(() -> {
	   		for (int i = 5; i > 0 ; i-- ) {
	   			System.out.println("low priority thread" + i);
	   		}
	   	});


	   	highprioritythread.setPriority(Thread.MAX_PRIORITY);
	   	lowprioritythread.setPriority(Thread.MIN_PRIORITY);

	   	highprioritythread.start();
	   	lowprioritythread.start();
	}
}