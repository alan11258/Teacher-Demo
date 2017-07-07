package tw.leonchen.myproject.oop.array;

import java.util.Arrays;

public class TestNumberSortEx1 {
	int[] data = { 5, 12, 7, 26, 3 };

	public void sortNumber1() {
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i + 1; j < data.length; j++) {

				int temp = 0;
				if (data[i] < data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}

			}
		}
	}

	public void sortNumber2() {
		while (true) {
			
			int count=0;
			
			for (int m = 0; m < data.length - 1; m++) {
				int temp = 0;

				if (data[m] < data[m + 1]) {
					temp = data[m];
					data[m] = data[m + 1];
					data[m + 1] = temp;
					count++;
				}
			}
			
			if(count==0){
				break;
			}
		}
	}
	
	public void sortNumber3(){
		Arrays.sort(data);
	}

	public void printResult() {
		for (int k = 0; k < data.length; k++) {
			System.out.printf("data[%d]=%d\n", k, data[k]);
		}
	}

	public static void main(String[] args) {
		TestNumberSortEx1 numberSort1 = new TestNumberSortEx1();
		numberSort1.sortNumber3();
		numberSort1.printResult();
	}

}
