import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Artifacts
{
	private FileReader fR;
	private  Scanner sR;
	
	Weapons w;
	
	public Map<String, ArrayList<String>> itemMap = new HashMap<String, ArrayList<String>>();
	public Map<String,String> itemEquipedable = new HashMap<String,String>();
	public List<String[]> itemsInRoom = new ArrayList<String[]>();
	public Artifacts() {
		fetchArtifacts();
		
//		for (String key : itemMap.keySet()) {
//			System.out.println(key + " " + itemMap.get(key));
//		}
	}
	
	public void fetchArtifacts() {
		
		try{		
			fR = new FileReader("artifact.txt");
			sR = new Scanner(fR);
			// =============================================BELOW is a while statement that simply reads each line of the file as a string & adds it to (line)....
			//=============================================Then splits each line by (--) just to gets the first substring (Room ID)->(e) to use as the KEY in HASHMAP (itemMap)....
			while(sR.hasNextLine()) {
				String line = sR.nextLine();
				String[] splitLine = line.split("--");
				String e = splitLine[0];
				//=========================================== BELOW is a simple if/else statement to add to HASHMAP (itemMap)
				//=========================================== if the KEY(room id) is already there then it just adds both the existing and the new values to a local arraylist (localArray1)(localArray2)
				//=========================================== then overriding the old value with the new arraylists
				if(itemMap.containsKey(e)) {
					ArrayList<String> localArray1 = new ArrayList<String>();
					for(int i = 0; i < itemMap.get(e).size();i++) {
						localArray1.add(itemMap.get(e).get(i));
					}
					localArray1.add(line);
					itemMap.put(e, localArray1);
				}else {
					ArrayList<String> localArray2 = new ArrayList<String>();
					localArray2.add(line);
					itemMap.put(e, localArray2);
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
		itemsInRoom.clear();
			if(itemMap.containsKey(s)) {
		for(int i = 0; i < itemMap.get(s).size();i++) {
			String item = (itemMap.get(s).get(i));
			String[] z = item.split(",");
			itemsInRoom.add(z);
			
			for(int j = 0; j < z.length;j++) {
				String x =  z[j];
				String[] check = x.split("--");
					if(check[4].equals("Weapon")) {
					itemEquipedable.put(check[3], x);
				}
			}
		
			}
		}
	}
}