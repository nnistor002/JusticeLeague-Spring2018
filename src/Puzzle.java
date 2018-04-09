import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Puzzle {

	public static void main (String [] args) throws Exception {
		

		String filename = "Puzzle.txt";
	//	
		
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(filename));
		    String read = null;
		    
		    while ((read = in.readLine()) != null) {
		    	//split --
		    		String[] splited = read.split("- - ");
		    		List<String> puzzleList = new ArrayList<String>();
		    	// store into list
		    		for (String p : splited) {
		    			puzzleList.add(p);
		    			}
		    		
		    		//System.out.println(puzzleList);
		    		for (String part :puzzleList) {
			            System.out.println(part);
			        }
		    		}
		   
			} catch (IOException e) {
		    //
		    		e.printStackTrace();
		    	
				} finally {
		    			
		    			try {
		    				in.close();
		    				
		    				} catch (Exception e) {
		    					
		    				}
		    			}
		}
}
