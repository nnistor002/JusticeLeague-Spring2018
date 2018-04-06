import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Room {
	static int lineNum;
	public static void main (String [] args) throws IOException {
//		System.out.println("Enter a Rooom number");
//		Scanner scan = new Scanner(System.in);
//		String userInput = scan.next();
	
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\tman2\\Desktop\\JusticeLeague-Spring2018-Section1\\src\\Room.txt"));

		while (br.ready()) {
//			String brWord = br.read()
			String brLine = br.readLine();
			System.out.println(brLine);
			String line =br.readLine();
//			System.out.println(br.readLine());
			String[] splitLines = line.split("--");
//			System.out.println();
			for(String element : splitLines) {
				System.out.println();
				System.out.println(element);
			}
		}
		br.close();

		
	}

}
