package tw.leonchen.myproject.oop.method;

class Calculator {
	public void plus(int x, int y) {
		System.out.println("x+y=" + (x + y));
	}

	public void minus(int a, int b) {
		System.out.println("a-b=" + (a - b));
	}
}

public class CallTestMethodEx2 {

	public static void main(String[] args) {
		Calculator casio = new Calculator();
		casio.plus(2, 10);
		casio.minus(6, 3);
		System.out.println("mission complete !!");
	}

}
