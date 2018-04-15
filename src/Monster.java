import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Monster {

	public static void main (String [] args) throws Exception {
		

		String filename = "Monster Table1.txt";
		
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(filename));
		    String read = null;
		    
		    while ((read = in.readLine()) != null) {
		    	// split
		    		String[] split = read.split(",");
		    		List<String> monsterList = new ArrayList<String>();
		    	// store in a list
		    		for (String m : split) {
		    			monsterList.add(m);
		    			}
		    		
		    		// System.out.println(monsterList);
		    		for (String part : monsterList) {
		    			System.out.println(part);
		    		}
		    }
		} catch (IOException e) {
			
			e.printStackTrace();
		
		} finally {
			
			try {
				in.close();
			} catch (Exception e) {
				
			}
		}
	}
}