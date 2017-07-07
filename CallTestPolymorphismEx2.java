package tw.leonchen.myproject.oop.polymorphism;

public class CallTestPolymorphismEx2 {

	public void processAction(Mammal m){  //Mammal m = garField; -> Mammal m = new Cat();
		m.sleep();                        //Mammal m = new Dog();
		
		if(m instanceof Cat){
			Cat c1 = (Cat)m;
			c1.jumpAway();
		}
		
		if(m instanceof Dog){
			Dog d1 = (Dog)m;
			d1.bite();
		}
	}
	
	public static void main(String[] args) {
		CallTestPolymorphismEx2 poly1 = new CallTestPolymorphismEx2();
		
		Cat garField = new Cat();		
		poly1.processAction(garField);
		
		poly1.processAction(new Dog());
	}

}
