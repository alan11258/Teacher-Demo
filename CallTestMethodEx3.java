package tw.leonchen.myproject.oop.method;

public class CallTestMethodEx3 {

	public int add(){
		int sum=0;
		for(int i=1;i<=10;i++){
			sum=sum+i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		CallTestMethodEx3 test3 = new CallTestMethodEx3();
		int value = test3.add();
		System.out.println("value:" + value);
	}

}
