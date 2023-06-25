
public class LoopArray {

	public static void main(String[] args) {

		String[] users = new String[2];
		users[0] = "JJY";
		users[1] = "JJK";
		//users[2] = "KSJ";
		
		for(int i=0; i<users.length; i++ ) {
			System.out.println("<li>"+users[i]+"</li>");
		}
		
	}

}
