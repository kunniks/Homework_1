package by.alexdoc.task2v3;

abstract class PassTransport {

	String bortNumber;
	String startPoint;
	String endPoint;
	
	public PassTransport(String newBortNum){
	
		bortNumber = newBortNum;
		System.out.println("PassTransport (abstract)");
	
	}
	
	public String getBortNumber(){
		
		return bortNumber;
		
	}
	
	public String getStartPoint(){
		
		return startPoint;
		
	}
	
	public void set(String sp){
	
		startPoint = sp;
	
	}
	
	public String getEndPoint(){
		
		return endPoint;
		
	}
	
	public void setEndPoint(String ep){
	
		endPoint = ep;
	
	}

}