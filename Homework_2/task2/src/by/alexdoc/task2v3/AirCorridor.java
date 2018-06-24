package by.alexdoc.task2v3;

class AirCorridor {

	private int number;
	private Airplane airplaneInAir;
	private boolean empty = true;
	
	public AirCorridor(int n){
	
		number = n;
		System.out.println("AirCorridor");
		
	}

	public boolean getEmpty(){
	
		return empty;
	
	}
	
	public void setAirplaneInAir(Airplane a){
	
		airplaneInAir = a;
		empty = false;
	
	}

	public Airplane getAirplaneInAir(){
	
		return airplaneInAir;
	
	}

}