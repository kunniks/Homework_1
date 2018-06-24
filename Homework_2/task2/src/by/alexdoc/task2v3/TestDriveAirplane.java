package by.alexdoc.task2v3;

class TestDriveAirplane {

	public static void main(String [] args){
	
		start();
	
	}
	
	private static void start(){
		
		Dispatcher dispatcher = new Dispatcher();
		Airplane aBN1245 = new Airplane("BN1245");
		Airplane aBN2847 = new Airplane("BN2847");
		
		aBN1245.requestLanding(dispatcher);
		aBN2847.requestTakeoff(dispatcher);
	
	}

}