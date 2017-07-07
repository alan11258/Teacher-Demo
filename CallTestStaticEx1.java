package tw.leonchen.myproject.oop;

class Animal{
	static String food = "Sea Weed";
	
	public static void eat(){
		System.out.println("Animal can eat something:" + food);
	}
}

public class CallTestStaticEx1 {

	public static void main(String[] args) {
		Animal.eat();
		System.out.println(Animal.food);
	}

}
