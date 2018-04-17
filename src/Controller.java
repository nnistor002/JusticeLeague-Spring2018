
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.ImageIcon;

public class Controller implements ActionListener {
	
	GameFrame view;
	Room r;
	Artifacts a;
	Inventory i;
	Weapons w;
	Player py;
	Puzzle pz;
	
	Controller() {
		System.out.println("Controller()");
	}
	
	public void actionPerformed(ActionEvent e) {
		
		switch (e.getActionCommand()) {
			case ("PickupButton"):
				if (a.itemsInRoom.size() != 0 && !r.roomLooted
				.contains((view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", ""))) {
					r.setroomLooted((view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", ""));
					view.getItems(i.pickUp(a.itemsInRoom));
					view.txtGuiConsolePrintout.append("--Items have been picked up--");
				} else {
					view.txtGuiConsolePrintout.append("\n Sorry there are no items to pick up.\n");
				}
			
			break;
			case ("ItemDetails"):
				view.textAreaItemDetails.setText(i.getDetails(view.itemNAME));
			break;
			case ("DropButton"):
				view.dropItems();
			
			break;
			case ("EquipButton"):
				if (a.itemsEquippable.containsKey(view.itemNAME) && view.equitList.isEmpty()) {
					w.equipIt(view.itemNAME);
					view.equipItem(w.equipped);
				} else {
					view.txtGuiConsolePrintout.append("\n Sorry not an item you can equip. \n");
				}
			
			break;
			case ("UnequipButton"):
				if (view.equitList.isEmpty()) {
					view.txtGuiConsolePrintout.append("\nNo item is equipped.\n");
				} else {
					view.unequipItem();
				}
			
			break;
			case ("UseItemButton"):
				if (a.itemsEquippable.containsKey(view.itemNAME)) {
					view.txtGuiConsolePrintout.append("\nWhoops this item can only be equipped or dropped.\n");
				} else if (view.itemNAME.toString().contains("Key") || view.itemNAME.toString().contains("Gem")) {
					view.txtGuiConsolePrintout.append("\n NO USE FUCNTION ON THIS ITEM.\n");
				} else {
					i.use(view.itemNAME);
					//add in here player gains health with gainHealth() added by Travis
					view.useItem(i.Heal);
				}
			break;
			case ("ExamineMonsterButton"):
				
				break;
			case ("AttackButton"):
				py.dealDamage(py.damage);//added by Travis
			py.takeDamage(25);  //added by Travis
			
			break;
			case ("FleeButton"):
				
				break;
			case ("ExaminePuzzle"):
				pz.examine(((view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", "")));
			view.txtGuiConsolePrintout.append("\n"+pz.toStringQC()+"\n");
			view.btnHint.setVisible(true);
			view.txtPuzzleInput.setVisible(true);
			view.btnQuitPuzzle.setVisible(true);
			view.btnSolvePuzzle.setVisible(true);
			break;
			case ("HintButton"):
				view.txtGuiConsolePrintout.append("\n"+pz.getHint()+"\n");
			break;
			case ("SolvePuzzleButton"):
				view.txtGuiConsolePrintout.append("\n"+pz.getAnswer(view.txtPuzzleInput.getText())+"\n");
				view.txtPuzzleInput.setText("");
				break;
			case ("QuitPuzzleButton"):
				view.btnHint.setVisible(false);
				view.txtPuzzleInput.setVisible(false);
				view.btnQuitPuzzle.setVisible(false);
				view.btnSolvePuzzle.setVisible(false);
				view.txtGuiConsolePrintout.append("\n-- You have quit the puzzle --\n");
			break;
			case ("NorthButton"):
				
				if (r.navBooleanArray[0].equals(true)) {
					view.txtGuiConsolePrintout.append("\n-- You have moved NORTH one room --\n");
					view.mapBox.setIcon(new ImageIcon(r.navRoomArray[0]));
					view.btnNorth.setVisible(false);
					view.btnEast.setVisible(false);
					view.btnSouth.setVisible(false);
					view.btnWest.setVisible(false);
					view.btnFloorUp.setVisible(false);
					view.btnFloorDown.setVisible(false);
					view.btnHint.setVisible(false);
					view.txtPuzzleInput.setVisible(false);
					view.btnQuitPuzzle.setVisible(false);
					view.btnSolvePuzzle.setVisible(false);
					view.btnExaminePuzzle.setVisible(false);
					
				}
			view.txtFieldMapTitle.setText(
					(r.tower + " --  " + view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", ""));
			break;
			case ("EastButton"):
				
				if (r.navBooleanArray[1].equals(true)) {
					view.txtGuiConsolePrintout.append("\n-- You have moved EAST one room --\n");
					view.mapBox.setIcon(new ImageIcon(r.navRoomArray[1]));
					view.btnNorth.setVisible(false);
					view.btnEast.setVisible(false);
					view.btnSouth.setVisible(false);
					view.btnWest.setVisible(false);
					view.btnFloorUp.setVisible(false);
					view.btnFloorDown.setVisible(false);
					view.btnHint.setVisible(false);
					view.txtPuzzleInput.setVisible(false);
					view.btnQuitPuzzle.setVisible(false);
					view.btnSolvePuzzle.setVisible(false);
					view.btnExaminePuzzle.setVisible(false);
				}
			view.txtFieldMapTitle.setText(
					(r.tower + " --  " + view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", ""));
			break;
			case ("SouthButton"):
				
				if (r.navBooleanArray[2].equals(true)) {
					view.txtGuiConsolePrintout.append("\n-- You have moved SOUTH one room --\n");
					view.mapBox.setIcon(new ImageIcon(r.navRoomArray[2]));
					view.btnNorth.setVisible(false);
					view.btnEast.setVisible(false);
					view.btnSouth.setVisible(false);
					view.btnWest.setVisible(false);
					view.btnFloorUp.setVisible(false);
					view.btnFloorDown.setVisible(false);
					view.btnHint.setVisible(false);
					view.txtPuzzleInput.setVisible(false);
					view.btnQuitPuzzle.setVisible(false);
					view.btnSolvePuzzle.setVisible(false);
					view.btnExaminePuzzle.setVisible(false);
				}
			view.txtFieldMapTitle.setText(
					(r.tower + " --  " + view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", ""));
			break;
			case ("WestButton"):
				
				if (r.navBooleanArray[3].equals(true)) {
					view.txtGuiConsolePrintout.append("\n-- You have moved WEST one room --\n");
					view.mapBox.setIcon(new ImageIcon(r.navRoomArray[3]));
					view.btnNorth.setVisible(false);
					view.btnEast.setVisible(false);
					view.btnSouth.setVisible(false);
					view.btnWest.setVisible(false);
					view.btnFloorUp.setVisible(false);
					view.btnFloorDown.setVisible(false);
					view.btnHint.setVisible(false);
					view.txtPuzzleInput.setVisible(false);
					view.btnQuitPuzzle.setVisible(false);
					view.btnSolvePuzzle.setVisible(false);
					view.btnExaminePuzzle.setVisible(false);
				}
			view.txtFieldMapTitle.setText(
					(r.tower + " --  " + view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", ""));
			break;
			case ("FloorUpButton"):
				
				if (r.navBooleanArray[4].equals(true)) {
					view.txtGuiConsolePrintout.append("\n-- You have moved UP one floor --\n");
					view.mapBox.setIcon(new ImageIcon(r.navRoomArray[4]));
					view.btnNorth.setVisible(false);
					view.btnEast.setVisible(false);
					view.btnSouth.setVisible(false);
					view.btnWest.setVisible(false);
					view.btnFloorUp.setVisible(false);
					view.btnFloorDown.setVisible(false);
					view.btnHint.setVisible(false);
					view.txtPuzzleInput.setVisible(false);
					view.btnQuitPuzzle.setVisible(false);
					view.btnSolvePuzzle.setVisible(false);
					view.btnExaminePuzzle.setVisible(false);
				}
			view.txtFieldMapTitle.setText(
					(r.tower + " --  " + view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", ""));
			break;
			case ("FloorDownButton"):
				
				if (r.navBooleanArray[5].equals(true)) {
					view.txtGuiConsolePrintout.append("\n-- You have moved DOWN one floor --\n");
					view.mapBox.setIcon(new ImageIcon(r.navRoomArray[5]));
					view.btnNorth.setVisible(false);
					view.btnEast.setVisible(false);
					view.btnSouth.setVisible(false);
					view.btnWest.setVisible(false);
					view.btnFloorUp.setVisible(false);
					view.btnFloorDown.setVisible(false);
					view.btnHint.setVisible(false);
					view.txtPuzzleInput.setVisible(false);
					view.btnQuitPuzzle.setVisible(false);
					view.btnSolvePuzzle.setVisible(false);
					view.btnExaminePuzzle.setVisible(false);
				}
			view.txtFieldMapTitle.setText(
					(r.tower + " --  " + view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", ""));
			break;
			case ("EnterButton"):
				
				r.getCurrentLocation(view.mapBox.getIcon());
			
			view.mapBox.setIcon(new ImageIcon(r.getFirstRoom()));
			view.txtGuiConsolePrintout.append("\n" + r.roomHelp + "\n\n");
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
			view.txtFieldMapTitle.setText(
					(r.tower + " --  " + view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", ""));
			break;
			case ("ExamineRoomButton"):
				//
				r.getCurrentRoom(((view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", "")));
			view.txtGuiConsolePrintout.append("\n" + r.roomDescription + "\n");
			view.txtFieldMapTitle.setText(r.tower + " --  " + r.roomID);
			if (r.navBooleanArray[0] == true) {
				view.btnNorth.setVisible(true);
			}
			if (r.navBooleanArray[1] == true) {
				view.btnEast.setVisible(true);
			}
			if (r.navBooleanArray[2] == true) {
				view.btnSouth.setVisible(true);
			}
			if (r.navBooleanArray[3] == true) {
				view.btnWest.setVisible(true);
			}
			if (r.navBooleanArray[4] == true) {
				view.btnFloorUp.setVisible(true);
			}
			if (r.navBooleanArray[5] == true) {
				view.btnFloorDown.setVisible(true);
			}
			if(pz.isThereAPuzzle(((view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", ""))) == true){
				pz.getPuzzle(((view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", "")));
				view.txtGuiConsolePrintout.append("\nThere is also a puzzle in this room!\n");
				view.btnExaminePuzzle.setVisible(true);
			}
			break;
			case ("SearchButton"):
				if (r.roomLooted.contains((view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", ""))) {
					view.txtGuiConsolePrintout.append("\n This room has been searched and looted.\n");
				} else {
					a.getItems(((view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", "")));
					view.txtGuiConsolePrintout.append("\n There is  " + a.itemsInRoom.size() + " items in this room. \n");
					for (int i = 0; i < a.itemsInRoom.size(); i++) {
						String item = Arrays.toString(a.itemsInRoom.get(i));
						String[] x = item.split("--");
						view.txtGuiConsolePrintout.append("---------- " + x[3] + " ----------\n");
					}
				}
			break;
			case ("ExitRoomButton"):
				if (view.fillList.contains(r.tower.replace("Wing", "") + " Exit Key")) {
					
					r.currentRoom.clear();
					view.mapBox.setIcon(new ImageIcon("Maps/" + r.tower + ".png"));
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
					view.txtFieldMapTitle
					.setText((view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", ""));
				} else {
					view.txtGuiConsolePrintout.append(
							"\n -------------------|   THE EXIT DOOR IS LOCKED YOU NEED THE TOWER'S EXIT KEY  TO LEAVE |------------------- \n");
				}
			break;
			case ("SaveGameButton"):
				
				break;
			case ("LoadGameButton"):
				
				break;
			case ("HelpButton"):
				pz.getPuzzle("D2");
			pz.examine("D2");
			System.out.println(pz.question);
			System.out.println(pz.choice);
			System.out.println(pz.answer);
			System.out.println(pz.hint);
			case ("ExitButton"):
				
				break;
			case ("WaterButton"):
				view.mapBox.setIcon(new ImageIcon("Maps/WaterWing.png"));
			view.btnEnter.setVisible(true);
			view.txtFieldMapTitle.setText((view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", ""));
			break;
			case ("FireButton"):
				view.mapBox.setIcon(new ImageIcon("Maps/FireWing.png"));
			view.btnEnter.setVisible(true);
			view.txtFieldMapTitle.setText((view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", ""));
			break;
			case ("WoodButton"):
				view.mapBox.setIcon(new ImageIcon("Maps/WoodWing.png"));
			view.btnEnter.setVisible(true);
			view.txtFieldMapTitle.setText((view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", ""));
			break;
			case ("MetalButton"):
				view.mapBox.setIcon(new ImageIcon("Maps/MetalWing.png"));
			view.btnEnter.setVisible(true);
			view.txtFieldMapTitle.setText((view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", ""));
			break;
			case ("EarthButton"):
				view.mapBox.setIcon(new ImageIcon("Maps/EarthWing.png"));
			view.btnEnter.setVisible(true);
			view.txtFieldMapTitle.setText((view.mapBox.getIcon().toString().replace(".png", "")).replace("Maps/", ""));
			break;
		}
		
	}
	
	public void addView(GameFrame v) {
		System.out.println("Controller: adding view");
		this.view = v;
	}
	
	public void addModel(Room myRoomHandler) {
		System.out.println("Controller: adding model for Maps");
		this.r = myRoomHandler;
	}
	
	public void addModel(Artifacts myArtifactHandler) {
		System.out.println("Controller: adding model for Artifacts");
		this.a = myArtifactHandler;
	}
	
	public void addModel(Inventory myInventoryHandler) {
		System.out.println("Controller: adding model for Inventroy");
		this.i = myInventoryHandler;
	}
	
	public void addModel(Weapons myWeaponHandler) {
		System.out.println("Controller: adding model for Weapons");
		this.w = myWeaponHandler;
	}
	
	public void addModel(Puzzle myPuzzleHandler) {
		System.out.println("Controller: adding model for Puzzle");
		this.pz = myPuzzleHandler;
	}
	
	public void addModel(Player playerHandler) {
		System.out.println("Controller: adding model for Player");
		this.py = playerHandler;
	}
	
}
