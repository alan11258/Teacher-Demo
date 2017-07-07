package tw.leonchen.myproject.oop.nestedclass;

class A {
	
	class B {
		public void travel() {
			System.out.println("Travel to some places");
		}
	}

	public void processNested() {
		B b1 = new B();
		b1.travel();
	}
}

class C{
	private static String gameName = "Royal Clash";

	static class D{
		public void play(){
			System.out.println("Play Game:" + gameName);
		}
	}
}

public class CallTestNestedClassEx1 {

	public static void main(String[] args) {
		A a1 = new A();
		a1.processNested();
		
		A.B b2 = a1.new B();
		b2.travel();
		
		C.D d1 = new C.D();
		d1.play();
	}

}





