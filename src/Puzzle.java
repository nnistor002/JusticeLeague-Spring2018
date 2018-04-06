
import java.io.BufferedReader;
import java.io.FileReader;


public class Puzzle {

	public static void main (String [] args) throws Exception {
		
		//change the file directory
		String filename = "/Users/hye/Desktop/JusticeLeague-Spring2018-Section1/src/Puzzle.txt";
		String strLine = null;
		
		try {
			BufferedReader rd = new BufferedReader(new FileReader(filename));
			while ((strLine = rd.readLine()) != null) {
				  // Print the content on the console
				  System.out.println(strLine);
				  }				 
			rd.close();
			} catch (Exception ex) {
				throw new NullPointerException();
				}
		}
	}
	