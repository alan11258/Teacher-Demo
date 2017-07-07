package tw.leonchen.myproject.oop.collections;

import java.util.LinkedList;

public class CallTestLinkedListEx1 {

	private LinkedList list1;

	public void processStroeQueue() {
		list1 = new LinkedList();
		list1.offer("signal");
		list1.offer("traffic");
	}

	public void processRetreiveQueue() {
		while (list1.peek() != null) {
			String data = (String) list1.poll();
			System.out.println("data:" + data);
		}
	}

	public static void main(String[] args) {
		CallTestLinkedListEx1 test1 = new CallTestLinkedListEx1();
		test1.processStroeQueue();
		test1.processRetreiveQueue();
	}

}
