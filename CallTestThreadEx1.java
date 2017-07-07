package tw.leonchen.myproject.oop.thread;

class MySimpleTask implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " i=" + i);
			//System.out.print(Thread.currentThread().getName());
			//System.out.println(" i=" + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class CallTestThreadEx1 {

	public static void main(String[] args) {
		MySimpleTask task = new MySimpleTask();
		
		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("finished");
	}

}
