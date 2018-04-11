import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Scanner;

import javax.swing.Icon;

public class Room extends Observable
{
	private static FileReader fR;
	private static Scanner sR;
	
	private  Map<String, ArrayList<String>> mapHolderMap = new HashMap<String, ArrayList<String>>();
	public  Map<String,Boolean> completedMaps = new HashMap<String,Boolean>();
	public List<String[]> currentRoom = new ArrayList<String[]>();
	public String[] navRoomArray = new String[6];
	public Boolean[] navBooleanArray = new Boolean[6];
	public ArrayList roomLooted = new ArrayList();
	
	public String roomHelp = "\n ---------- You have entered a Tower you can: ----------"
			+ "				\n -----Examine the rooms to look for ways around. "
			+ "				\n -----Search the rooms for items and pick them up."
			+"                 \n -----Click arrow buttons that will appear only if there is another room related to the button after you have examined the room"
			+"                 \n ----- You cannot leave the tower without the tower's exit Key.";
	public String roomDescription;
	public String roomID;
	String[] here;
	String tower;

	public Room() {
		fetchMapDATA();
	}
	
	public  void fetchMapDATA() {
		
		try{		
			fR = new FileReader("MapData.txt");
			sR = new Scanner(fR);
		
			while(sR.hasNextLine()) {
				String line = sR.nextLine();
				String[] splitLine = line.split("--");
				String e = splitLine[0];
		
				if(mapHolderMap.containsKey(e)) {
					ArrayList<String> localArray1 = new ArrayList<String>();
					for(int i = 0; i < mapHolderMap.get(e).size();i++) {
						localArray1.add(mapHolderMap.get(e).get(i));
						completedMaps.put(e, false);
					}
					localArray1.add(line);
					mapHolderMap.put(e, localArray1);
				}else {
					ArrayList<String> localArray2 = new ArrayList<String>();
					localArray2.add(line);
					mapHolderMap.put(e, localArray2);
					completedMaps.put(e, false);
				}
			}
			fR.close();
			sR.close();
		}catch(IOException e) {
			e.printStackTrace();
		}	
	}	
	
	public String getFirstRoom() {
		String[] here = currentRoom.get(0);
		String displayRoom = here[2];	
		return displayRoom.toString();
	}
	
	public String getCurrentRoom(String s) {
		
		for(int i = 0;i < currentRoom.size();i++) {
			String[] z = currentRoom.get(i);
			if(z[1].equals(s)) {
				this.here = z;
			}
		}	
		
		//System.out.println(Arrays.toString(here));
		String displayRoom = here[2];
		this.roomDescription = here[3];
		this.roomID = here[1];
		setNavigation();
		
		return displayRoom.toString();
	}
	
	
	// This will run once per LEVEL to get all the rooms and place them in currentRoom Array
	public void getCurrentLocation(Icon s) {
		String location =((s.toString().replace(".png", "")).replace("Maps/", ""));
		this.tower = location;
		//System.out.println(location); 
		//System.out.println(mapHolderMap.get(location).size());
		for(int i =0;i< mapHolderMap.get(location).size();i++) {
			String line =(mapHolderMap.get(location).get(i));
			String[] lineSplit = line.split("--");
			currentRoom.add(lineSplit);
		}

			
//		System.out.println("===============================================");
//		for(String[] strArr: currentRoom) {
//			System.out.println(Arrays.toString(strArr));
//		}
//		System.out.println("===============================================");

	}
	
	public void setroomLooted(String room) {
		roomLooted.add(room);
	}
	
	
	public void setNavigation() {
		//System.out.println("In NAV");
		for(int i = 0; i < currentRoom.size();i++) {
			String[] array = currentRoom.get(i);
			if(array[1].equals(roomID)) {
				navRoomArray[0] = array[4];
				navRoomArray[1] = array[5];
				navRoomArray[2] = array[6];
				navRoomArray[3] = array[7];
				navRoomArray[4] = array[8];
				navRoomArray[5] = array[9];
			}else {
				//Nothing...
			}
		}
			
		
		//System.out.println(Arrays.toString(navRoomArray));
		
		for(int i =0; i < navRoomArray.length;i++) {
			if(navRoomArray[i].equals("_")) {
				navBooleanArray[i] = false;
			}else {
				navBooleanArray[i] = true;
			}
		}
		
		//System.out.println(Arrays.toString(navRoomArray));
		//System.out.println(Arrays.toString(navBooleanArray));
	}
	
	
	
}
