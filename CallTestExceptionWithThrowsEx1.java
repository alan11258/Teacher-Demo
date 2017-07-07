package tw.leonchen.myproject.oop.exception;

class Cat{
	public void play(){
		System.out.println("cat play ball.");
	}
}

class Kitty extends Cat{	
}

class Dog{
	public void bark(){
		System.out.println("dog bark.");
	}
}

public class CallTestExceptionWithThrowsEx1 {

	public void processAction() throws ClassCastException, Exception{
		Object c1 = new Kitty();
		Dog d1 = (Dog)c1;
		d1.bark();
	}
	
	public static void main(String[] args) { //throws Exception{
		CallTestExceptionWithThrowsEx1 except2 = new CallTestExceptionWithThrowsEx1();
		try{
			except2.processAction();
		}catch(Exception e){
			System.out.println("finished");
		}
	}

}
