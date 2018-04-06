import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener
{
	
	GameFrame view;
	
	
	Controller() { 
		  System.out.println ("Controller()");
		 } 
	
	public void actionPerformed(ActionEvent e){
		
		switch(e.getActionCommand()){
			case("PickupButton" ):
				view.txtGuiConsolePrintout.append("\n" + e.getActionCommand());
			break;
			case("DropButton" ):
				view.txtGuiConsolePrintout.append("\n" + e.getActionCommand());
			break;
			case("EquipButton" ):
				view.txtGuiConsolePrintout.append("\n" + e.getActionCommand());
			break;
			case("UnequipButton" ):
				view.txtGuiConsolePrintout.append("\n" + e.getActionCommand());
			break;
			case("UseItemButton" ):
				view.txtGuiConsolePrintout.append("\n" + e.getActionCommand());
			break;
			case("ExamineMonsterButton" ):
				view.txtGuiConsolePrintout.append("\n" + e.getActionCommand());
			break;
			case("AttackButton" ):
				view.txtGuiConsolePrintout.append("\n" + e.getActionCommand());
			break;
			case("FleeButton" ):
				view.txtGuiConsolePrintout.append("\n" + e.getActionCommand());
			break;
			case("ExaminePuzzle" ):
				view.txtGuiConsolePrintout.append("\n" + e.getActionCommand());
			break;
			case("HintButton" ):
				view.txtGuiConsolePrintout.append("\n" + e.getActionCommand());
			break;
			case("SolvePuzzleButton" ):
				view.txtGuiConsolePrintout.append("\n" + e.getActionCommand());
			break;
			case("QuitPuzzleButton" ):
				view.txtGuiConsolePrintout.append("\n" + e.getActionCommand());
			break;
			case("NorthButton" ):
				view.txtGuiConsolePrintout.append("\n" + e.getActionCommand());
			break;
			case("WestButton" ):
				view.txtGuiConsolePrintout.append("\n" + e.getActionCommand());
			break;
			case("EastButton" ):
				view.txtGuiConsolePrintout.append("\n" + e.getActionCommand());
			break;
			case("SouthButton" ):
				view.txtGuiConsolePrintout.append("\n" + e.getActionCommand());
			break;
			case("EnterRoomButton" ):
				view.txtGuiConsolePrintout.append("\n" + e.getActionCommand());
			break;
			case("ExamineRoomButton" ):
				view.txtGuiConsolePrintout.append("\n" + e.getActionCommand());
			break;
			case("SearchButton" ):
				view.txtGuiConsolePrintout.append("\n" + e.getActionCommand());
			break;
			case("ExitRoomButton" ):
				view.txtGuiConsolePrintout.append("\n" + e.getActionCommand());
			break;
			case("FloorDownButton" ):
				view.txtGuiConsolePrintout.append("\n" + e.getActionCommand());
			break;
			case("FloorUpButton" ):
				view.txtGuiConsolePrintout.append("\n" + e.getActionCommand());
			break;
			case("SaveGameButton" ):
				view.txtGuiConsolePrintout.append("\n" + e.getActionCommand());
			break;
			case("LoadGameButton" ):
				view.txtGuiConsolePrintout.append("\n" + e.getActionCommand());
			break;
			case("HelpButton" ):
				view.txtGuiConsolePrintout.append("\n" + e.getActionCommand());
			break;
			case("ExitButton" ):
				view.txtGuiConsolePrintout.append("\n" + e.getActionCommand());
			break;
		}
		
		
	}
	
	public void addView(GameFrame v){
		  System.out.println("Controller: adding view");
		  this.view = v;
		 }

	
}
