package tw.leonchen.myproject.oop.encapsulation;

class TestEncapsulationEx1{
	private int a=1;
	public int b=2;
}

public class CallTestEncapsulationEx1 {

	public static void main(String[] args) {
		TestEncapsulationEx1 encap = new TestEncapsulationEx1();
		//System.out.println("encap.a=" + encap.a); //compile error
		System.out.println("encap.b=" + encap.b);
	}

}
