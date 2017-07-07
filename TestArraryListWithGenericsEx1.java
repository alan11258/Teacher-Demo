package tw.leonchen.myproject.oop.collections.generics;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestArraryListWithGenericsEx1 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("mary");
		list1.add("john");
		list1.add("michelle");
		list1.add("leon");
		list1.add("jennifer");
		
		System.out.println("list1:" + list1);
		
		//ListIterator<String> listIterator = list1.listIterator();
		ListIterator<String> listIterator = list1.listIterator(2);
		
//		while(listIterator.hasNext()){
//			String data = listIterator.next();
//			System.out.println(data);
//		}
		
		while(listIterator.hasPrevious()){
			String data = listIterator.previous();
			System.out.println(data);
		}
	}

}
