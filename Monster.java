import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Monster
{
	private FileReader fR;
	private  Scanner sR;
	
	private Map<String, ArrayList<String>> monsterMap = new HashMap<String, ArrayList<String>>();
	public List<String[]> monsterInRoom = new ArrayList<String[]>();
	public Monster() {
		fetchMonster();
		
//		for (String key : itemMap.keySet()) {
//			System.out.println(key + " " + itemMap.get(key));
//		}
	}
	
	public void fetchMonster() {
		
		try{		
			fR = new FileReader("Monster Table1.txt");
			sR = new Scanner(fR);
			// =============================================BELOW is a while statement that simply reads each line of the file as a string & adds it to (line)....
			//=============================================Then splits each line by (,,) just to gets the first substring (Room ID)->(e) to use as the KEY in HASHMAP (itemMap)....
			while(sR.hasNextLine()) {
				String line = sR.nextLine();
				String[] splitLine = line.split(",,");
				String e = splitLine[0];
				//=========================================== BELOW is a simple if/else statement to add to HASHMAP (itemMap)
				//=========================================== if the KEY(room id) is already there then it just adds both the existing and the new values to a local arraylist (localArray1)(localArray2)
				//=========================================== then overriding the old value with the new arraylists
				if(monsterMap.containsKey(e)) {
					ArrayList<String> localArray1 = new ArrayList<String>();
					for(int i = 0; i < monsterMap.get(e).size();i++) {
						localArray1.add(monsterMap.get(e).get(i));
					}
					localArray1.add(line);
					monsterMap.put(e, localArray1);
				}else {
					ArrayList<String> localArray2 = new ArrayList<String>();
					localArray2.add(line);
					monsterMap.put(e, localArray2);
				}
			}
			fR.close();
			sR.close();
		}catch(IOException e) {
			e.printStackTrace();
		}	
	}	
	
	
	public void getItems(String s) {
		//System.out.println(s);
		monsterInRoom.clear();
			if(monsterMap.containsKey(s)) {
		for(int i = 0; i < monsterMap.get(s).size();i++) {
			String item = (monsterMap.get(s).get(i));
			String[] z = item.split(",");
			monsterInRoom.add(z);
			}	
		}else {
		System.out.println("Sorry  No Items Here");
		}
//		for(int i = 0; i < itemsInRoom.size();i++) {
//			String[] x = itemsInRoom.get(i);
//			System.out.println(Arrays.toString(x));
//		}
	}
}