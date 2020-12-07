import java.io.*;
import java.util.ArrayList;

public class IOChamber {
	public static void main(String[] args) throws IOException {
		ReadInput readInput = new ReadInput();
		ReadFile readFile = new ReadFile();
		PrintOutput printOutput = new PrintOutput();
		ArrayList<String> arrayList = new ArrayList<>();

		if (args.length == 0) {
			readInput.addInput(arrayList);
		} else {
			try {
				readFile.addFile(args[0], arrayList);
			} catch (FileNotFoundException e) {
				System.out.println("Файл не распознан. Введите ваши сообщения");
				readInput.addInput(arrayList);
			} finally {
				printOutput.print(arrayList);
			}
		}
	}
}
