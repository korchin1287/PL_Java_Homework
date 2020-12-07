import java.io.*;
import java.util.ArrayList;

public class IOChamber {

	public static void addInput(BufferedReader reader, ArrayList<String> arrayList) throws IOException {
		reader = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while (!(str = reader.readLine()).equals("")) {
			arrayList.add(str);
		}
		reader.close();
	}

	public static void printOutput(ArrayList<String> arrayList){
		for(int i = 0; i < arrayList.size(); i++){
			if (i % 2 == 0)
				System.out.println(arrayList.get(i));
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader reader = null;
		ArrayList<String> arrayList = new ArrayList<>();
		String str;
		if (args.length == 0) {
			addInput(reader, arrayList);
		} else {
			try {
				reader = new BufferedReader(new FileReader(args[0]));
				while ((str = reader.readLine()) != null){
					arrayList.add(str);
				}
				reader.close();
			} catch (FileNotFoundException e) {
				System.out.println("Файл не распознан. Введите ваши сообщения");
				addInput(reader, arrayList);
			}
			finally {
				printOutput(arrayList);
			}
		}
	}
}
