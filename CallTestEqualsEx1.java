package tw.leonchen.myproject.oop;

class Car{
	String brand = "Java";
	
	public void drive(){
		System.out.println("Drive a " + brand + " car");
	}
}

public class CallTestEqualsEx1 {

	public static void main(String[] args) {
		//car1:0x1234 -> 0x2345
		Car car1 = new Car(); 
		
		//car2:0x2345
		Car car2 = new Car();
		
		System.out.println("(car1==car2)=" + (car1==car2));
		System.out.println("car1.equals(car2)=" + (car1.equals(car2)));
		
		car1=car2;
		
		System.out.println("(car1==car2)_1=" + (car1==car2));
		System.out.println("car1.equals(car2)_1=" + (car1.equals(car2)));
	}

}
