
public class Star {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
		System.out.print("*");
		}
		
		for(int i=0;i<5;i++) {
			System.out.println("*");
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
			System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(i+1);
			}
			System.out.println("");
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(j+1);
			}
			System.out.println("");
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(j+i+1);
			}
			System.out.println("");
		}
		
		for(int i=0;i<5;i++) {
			for(int j=5;j<10;j++) {
				System.out.print(j-i);
			}
			System.out.println("");
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=0;i<5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(" ");
			}
			for(int j=5;j>i;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=0;i<5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=0;i<4;i++) {
			for(int j=4;j>i;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=0;i<5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<i+2;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		

	}

}
