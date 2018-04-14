public class RunMVC {
	
	
	public RunMVC() {
		
		/*
		 *  In this class all the classes that the system needs to run are started here.
		 */
		
		GameFrame myView  = new GameFrame();;
		Room myRoomHandler = new Room();
		Artifacts myArtifactHandler = new Artifacts();
		Inventory myInventoryHandler = new Inventory();
		Weapons myWeaponHandler = new Weapons();
		
		
		Controller myController = new Controller();
		
		/*
		 * 
		 */
		
		myController.addModel(myRoomHandler);
		myController.addModel(myArtifactHandler);
		myController.addModel(myInventoryHandler);
		myController.addModel(myWeaponHandler);
		myController.addView(myView);
		
		
		myView.addController(myController);
		System.out.println("||===============================================================||");
		
	} 
	
}