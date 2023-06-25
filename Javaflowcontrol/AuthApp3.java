
public class AuthApp3 {

	public static void main(String[] args) {
		
		//String[] users = {"JJY","JJK","KSJ"};
		String[][] users = {
				{"JJY","1111"},
				{"JJK","2222"},
				{"KSJ","3333"}
		};
		String inputID = args[0];
		String inputPW = args[1];
		
		boolean isLogined = false;
		for(int i=0; i<users.length; i++) {
			String[] current = users[i];
			if(current[0].equals(inputID) &&
				current[1].equals(inputPW)) {
				isLogined = true;
				break;
				}

			}
		System.out.println("Hi.");
		if(isLogined) {
			System.out.println("I love You!!");
		}else {
			System.out.println("Get out.");
		}
}

}


