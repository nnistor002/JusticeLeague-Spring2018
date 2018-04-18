import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Scanner;
import java.util.Set;

import javax.swing.DefaultListModel;


//RoomID—-PuzzleID—-Riddle—-Choice—-Solution—-Hint

public class Puzzle extends Observable {
	Scanner keyboard = new Scanner (System.in );
	private static FileReader fR;
	private static Scanner sR;
	
	private Map<String, ArrayList<String>> puzzleMap = new HashMap<String, ArrayList<String>>();
	//public List<String[]> puzzleInRoom = new ArrayList<String[]>();
	public String[] puzzleInRoom;
	public String hint;
	public String choice;
	public String riddle;
	public String answer;
	public String question;
	
	public Map<String,Boolean> puzzleCompleted = new HashMap<String,Boolean>();
	
	// this hashmap splits the puzzle data for the system to know what can be used and what cannot be used. 
	//If puzzle is not in this list the system cannot use it.
	//public Map<String,String[]> puzzleCanUse = new HashMap<String,String[]>();
	
	
	
	public Puzzle() {
		fetchPuzzle();
	}	
	
	public void fetchPuzzle() {
		
		try {
			fR = new FileReader("Puzzle.txt");
			sR = new Scanner(fR);
			
			while(sR.hasNextLine()) {
				String line = sR.nextLine();
				String[] splitLine = line.split("--"); //splitLine = [RoomID—-PuzzleID—-Riddle—-Choice—-Solution—-Hint]
				String e = splitLine[0];  //string e = roomID
				
				if(puzzleMap.containsKey(e)) { // if 
					ArrayList<String> localArray1 = new ArrayList<String>();
					for(int i = 0; i < puzzleMap.get(e).size();i++) {
						localArray1.add(puzzleMap.get(e).get(i)); // 
					}
					localArray1.add(line);
					puzzleMap.put(e, localArray1);
					
				}else {
					ArrayList<String> localArray2 = new ArrayList<String>();
					localArray2.add(line);
					puzzleMap.put(e, localArray2);
				}
				puzzleCompleted.put(e, false);
			}
		} catch (IOException e) {		   
			e.printStackTrace();
			
		} finally {
			try {
				//in.close();
				fR.close();
				sR.close();
			} catch (Exception e) {
			}
		}
	}
	
	
	public void getPuzzle(String s) {
		//puzzleInRoom.clear();
		if(puzzleMap.containsKey(s)) { // 
			for(int i = 0; i < puzzleMap.get(s).size();i++) {
				String puzzle = (puzzleMap.get(s).get(i));
				System.out.println(puzzle);
				String[] z = puzzle.split("--");
				System.out.println(Arrays.toString(z));
				this.puzzleInRoom = z;
			}	
		}else {
			System.out.println("Sorry No Puzzle Here");
		}
	}
	
	public void examine(String s) {
		
		if(puzzleInRoom[0].contains(s)) {
			this.question = puzzleInRoom[2];
			this.choice = puzzleInRoom[3];
			this.answer = puzzleInRoom[4];
			this.hint = puzzleInRoom[5];
		}
	}
	
	
	public String getQuestion() {
		//	String q = question;	
		return question;
	}
	
	
	public String getChoice() {
		//	String c = choice;
		return choice;
	}
	
	public String getAnswer(String a) { // String a is the answer from user 
		if(answer.contains(a.substring(0,1).toUpperCase())) {
			String r= "That's right!";
			return r;
		} else {
			String r= "That's wrong!";
			return r;
		} 
	}
	
	public String getHint() {
		return hint;
	}
	
	public void puzzleComplete(String a) {
		puzzleCompleted.replace(a, true);
	}
	
	public String toStringQC() {
		//	String print = q + "\n" + c;
		String print = question + "\n---- " + choice+ " ----";
		return print;
	}
	
	public String quit() {
		String quit = "You quit the puzzle.";
		return quit;
	} 	
	
	public boolean isThereAPuzzle(String s) {
		if(puzzleMap.containsKey(s)) {
			return true;
		}else {
			return false;
		}
	}
	
}

