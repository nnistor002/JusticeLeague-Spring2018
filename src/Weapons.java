import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.swing.DefaultListModel;

public class Weapons extends Artifacts
{
	
	Artifacts a;
	
	public Map<String,String> xyz = new HashMap<String,String>();
	
	DefaultListModel equiped = new DefaultListModel(); 

	public Weapons() {
		//NOTHING
	}
	
	public DefaultListModel equipIt(String str) {
		equiped.clear();
		if(equiped.isEmpty()) {
			equiped.addElement(str);
		}
		return equiped;
	}
}
