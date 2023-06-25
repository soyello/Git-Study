import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource{

	public static void main(String[] args) {
		try(FileWriter f = new FileWriter(fileName:"data.text")) {
		 f.write(str:"Hello");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
