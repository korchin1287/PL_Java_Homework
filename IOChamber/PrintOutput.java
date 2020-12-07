import java.util.ArrayList;

public class PrintOutput {
	public PrintOutput() {
	}

	public void print(ArrayList<String> arrayList) {
		for (int i = 0; i < arrayList.size(); i += 2) {
			System.out.println(arrayList.get(i));
		}
	}
}
