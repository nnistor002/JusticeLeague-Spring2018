import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.DefaultListModel;

public class Inventory extends Artifacts
{
	public Map<String,String> itemDetail = new HashMap<String,String>();
	public Map<String,String[]> itemCanUse = new HashMap<String,String[]>();
	DefaultListModel listPickedup = new DefaultListModel(); 
	
	public double Heal;
	
	Artifacts a;
	
	public Inventory() {
		System.out.println("-------------------------------------");
	}
	
	
	public  DefaultListModel pickUp(List<String[]> z) {
		listPickedup.clear();
		for(int i= 0; i < z.size();i++) {
			String item = Arrays.toString(z.get(i));
			//System.out.println(item);
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
		
		
//		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//		for (String key : itemDetail.keySet()) {
//			System.out.println(key + " " + itemDetail.get(key));
//		}
		
		return listPickedup;
		
	}
	
	public void use(String s) {
			if(itemCanUse.containsKey(s)) {
				String[] arrayHold = itemCanUse.get(s);
				if(arrayHold[0].equals("Heal")) {
					this.Heal = (Integer.parseInt(arrayHold[1].replace("%", ""))/1.5);
				}
			}else {
				//System.out.println("false");  <------------- DAMAGE GOES HERE!!!
			}
	}
	
	public String getDetails(String str) {
		String d = itemDetail.get(str);	
		return d;
	}
	
}
