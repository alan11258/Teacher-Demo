package tw.leonchen.myproject.operation;

public class TestShiftOperatorEx1 {

	public static void main(String[] args) {
		int data1 = 1234;
		int data2 = -1234;
		
        System.out.println(data1 + ">>2=" + (data1>>2));
        System.out.println(data2 + ">>2=" + (data2>>2));
        
        System.out.println(data1 + ">>>2=" + (data1>>>2));
        System.out.println(data2 + ">>>2=" + (data2>>>2));
        
        System.out.println(data1 + "<<2=" + (data1<<2));
        System.out.println(data2 + "<<2=" + (data2<<2));
	}

}
