import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EchoChamber {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> arrayList = new ArrayList<>();
		String str;
		while (!(str = reader.readLine()).equals("")){
			arrayList.add(str);
		}
		for(String ret : arrayList){
			System.out.println(ret);
		}
	}
}
