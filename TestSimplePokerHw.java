package tw.leonchen.myproject.hw;

public class TestSimplePokerHw {

	int[] cardStatus = new int[52];
	int player = 6;
	int count = 0;

	public void deal() {
		int cardNumber = (int) (Math.random() * 52) + 1;

		while (true) {

			if (cardStatus[cardNumber - 1] == 1) {
				cardNumber = (int) (Math.random() * 52) + 1;
				continue;
			}

			cardStatus[cardNumber - 1] = 1;

			count++;
			System.out.println("player" + count + ": cardNumber:" + cardNumber);

			if (count == player) {
				break;
			}
		}

		System.out.println("---------------------------------------------------");
	}

	public void printResult() {
		for (int i = 0; i < cardStatus.length; i++) {
			System.out.println("cardStatus[" + i + "]=" + cardStatus[i]);
		}
	}

	public static void main(String[] args) {
		TestSimplePokerHw poker = new TestSimplePokerHw();
		poker.deal();
		poker.printResult();
	}

}
