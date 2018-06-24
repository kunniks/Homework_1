package by.alexdoc.task2v3;

class RunwayStrip {

	private int number;
	private Airplane airplaneOnEarth;
	private boolean empty = true;

	public RunwayStrip(int n){
	
		number = n;
		System.out.println("RunwayStrip");
		
	}	

	public boolean getEmpty(){
	
		return empty;
	
	}
	
	public void setAirplaneOnEarth(Airplane a){
	
		airplaneOnEarth = a;
		empty = false;
	
	}

	public Airplane getAirplaneOnEarth(){
	
		return airplaneOnEarth;
	
	}

}