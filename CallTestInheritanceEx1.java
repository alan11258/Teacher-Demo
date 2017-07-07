package tw.leonchen.myproject.oop.inheritance;

class Employee{
	String name = "mary";
	String address = "Taipei";
	String phone = "0987654321";
	int salary = 22000;
	
	public void getDetails(){
		System.out.println("name:" + name);
		System.out.println("address:" + address);
		System.out.println("phone:" + phone);
	}
	
	public int getSalary(){
		return salary;
	}
}

class Engineer extends Employee{
	public void program(){
		System.out.println("I can write Java Cold(Code).");
	}
}

public class CallTestInheritanceEx1 {

	public static void main(String[] args) {
		Engineer softwareEngineer = new Engineer();
		
		softwareEngineer.name = "Bob";
		softwareEngineer.salary = 50000;
		softwareEngineer.getDetails();
		
		int salary = softwareEngineer.getSalary();
		System.out.println("salary:" + salary);
		
		softwareEngineer.program();
	}

}
