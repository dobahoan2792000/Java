package WorkWithFile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void toFile(String nameFile, String content) {
		try (FileWriter fw = new FileWriter("test.txt")) {
			fw.write("First String to write .!");
			fw.flush();
			System.out.println("Write end .!");
		}catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}
	}
	}