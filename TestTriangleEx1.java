package tw.leonchen.myproject.hw;

public class TestTriangleEx1 {

	public void showTriangle1(){
		for(int i=1;i<=10;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void showTriangle2(){
		for(int i=1;i<=10;i++){
			for(int j=1;j<=11-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		TestTriangleEx1 test1 = new TestTriangleEx1();
		test1.showTriangle1();
		test1.showTriangle2();
	}

}
