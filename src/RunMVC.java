public class RunMVC {
	
	
	public RunMVC() {
		
		
		testFrame001 myView  = new testFrame001();;
		
		
		Controller myController = new Controller();
		
		myController.addView(myView);
		
		myView.addController(myController);
		
		
	} 
	
}