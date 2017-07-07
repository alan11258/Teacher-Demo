package tw.leonchen.myproject.oop.polymorphism;

class Mammal {
	public void sleep() {
		System.out.println("i can sleep");
	}
}

class Cat extends Mammal {

	@Override
	public void sleep() {
		System.out.println("cat sleep");
	}

	public void jumpAway() {
		System.out.println("cat jumps away");
	}
}

class Dog extends Mammal{

	@Override
	public void sleep() {
		System.out.println("dog sleep");
	}
	
	public void bite(){
		System.out.println("dog bites bone.");
	}
	
}

public class CallTestPolymorphismEx1 {

	public static void main(String[] args) {
		// Cat kitty = new Cat();
		// kitty.sleep();
		//
		// Mammal m = new Mammal();
		// m = kitty;
		// m.sleep();

		Mammal m;
		
		m = new Cat();
		m.sleep();
		
		m = new Dog();
		m.sleep();
	}

}
