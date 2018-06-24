package by.alexdoc.task2v3;

import java.util.ArrayList;

class Dispatcher {

	private ArrayList<Airplane> airplanes = new ArrayList<Airplane>();
	private ArrayList<AirCorridor> airCorridors = new ArrayList<AirCorridor>();
	private ArrayList<RunwayStrip> runwayStrips = new ArrayList<RunwayStrip>();
	
	public Dispatcher(){
	
		System.out.println("Dispatcher");
		
	}	
	
	public void allowLanding(Airplane a){
		
		//TODO: Дописать метод, разрешающий посадку (создание новых, переиспользование старых)
		if(runwayStrips.isEmpty()){
			RunwayStrip newRunwayStrip = new RunwayStrip(1);
			runwayStrips.add(newRunwayStrip);
			a.setRunwayStrip(newRunwayStrip);
			newRunwayStrip.setAirplaneOnEarth(a);
		}
		
	}
	
	public void allowTakeoff(Airplane a){
		
		//TODO: Дописать метод, разрешающий взлет (создание новых, переиспользование старых)
		if(airCorridors.isEmpty()){
			AirCorridor newAirCorridor = new AirCorridor(1);
			airCorridors.add(newAirCorridor);
			a.setAirCorridor(newAirCorridor);
			newAirCorridor.setAirplaneInAir(a);
		}
		
	}

	public boolean isEmptyAirCorridor(AirCorridor ac){
	
		return ac.getEmpty();
	
	}
	
	public boolean isEmptyRunwayStrip(RunwayStrip rs){
	
		return rs.getEmpty();
	
	}

}