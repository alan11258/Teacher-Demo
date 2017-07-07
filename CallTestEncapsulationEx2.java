package tw.leonchen.myproject.oop.encapsulation;

class RoomMate {
	private String name = "mary";
	private int age = 18;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class CallTestEncapsulationEx2 {

	public static void main(String[] args) {
		RoomMate mate = new RoomMate();
		mate.setName("judy");
		String herName = mate.getName();
		System.out.println("herName:" + herName);
	}

}
