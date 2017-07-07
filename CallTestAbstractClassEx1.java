package tw.leonchen.myproject.oop.myabstract;

abstract class Company {

	public abstract void calFuel();

	public abstract void calDistance();

	public static void processVehicle(Company corp) {
		corp.calFuel();
		corp.calDistance();
	}
}

class Truck extends Company {

	@Override
	public void calFuel() {
		System.out.println("Truck calculates Fuel.");
	}

	@Override
	public void calDistance() {
		System.out.println("Truck calculates Distance.");
	}
}

class Ship extends Company {

	@Override
	public void calFuel() {
		System.out.println("Ship claculates Fuel.");
	}

	@Override
	public void calDistance() {
		System.out.println("Ship calculates Distance.");
	}

}

public class CallTestAbstractClassEx1 {

	public static void main(String[] args) {
		// Truck toyota = new Truck();
		// toyota.calFuel();
		// toyota.calDistance();
		//
		// Ship cargoShip = new Ship();
		// cargoShip.calFuel();
		// cargoShip.calDistance();

		// Company corp;
		//
		// corp = new Truck();
		// corp.calFuel();
		// corp.calDistance();
		//
		// corp = new Ship();
		// corp.calFuel();
		// corp.calDistance();

		Company.processVehicle(new Truck());
		Company.processVehicle(new Ship());
	}

}
