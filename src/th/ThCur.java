package th;

public class ThCur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThTest tc = new ThTest();
//		tc.start();
		System.out.println("===================");
		ThTest2 tc2 = new ThTest2();
		
		tc2.start();
		tc2.interrupt();
	}

}

class ThTest extends Thread {
	public void run() {
		System.out.println("This is run() method");
		System.out.println("thread created = " + Thread.currentThread());
		System.out.println("thread name = " + Thread.currentThread().getName());
		System.out.println("thread priority = " + Thread.currentThread().getPriority());
		System.out.println("thread id = " + Thread.currentThread().getId());
		System.out.println("thread group = " + Thread.currentThread().getThreadGroup());
		System.out.println("thread state = " + Thread.currentThread().getState());
	}
}

class ThTest2 extends Thread {
	public void run() {
		
		System.out.println("This is run2() method");
		System.out.println("thread created = " + Thread.currentThread());
		System.out.println("thread name = " + Thread.currentThread().getName());
		System.out.println("thread priority = " + Thread.currentThread().getPriority());
		System.out.println("thread id = " + Thread.currentThread().getId());
		System.out.println("thread group = " + Thread.currentThread().getThreadGroup());
		System.out.println("thread state = " + Thread.currentThread().getState());
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}