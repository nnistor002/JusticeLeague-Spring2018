public class RunMVC {
	
	
	public RunMVC() {
		
		
		GameFrame myView  = new GameFrame();;
		
		
		Controller myController = new Controller();
		
		myController.addView(myView);
		
		myView.addController(myController);
		
		
	} 
	
}