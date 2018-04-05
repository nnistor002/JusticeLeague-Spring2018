import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener
{
	
	GameFrame view;
	
	
	Controller() { 
		  System.out.println ("Controller()");
		 } 
	
	public void actionPerformed(ActionEvent e){
		
			System.out.println(e.getActionCommand());
		
	}
	
	public void addView(GameFrame v){
		  System.out.println("Controller: adding view");
		  this.view = v;
		 }

	
}
