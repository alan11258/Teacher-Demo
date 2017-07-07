package tw.leonchen.myproject.oop.override;

class Parent{
	public void jog(){
		System.out.println("jog slow");
	}
}

class Child extends Parent{	
	//Annotation標註
	@Override
	public void jog(){
		System.out.println("jog fast");
	}
}


public class CallTestOverrideEx1 {

	public static void main(String[] args) {
		Child mike = new Child();
		mike.jog();
	}

}
