package tw.leonchen.myproject.oop.exception;

public class CallTestExceptionEx1 {

	public void processExcept1() {
		int[] data = { 1, 2, 3, 4, 5, 6 };

		try {
			for (int i = 0; i <= data.length; i++) {
				System.out.println("data[" + i + "]=" + data[i]);
			}
		} catch (ArithmeticException e) {
			System.out.println("hello");
		} catch (Exception e) {
			System.out.println("e:" + e);
			e.printStackTrace();
		}

	}

	public void processExcept2(int x, int y) {
		try {
			System.out.println("x/y=" + (x / y));
		} catch (ArithmeticException e) {
			System.out.println("e=" + e);
			System.exit(-1);
		} finally{
			System.out.println("always execute here.");
		}
	}

	public static void main(String[] args) {
		CallTestExceptionEx1 except = new CallTestExceptionEx1();
		// except.processExcept1();
		except.processExcept2(6, 0);
	}

}
