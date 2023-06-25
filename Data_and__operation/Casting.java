
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		
		System.out.println(a);
		System.out.println(b);
		
		//int c = 1.1;
		//System.out.println(c);
		double d = 1.1;
		int e = (int) 1.1;
		
		System.out.println(d);
		System.out.println(e);
		
		//1 to String
		String f = Integer.toString(1);
		System.out.println(f.getClass());
	}

}
