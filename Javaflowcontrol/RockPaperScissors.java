import java.lang.reflect.Array;
import java.util.List;
import java.util.Scanner;

public class RockPaperScissors {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("플레이어1 입력하세요. (가위 / 바위 / 보)");
		String player1 = scanner.nextLine();
		
		System.out.println("플레이어2 입력하세요. (가위 / 바위 / 보)");
		String player2 = scanner.nextLine();
		
		System.out.printf("player1 = %s%n", player1);
		System.out.printf("player2 = %s%n", player2);
		
//		if(player1.equals("가위") && player2.equals("바위")) {
//			System.out.println("player2 win");
//		}else if(player1.equals("바위") && player2.equals("보")) {
//			System.out.println("player2 win");
//		}else if(player1.equals("보") && player2.equals("가위")) {
//			System.out.println("player2 win");
//		}else if(player1.equals(player2)) {
//			System.out.println("Tie");
//		}else if(player2.equals("바위") && player1.equals("보")) {
//			System.out.println("player1 win");
//		}else if(player2.equals("가위") && player1.equals("바")) {
//			System.out.println("player1 win");
//		}else if(player2.equals("보") && player1.equals("가위")) {
//			System.out.println("player1 win");
//		}else {
//			System.out.println("Get out.");
//		}
		
		List<String> choice = List.of( "가위", "바위", "보" );
		
		if (!choice.contains(player1) || !choice.contains(player2)) {
			System.out.println("나가 이새꺄");
			return;
		}
		
		String winner = "";
		
		if (player1.equals(player2)) {
			winner = "draw";
		} else if (player1.equals("가위")) {
			if (player2.equals("바위")) {
				winner = "player2";
			} else if (player2.equals("보")) {
				winner = "player1";
			}
		} else if (player1.equals("바위")) {
			if (player2.equals("가위")) {
				winner = "player1";
			} else if (player2.equals("보")) {
				winner = "player2";
			}
		} else if (player1.equals("보")) {
			if (player2.equals("가위")) {
				winner = "player2";
			} else if (player2.equals("바위")) {
				winner = "player1";
			}
		}
		
		System.out.println(winner);
	}

}
