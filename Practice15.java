import java.io.FileWriter;
import java.io.IOException;

public class Practice15 {

	private static Practice15 theInstance;
	private FileWriter writer;

	private Practice15() {
		try {
			this.writer = new FileWriter("c:\\dummylog.txt");
		} catch (IOException e) {
			System.out.println("error");

		}
	}

	public void log(String msg) throws IOException {
		this.writer.write(msg);
	}

	public static Practice15 getInstance() {
		if (theInstance == null)
			theInstance = new Practice15();

		return theInstance;
	}

}
