import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.ImageIcon;


public class Controller implements ActionListener
{
	
	GameFrame view;
	Room r;
	Artifacts a;
	
	Controller() { 
		System.out.println ("Controller()");
	} 
	
	public void actionPerformed(ActionEvent e){
		
		switch(e.getActionCommand()){
			case("PickupButton" ):
				
			
			break;
			case("DropButton" ):
				
			
			break;
			case("EquipButton" ):
				
			
			break;
			case("UnequipButton" ):
				
			
			break;
			case("UseItemButton" ):
				
			
			break;
			case("ExamineMonsterButton" ):
				
			break;
			case("AttackButton" ):
				
			break;
			case("FleeButton" ):
				
			break;
			case("ExaminePuzzle" ):
				
			break;
			case("HintButton" ):
				
			break;
			case("SolvePuzzleButton" ):
				
			break;
			case("QuitPuzzleButton" ):
				
			break;
			case("NorthButton" ):
				
			if(r.navBooleanArray[0].equals(true)) {
				view.mapBox.setIcon(new ImageIcon(r.navRoomArray[0]));
				view.btnNorth.setVisible(false);
				view.btnEast.setVisible(false);
				view.btnSouth.setVisible(false);
				view.btnWest.setVisible(false);
				view.btnFloorUp.setVisible(false);
				view.btnFloorDown.setVisible(false);
			}
			view.txtFieldMapTitle.setText((view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", ""));
			break;
			case("EastButton" ):
				
			if(r.navBooleanArray[1].equals(true)) {
				view.mapBox.setIcon(new ImageIcon(r.navRoomArray[1]));
				view.btnNorth.setVisible(false);
				view.btnEast.setVisible(false);
				view.btnSouth.setVisible(false);
				view.btnWest.setVisible(false);
				view.btnFloorUp.setVisible(false);
				view.btnFloorDown.setVisible(false);
			}
			view.txtFieldMapTitle.setText((view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", ""));
			break;
			case("SouthButton" ):
				
			if(r.navBooleanArray[2].equals(true)) {
				view.mapBox.setIcon(new ImageIcon(r.navRoomArray[2]));
				view.btnNorth.setVisible(false);
				view.btnEast.setVisible(false);
				view.btnSouth.setVisible(false);
				view.btnWest.setVisible(false);
				view.btnFloorUp.setVisible(false);
				view.btnFloorDown.setVisible(false);
			}
			view.txtFieldMapTitle.setText((view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", ""));
			break;
			case("WestButton" ):
				
			if(r.navBooleanArray[3].equals(true)) {
				view.mapBox.setIcon(new ImageIcon(r.navRoomArray[3]));
				view.btnNorth.setVisible(false);
				view.btnEast.setVisible(false);
				view.btnSouth.setVisible(false);
				view.btnWest.setVisible(false);
				view.btnFloorUp.setVisible(false);
				view.btnFloorDown.setVisible(false);
			}
			view.txtFieldMapTitle.setText((view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", ""));
			break;
			case("FloorUpButton" ):
				
			if(r.navBooleanArray[4].equals(true)) {
				view.mapBox.setIcon(new ImageIcon(r.navRoomArray[4]));
				view.btnNorth.setVisible(false);
				view.btnEast.setVisible(false);
				view.btnSouth.setVisible(false);
				view.btnWest.setVisible(false);
				view.btnFloorUp.setVisible(false);
				view.btnFloorDown.setVisible(false);
			}
			view.txtFieldMapTitle.setText((view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", ""));
			break;
			case("FloorDownButton" ):
				
			if(r.navBooleanArray[5].equals(true)) {
				view.mapBox.setIcon(new ImageIcon(r.navRoomArray[5]));
				view.btnNorth.setVisible(false);
				view.btnEast.setVisible(false);
				view.btnSouth.setVisible(false);
				view.btnWest.setVisible(false);
				view.btnFloorUp.setVisible(false);
				view.btnFloorDown.setVisible(false);
			}
			view.txtFieldMapTitle.setText((view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", ""));
			break;
			case("EnterButton" ):
				
				r.getCurrentLocation(view.mapBox.getIcon());
			//System.out.println(view.mapBox.getIcon());
			
			//System.out.println(r.getCurrentRoom());
			view.mapBox.setIcon(new ImageIcon(r.getFirstRoom()));
			view.txtGuiConsolePrintout.append("\n" + r.roomHelp+ "\n\n");
			view.btnEnter.setVisible(false);
			view.btnNorth.setVisible(false);
			view.btnEast.setVisible(false);
			view.btnSouth.setVisible(false);
			view.btnWest.setVisible(false);
			view.btnFloorUp.setVisible(false);
			view.btnFloorDown.setVisible(false);
			view.btnExitRoom.setVisible(false);
			view.towerPanel.setVisible(false);
			view.btnExamineRoom.setVisible(true);
			view.btnSearchRoom.setVisible(true);
			view.btnExitRoom.setVisible(true);
			view.txtFieldMapTitle.setText((view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", ""));
			break;
			case("ExamineRoomButton" ):
				//
				r.getCurrentRoom(((view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", "")));
			view.txtGuiConsolePrintout.append("\n" +r.roomDescription+ "\n");
			System.out.println(view.mapBox.getIcon());
			view.txtFieldMapTitle.setText(r.roomID);
			if(r.navBooleanArray[0]== true) {
				view.btnNorth.setVisible(true);
			}
			if(r.navBooleanArray[1]== true) {
				view.btnEast.setVisible(true);
			}
			if(r.navBooleanArray[2]== true) {
				view.btnSouth.setVisible(true);
			}
			if(r.navBooleanArray[3]== true) {
				view.btnWest.setVisible(true);
			}
			if(r.navBooleanArray[4]== true) {
				view.btnFloorUp.setVisible(true);
			}
			if(r.navBooleanArray[5]== true) {
				view.btnFloorDown.setVisible(true);
			}
			break;
			case("SearchButton" ):
				//
				a.getItems(((view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", "")));
				view.txtGuiConsolePrintout.append("\n There is  " + a.itemsInRoom.size() +" items in this room. \n");
				for(int i= 0; i < a.itemsInRoom.size();i++) {
					String item = Arrays.toString(a.itemsInRoom.get(i));
					String[] x = item.split("--");			
					view.txtGuiConsolePrintout.append("---------- "+x[3]+" ----------\n");
				}
			break;
			case("ExitRoomButton" ):
				
				view.mapBox.setIcon(new ImageIcon("Maps/"+r.tower+".png"));
				view.btnEnter.setVisible(false);
				view.btnNorth.setVisible(false);
				view.btnEast.setVisible(false);
				view.btnSouth.setVisible(false);
				view.btnWest.setVisible(false);
				view.btnFloorUp.setVisible(false);
				view.btnFloorDown.setVisible(false);
				view.btnExitRoom.setVisible(false);
				view.towerPanel.setVisible(true);
				view.btnExamineRoom.setVisible(false);
				view.btnSearchRoom.setVisible(false);
				view.btnExitRoom.setVisible(false);	
				view.btnEnter.setVisible(true);
			break;
			case("SaveGameButton" ):
				
			break;
			case("LoadGameButton" ):
				
			break;
			case("HelpButton" ):
				
				break;
			case("ExitButton" ):
				
				break;
			case("WaterButton"):
				view.mapBox.setIcon(new ImageIcon("Maps/WaterWing.png"));
			break;
			case("FireButton"):
				view.mapBox.setIcon(new ImageIcon("Maps/FireWing.png")); 
			break;
			case("WoodButton"):
				view.mapBox.setIcon(new ImageIcon("Maps/WoodWing.png"));
			break;
			case("MetalButton"):
				view.mapBox.setIcon(new ImageIcon("Maps/MetalWing.png")); 
			break;
			case("EarthButton"):
				view.mapBox.setIcon(new ImageIcon("Maps/EarthWing.png")); 
			break;
		}
		
	}
	
	public void addView(GameFrame v){
		System.out.println("Controller: adding view");
		this.view = v;
	}
	
	public void addModel(Room myRoomHandler)
	{
		System.out.println("Controller: adding model for Maps");
		this.r = myRoomHandler;
	}
	
	public void addModel(Artifacts myArtifactHandler)
	{
		System.out.println("Controller: adding model for Artifacts");
		this.a = myArtifactHandler;
	}
	
	
}
