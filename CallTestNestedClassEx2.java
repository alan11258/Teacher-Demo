package tw.leonchen.myproject.oop.nestedclass;

class E{
	private String name = "john";
	
	public void execNested(){
		int age = 18;
		
		class F{
			public void buy(int money){
				System.out.println("i bought a doll cost " + money + "\n name:" + name + " age:" + age);
			}
		}
		
		F f1 = new F();
		f1.buy(500);
	}
}

public class CallTestNestedClassEx2 {

	public static void main(String[] args) {
        E e1 = new E();
        e1.execNested();
	}

}
