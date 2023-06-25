import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {
	
	public static void printTwoTimes(String text, String delimeter) {
		System.out.println(delimeter);
		System.out.println(text);
		System.out.println(text);
	}
	
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
	}

	public static void main(String[] args) throws IOException {
		

		printTwoTimes("a", "-");
		
		System.out.println(twoTimes("hello","*"));
		FileWriter fw = new FileWriter("out.txt");
		fw.write(twoTimes("Hello JJY","*"));
		fw.close();
		//Email.send("jjyeon@seegene.com","hello",twoTimes("a","&"));
		printTwoTimes("b", "*");
		printTwoTimes("c", "&");
	}

	

}
