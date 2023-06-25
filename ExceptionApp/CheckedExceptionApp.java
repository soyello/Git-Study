import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {

	public static void main(String[] args) {
		FileWriter f = null;
		try {
		 f = new FileWriter(fileName:"data.text");
		 f.write(str:"Hello");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(f!=null) {
				try {
					f.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
