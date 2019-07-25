package th;

public class ThreadYield implements Runnable {

	Thread thread;

	public ThreadYield(String name) {
		thread = new Thread(this, name);
		thread.start();
	}

	public void run() {

		System.out.println(Thread.currentThread().getName()
				+ " is going to call yield() method...");
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Thread.yield();

		System.out.println(Thread.currentThread().getName() + " is completed.");
	}

	public static void main(String[] args) {
		new ThreadYield("Thread 1");
		new ThreadYield("Thread 2");
	}
}