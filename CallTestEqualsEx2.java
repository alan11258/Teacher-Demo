package tw.leonchen.myproject.oop;

public class CallTestEqualsEx2 {

	public static void main(String[] args) {

		// hello:ns->0x3456

		// str1:0x1234
		// String str1 = new String("Hello");
		// str1: 0x3456
		String str1 = "hello";

		// str2:0x2345
		//String str2 = new String("hello");
		// str2: 0x3456
		String str2 = "hello";

		System.out.println("(str1==str2)=" + (str1 == str2));
		System.out.println("str1.equals(str2)=" + str1.equals(str2));

	}

}
