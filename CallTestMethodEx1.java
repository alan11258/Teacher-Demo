package tw.leonchen.myproject.oop.method;

class Person {
	public void sayHello() {
		System.out.println("Hola");
		sayGoodBye();
	}

	public void sayGoodBye() {
		System.out.println("Adios");
		// sayHello(); //Runtime Error
	}

}

public class CallTestMethodEx1 {

	public static void main(String[] args) {
		Person mike = new Person();
		// mike.sayHello();
		mike.sayGoodBye();
		System.out.println("finished");
	}

}
