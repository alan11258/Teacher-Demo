package tw.leonchen.myproject.oop.inheritance;

class Fish extends Object{
	String name = "Nemo";
	
	public Fish(){
		super();
		System.out.println("default action");
	}
	
	public Fish(String name){
		this.name = name;
	}
	
	public void swim(){
		System.out.println("I can swim " + name);
	}
}

class Shark extends Fish{
	public Shark(){
		super("Dolly");
	}
	
	public void action(){
		super.swim();
	}
}

public class CallTestInheritanceWithSuperEx1 {

	public static void main(String[] args) {
		Shark tigerShark = new Shark();
		tigerShark.action();
		System.out.println("finished");
	}

}
