import javax.swing.DefaultListModel;

public class Weapons extends Artifacts
{
	
	Artifacts a;
	
	/*
	 * This "equipped" model list is for storing the items that the player has equipped.
	 */
	DefaultListModel<String> equipped = new DefaultListModel<String>(); 

	public Weapons() {
		//NOTHING
	}
	
	
	/*
	 *   "equipIt" method adds the item that the player wants to equip to the "equipped" model list then gets passed to the view by the controller for display.
	 */
	public DefaultListModel<String> equipIt(String str) {
		equipped.clear();
		if(equipped.isEmpty()) {
			equipped.addElement(str);
		}
		return equipped;
	}
}
