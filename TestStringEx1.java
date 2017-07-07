package tw.leonchen.myproject.oop;

public class TestStringEx1 {

	public static void main(String[] args) {
		String data = "abcdefghij";
		
        System.out.println("data.charAt(5)=" + data.charAt(5));
        System.out.println("data.length()=" + data.length());
        System.out.println("data.indexOf('cd')=" + data.indexOf("cd"));
        System.out.println("data.substring(3, 5)=" + data.substring(3, 5));
        System.out.println("data.toUpperCase()=" + data.toUpperCase());
        
        String nickName = "bat*quffy*lot*mask";
        String[] names = nickName.split("\\*");
        
        for(String name: names){
        	System.out.println("name:" + name);
        }
	}

}
