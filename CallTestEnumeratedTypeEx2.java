package tw.leonchen.myproject.oop.enumerated;

enum Music{
	pop, rockNroll, romantic("Beat it"), classic, rnb;
	
	private String song = "Despacito";
	
	private Music(){
		System.out.println("song:" + song);
	}
	
	Music(String song){
		this.song = song;
	}
	
	public void showInfo(){
		System.out.println("Your Favorite Song is:" + song);
	}
}

public class CallTestEnumeratedTypeEx2 {

	public static void main(String[] args) {
		Music music = Music.romantic;
		System.out.println("music:" + music);
		
		music.showInfo();
	}

}
