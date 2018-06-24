package by.alexdoc.task3v3;

public class LaptopCaseBuilder implements ILineStep {
	
	@Override
	public IProductPart buildProductPart() {
		
		return new LaptopCase();
	
	}
	
}
