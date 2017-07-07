package tw.leonchen.myproject.operation;

public class TestBitwiseLogicalOperatorEx1 {

	public static void main(String[] args) {
		int x=2, y=3;
		
		System.out.println("~" + x + "=" + (~x));
		System.out.println(x + "&" + y + "=" + (x&y));
		System.out.println(x + "|" + y + "=" + (x|y));
		System.out.println(x + "^" + y + "=" + (x^y));
	}

}
