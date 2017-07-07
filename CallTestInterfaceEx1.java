package tw.leonchen.myproject.oop.myinterface;

interface Flyer{
	public void takeOff();
	public void fly();
	public void land();
}

abstract class Creature{
	public abstract void eat();
}

class AirPlane implements Flyer{

	@Override
	public void takeOff() {
		System.out.println("AirPlane takes off.");
	}

	@Override
	public void fly() {
		System.out.println("AirPlane flies.");
	}

	@Override
	public void land() {
		System.out.println("AirPlane lands");
	}
	
}

class Bird extends Creature implements Flyer{

	@Override
	public void takeOff() {
		System.out.println("Bird takes off.");
	}

	@Override
	public void fly() {
		System.out.println("Bird flies.");
	}

	@Override
	public void land() {
		System.out.println("Bird lands");
	}

	@Override
	public void eat() {
		System.out.println("Bird eats Worms");
	}
	
}

public class CallTestInterfaceEx1 {

	public static void main(String[] args) {
		Flyer flyer;
		flyer = new Bird();
		
		flyer.takeOff();
		flyer.fly();
		flyer.land();
		
		if(flyer instanceof Bird){
			Bird b1 = (Bird)flyer;
			b1.eat();
		}
	}

}
