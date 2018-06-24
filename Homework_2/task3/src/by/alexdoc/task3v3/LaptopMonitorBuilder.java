package by.alexdoc.task3v3;

public class LaptopMonitorBuilder implements ILineStep {
	
	@Override
	public IProductPart buildProductPart() {
		
		return new LaptopMonitor();
	
	}
	
}
