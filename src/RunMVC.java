public class RunMVC {
	
	
	public RunMVC() {
		
		
		GameFrame myView  = new GameFrame();;
		Room myRoomHandler = new Room();
		Artifacts myArtifactHandler = new Artifacts();
		
		Controller myController = new Controller();
		
		myController.addModel(myRoomHandler);
		myController.addModel(myArtifactHandler);
		myController.addView(myView);
		
		
		myView.addController(myController);
		System.out.println("'===============================================================||");
		
	} 
	
}