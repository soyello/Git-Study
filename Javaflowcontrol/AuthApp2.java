
public class AuthApp2 {

	public static void main(String[] args) {
		
		System.out.println(args[0]);
		
		String id = "JJY";
		String inputID = args[0];
		
		String pw = "7777";
		String pw2 = "1111";
		String inputPW = args[1];
	
		
		System.out.println("Hi.");
		
//		if(inputID.equals(id)) {
//			if(inputPW.equals(pw)) {
//			System.out.println("I love you!");
//			}else {
//			System.out.println("Wrong PW");
//			}
//		}else {
//			System.out.println("Get out");
//		}
		boolean isRightPass = (inputPW.equals(pw) || inputPW.equals(pw2));
		if(inputID.equals(id) && isRightPass) {
			System.out.println("I love you!");
		}else {
			System.out.println("Get out");
		}
	}

	
}
