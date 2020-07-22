package WorkWithFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public class TaoFolder {
	public static void main(String[] args) throws IOException {
		Calendar cal = Calendar.getInstance();
		String year = Integer.toString(cal.get(Calendar.YEAR));
		String month = Integer.toString(cal.get(Calendar.MONTH));
		String monthYear = month + year;
		String path = "E:/" + monthYear;
		File fl = new File(path);
		fl.mkdir();
		FileWriter fl2 = new FileWriter(path+"/text2.txt");
		fl2.write("22222");
		fl2.flush();
	}
}
