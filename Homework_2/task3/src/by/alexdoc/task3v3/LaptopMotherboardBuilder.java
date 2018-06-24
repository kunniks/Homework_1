package by.alexdoc.task3v3;

public class LaptopMotherboardBuilder implements ILineStep {
	
	@Override
	public IProductPart buildProductPart() {
		
		return new LaptopMotherboard();
	
	}
	
}
