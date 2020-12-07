import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReadInput {
	BufferedReader reader;
	String str;

	public ReadInput() {
		this.str = null;
		this.reader = null;
	}

	public void addInput(ArrayList<String> arrayList) throws IOException {
		reader = new BufferedReader(new InputStreamReader(System.in));
		while (!(str = reader.readLine()).equals("")) {
			arrayList.add(str);
		}
		reader.close();
	}
}
