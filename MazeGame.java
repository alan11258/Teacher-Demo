package tw.leonchen.myproject.oop.thread;

class MazeGameCore {
	
	private int x = 0, y = 0;

	public void move(int x, int y) {
		synchronized (this) {
			this.x = x;
			this.y = y;
			System.out.println("x:" + x + " y:" + y);
			this.notify();
		}
	}

	public void checkExit() {
		synchronized (this) {
			try {
				this.wait();

				if (x == 0 && y == 0) {
					System.out.println("Game Exit. See Ya.");
					System.exit(-1);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

class Hero implements Runnable {

	private MazeGameCore core;

	public Hero(MazeGameCore core) {
		this.core = core;
	}

	@Override
	public void run() {

		while (true) {

			int x = (int) (Math.random() * 5);
			int y = (int) (Math.random() * 5);
			core.move(x, y);

			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}

class MazeGameCheck implements Runnable {

	private MazeGameCore core;

	public MazeGameCheck(MazeGameCore core) {
		this.core = core;
	}

	@Override
	public void run() {
		while (true) {
			
			core.checkExit();

			try {
				Thread.sleep((int) (Math.random() * 500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class MazeGame {

	public static void main(String[] args) {
		MazeGameCore core = new MazeGameCore();

		Hero poseidon = new Hero(core);
		Thread thread1 = new Thread(poseidon);
		thread1.start();
		
		MazeGameCheck check = new MazeGameCheck(core);
		Thread thread2 = new Thread(check);
		thread2.start();
	}

}
