package tw.leonchen.myproject.flowcontrol.loop;

public class TestDiceBreakContinueEx1 {

	public static void main(String[] args) {
		int yourLuckyNumber = 5;

		while (true) {

			int richerNumber = (int) (Math.random() * 6) + 1;
			System.out.println("richerNumber:" + richerNumber);

			if (yourLuckyNumber == richerNumber) {
				System.out.println("You are a Richer.");
				break;
			} else {
				System.out.println("You can dream come true someday.");
			}

		}
	}
}
