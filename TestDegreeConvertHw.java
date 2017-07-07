package tw.leonchen.myproject.hw;

public class TestDegreeConvertHw {

	public static void main(String[] args) {
		int degree = 65;
		int index = 2;
		
		if(index==1){
			System.out.println("c->f");
			double degreeF = (5/9D*degree)+32;
			System.out.println("degreeF:" + degreeF);
		}
		
		if(index==2){
			System.out.println("f->c");
			double degreeC = (degree-32)*9/5;
			System.out.println("degreeC:" + degreeC);
		}
	}

}
