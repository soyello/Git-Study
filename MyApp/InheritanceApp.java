class Cal{
	int v1, v2;
	Cal(int v1, int v2){
		this.v1 = v1;
		this.v2 = v2;
		System.out.println("Cal init!!");
	}
	public int sum() {return this.v1+v2;}
}

class Cal2 extends Cal{

	Cal2(int v1, int v2) {
		super(v1, v2);
		System.out.print("Cal2 init!!");
		
	}
	public int minus() {return this.v1-v2;}
}

public class InheritanceApp {

	public static void main(String[] args) {
		Cal2 c2 = new Cal2(2,1);
		System.out.println(c2.sum());
		System.out.println(c2.minus());
		
		Cal2 c3 = new Cal2(3,4);
		System.out.println(c3.sum());
		System.out.println(c.minus());
	}

}
