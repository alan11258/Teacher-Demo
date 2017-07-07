package tw.leonchen.myproject.hw;

public class TestTriangleEx2 {

	public void showTriangle3(){
		for(int i=1;i<=10;i++){
			
			for(int m=1;m<=11-i;m++){
				System.out.print(" ");
			}
			
			for(int n=1;n<=i;n++){
				System.out.print("*");
			}
			
			if(i==1){
				System.out.println();
				continue;
			}
			
			for(int n=1;n<=i-1;n++){
				System.out.print("*");
			}
			
			for(int m=1;m<=11-i;m++){
				System.out.print(" ");
			}
						
			System.out.println();	
			
		}
	}
	
	
	public static void main(String[] args) {
		TestTriangleEx2 test1 = new TestTriangleEx2();
		test1.showTriangle3();
	}

}
