package tw.leonchen.myproject.flowcontrol;

public class TestIfElseWithDiceEx1 {

	public static void main(String[] args) {
		int diceNumber = (int)(Math.random()*6)+1;
		System.out.println("diceNumber:" + diceNumber);

		int yourLuckyNumber = 3;
		
		if(yourLuckyNumber==diceNumber){
			System.out.println("You Win !!");
		}else{
			System.out.println("Try Again.");
		}
		
		System.out.println("finished");
	}

}
