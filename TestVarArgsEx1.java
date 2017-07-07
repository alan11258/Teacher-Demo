package tw.leonchen.myproject.oop.array;

public class TestVarArgsEx1 {

	public void sum(int... data) {
		int total = 0;
		for (int value : data) {
			total = total + value;
		}
		System.out.println("total:" + total);
	}

	public static void main(String[] args) {
		TestVarArgsEx1 varArgs = new TestVarArgsEx1();
		varArgs.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		int[] log = {6,5,4,3,2,1};
		varArgs.sum(log);
	}

}
