package by.alexdoc.task2v3;

class Airplane extends PassTransport {

	private AirCorridor airCorridor;
	private RunwayStrip runwayStrip;
	
	public Airplane(String newBortNum){
		
		super(newBortNum);
		System.out.println("Airplane");
	
	}
	
	public void setAirCorridor(AirCorridor newAirCorridor){
	
		airCorridor = newAirCorridor;
	
	}
	
	public void setRunwayStrip(RunwayStrip newRunwayStrip){
	
		runwayStrip = newRunwayStrip;
	
	}
	
	public void requestLanding(Dispatcher d){
	
		d.allowLanding(this);
	
	}
	
	public void requestTakeoff(Dispatcher d){
	
		d.allowTakeoff(this);	
		
	}

}