import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Room {
	static int lineNum;

	public static void main(String[] args) throws IOException {
		// System.out.println("Enter a Rooom number");
		// Scanner scan = new Scanner(System.in);
		// String userInput = scan.next();

		String strLine = null;
		BufferedReader br = new BufferedReader(
				new FileReader("C:\\Users\\tman2\\Desktop\\JusticeLeague-Spring2018-Section1\\src\\Room.txt"));

		try {
			BufferedReader rd = new BufferedReader(
					new FileReader("C:\\Users\\tman2\\Desktop\\JusticeLeague-Spring2018-Section1\\src\\Room.txt"));
			while ((strLine = rd.readLine()) != null) {
				// Print the content on the console
				System.out.println(strLine);
			}
			rd.close();
		} catch (Exception ex) {
			throw new NullPointerException();
		}

		// while (br.ready()) {
		//// String brWord = br.read()
		// String brLine = br.readLine();
		// System.out.println(brLine);
		// String line =br.readLine();
		//// System.out.println(br.readLine());
		// String[] splitLines = line.split("--");
		//// System.out.println();
		// for(String element : splitLines) {
		// System.out.println();
		// System.out.println(element);
		// }
		// }
		br.close();

	}

}
