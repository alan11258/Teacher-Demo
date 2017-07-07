package tw.leonchen.myproject.oop;

class SecuritySystem {
	
	private String systemUser = "johnson", systemPwd = "54321";

	public boolean verifyId1(String userName, String userPwd) {

		if (systemUser.equals(userName) && systemPwd.equals(userPwd)) {
			return true;
		}
		
		return false;
	}
	
	public boolean verifyId2(String userName, String userPwd){
		
		if(systemUser.equalsIgnoreCase(userName.trim()) && systemPwd.equalsIgnoreCase(userPwd.trim())){
			return true;
		}
		
		return false;
	}
}

public class CallTestEqualsEx3 {

	public static void main(String[] args) {

		SecuritySystem verify = new SecuritySystem();

		if (args.length >= 2) {
			boolean status = verify.verifyId2(args[0], args[1]);
			System.out.println("status:" + status);
			
			if(status){
				System.out.println("Success");
			}else{
				System.out.println("Fail");
			}
		}
	}

}
