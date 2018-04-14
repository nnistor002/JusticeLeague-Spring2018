import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
	
	// This hashMap holds all the information fetched by the "fetchMapData" method from the MapData.txt file
	private  Map<String, ArrayList<String>> mapHolderMap = new HashMap<String, ArrayList<String>>();
	
	// This is a boolean hashMap that is used to tell the system if the map is completed or not.
	public  Map<String,Boolean> completedMaps = new HashMap<String,Boolean>();
	
	// This is will hold all the information that the user is currently in. (roomID,items,description, and so on...)
	public List<String[]> currentRoom = new ArrayList<String[]>();
	
	//This array will be used to find what paths the user can take to explore the map. (NORTH , EAST, SOUTH, WEST, FLOOR UP , FLOOR DOWN) based off of the current room
	public String[] navRoomArray = new String[6];
	
	// This array will let the system know the current room has a path based off (NORTH , EAST, SOUTH, WEST, FLOOR UP , FLOOR DOWN) this is also used to displays the buttons according to the paths.
	public Boolean[] navBooleanArray = new Boolean[6];
	
	// This array is to tell the system that the current room they are in has already been looted.
	public ArrayList<String> roomLooted = new ArrayList<String>();
	
	
	// This "roomHelp" lets the user know what to do in the rooms.
	public String roomHelp = "\n ---------- You have entered a Tower you can: ----------"
			+ "				\n -----Examine the rooms to look for ways around. "
			+ "				\n -----Search the rooms for items and pick them up."
			+"                 \n -----Click arrow buttons that will appear only if there is another room related to the button after you have examined the room"
			+"                 \n ----- You cannot leave the tower without the tower's exit Key.";
	
	// This will hold the current rooms description for when the user clicks examine.
	public String roomDescription;
	
	// This is a holder for the roomsID so that the system can use it to search for information related to the current roomID
	public String roomID;
	
	//this array holds the information related to the room
	String[] here;
	
	// This holds the current wing or tower the players in.
	String tower;

	
	//This is the first method run when the game is started to let the system know to collect the information for the game from MapData.txt,
	public Room() {
		fetchMapDATA();
	}
	
	// This method collects all the information on the game maps from "MapData.txt"
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
	
	
	// This is run when the player first enters a wing or tower so the system can get the first room of the tower or wing.
	public String getFirstRoom() {
		String[] here = currentRoom.get(0);
		String displayRoom = here[2];	
		return displayRoom.toString();
	}
	
	
	// This will get the information of the current room the user is in.
	public String getCurrentRoom(String s) {
		
		for(int i = 0;i < currentRoom.size();i++) {
			String[] z = currentRoom.get(i);
			if(z[1].equals(s)) {
				this.here = z;
			}
		}	
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
		
		for(int i =0;i< mapHolderMap.get(location).size();i++) {
			String line =(mapHolderMap.get(location).get(i));
			String[] lineSplit = line.split("--");
			currentRoom.add(lineSplit);
		}
	}
	
	public void setroomLooted(String room) {
		roomLooted.add(room);
	}
	
	
	public void setNavigation() {
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
				// DO Nothing...
			}
		}
		
		for(int i =0; i < navRoomArray.length;i++) {
			if(navRoomArray[i].equals("_")) {
				navBooleanArray[i] = false;
			}else {
				navBooleanArray[i] = true;
			}
		}

	}
	
	
}
