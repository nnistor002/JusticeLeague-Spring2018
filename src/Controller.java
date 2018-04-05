import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener
{
	
	testFrame001 view;
	
	
	Controller() { 
		  System.out.println ("Controller()");
		 } 
	
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("No")) {
			System.out.println(e.getActionCommand());
		}else {
			view.textArea.append("Hello");
		}
		
		
	}
	
	public void addView(testFrame001 v){
		  System.out.println("Controller: adding view");
		  this.view = v;
		 }

	
}
