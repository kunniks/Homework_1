package by.alexdoc.task3v3;

public class LaptopPartBuilder implements ILineStep {
	
	private IProductPart productPart;

	public LaptopPartBuilder(IProductPart newIproductPart) {
		
		System.out.println("Запускаем конвейер и передаем деталь сборщику");
		productPart = newIproductPart;
		
	}
	
	
	@Override
	public IProductPart buildProductPart() {
		
		return productPart;
	
	}
	
}
