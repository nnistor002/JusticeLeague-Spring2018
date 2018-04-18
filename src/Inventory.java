import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.DefaultListModel;

public class Inventory extends Artifacts
{
	// This stores the items description for the button details when the player wants to know the details of an item.
	public Map<String,String> itemDetail = new HashMap<String,String>();
	
	// this hashmap splits the item data for the system to know what can be used and what cannot be used. If item is not in this list the system cannot use it.
	public Map<String,String[]> itemCanUse = new HashMap<String,String[]>();
	
	// Holder for items picked up by the player at the time the button is pressed.
	DefaultListModel<String> listPickedup = new DefaultListModel<String>(); 

	// This is a holder for the items heal amount for further used. Changes every time the user pushes the use button and the item is a heal item.
	public double Heal;
	public int power;

	//======================================================
	String[] startData = {"Heal", "20", "20"}; //================== This will get edited by the final for now its just to give the player the items they need for the state of the game..
	//======================================================

	Artifacts a;

	public Inventory() {
		System.out.println("-------------------------------------");
		//=====================================================
		itemCanUse.put("Health Potion", startData); //================== This will get edited by the final for now its just to give the player the items they need for the state of the game..
		//=====================================================
	}

	/*
	 *  "pickUp" method is activated by the pickup button to collect all the items in the artifacts class within the "itemsInRoom" list 
	 *  then places the items inside "listPickup" model list to pass to the view for display so the player knows what items are in their inventory.
	 */
	public  DefaultListModel<String> pickUp(List<String[]> z) {
		listPickedup.clear();
		for(int i= 0; i < z.size();i++) {
			String item = Arrays.toString(z.get(i));
		
			String[] x = item.split("--");
			if(itemDetail.containsKey(x[3])) {
				//do nothing
			}else {
				itemDetail.put(x[3], x[5]);
				if(x[4].equals("Weapon")) {
					//NOTHING
				}else {
					String[] e = {x[6],x[7],x[8]};
					itemCanUse.put(x[3], e);
				}
			}
			listPickedup.addElement(x[3]);
		}
		return listPickedup;

	}

	
	/*
	 * This method activated by the "USE" button checks if the item is in the "itemCanUse" list to make sure items are usable
	 * then checks what type of use the item has if it is located inside the "itemCanUse" list.
	 */
	public void use(String s) {
		if(itemCanUse.containsKey(s)) {
			String[] arrayHold = itemCanUse.get(s);
			if(arrayHold[0].equals("Heal")) {
				this.Heal = (Integer.parseInt(arrayHold[1].replace("%", ""))/1.5);
			}else if(arrayHold[0].equals("Damage")){
				this.power = Integer.parseInt(arrayHold[1].replace("%", ""));
				System.out.println(power);
			}
		}
	}

	// This method gets the item name and displays the description of that item for user to see.
	public String getDetails(String str) {
		String d = itemDetail.get(str);	
		return d;
	}

}
