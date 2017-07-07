package tw.leonchen.myproject.oop;

public class CallTestConstructorEx1 {

	//constructor
	public CallTestConstructorEx1(String name){
		System.out.println("my constructor." + name);
	}
	
	//method
	public void play(){
		System.out.println("Play Chess.");
	}
	
	public static void main(String[] args) {
		CallTestConstructorEx1 test1 = new CallTestConstructorEx1("mary");
		test1.play();
		//test1.play();
		
		//anonymous object
		new CallTestConstructorEx1("john").play();
		//new CallTestConstructorEx1("judy").play();
		
		System.out.println("ok.");
		
//		int i=1;
//		i=i+1;
//		System.out.println("i=" + i);
//		System.out.println("1+1=" + (1+1));
	}

}
