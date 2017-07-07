package tw.leonchen.myproject.oop.collections.generics;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class TestLotterySystemEx1 {

	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<Integer>();

		while (numbers.size() < 6) {
			int richNum = (int) (Math.random() * 42) + 1;
			// System.out.println("richNum:" + richNum);

			numbers.add(richNum);
		}

		System.out.println(numbers);

		// TreeSet<Integer> set1 = new TreeSet<Integer>();
		TreeSet<Integer> set1 = new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}

		});
		
		set1.addAll(numbers);

		System.out.println(set1);
	}

}
