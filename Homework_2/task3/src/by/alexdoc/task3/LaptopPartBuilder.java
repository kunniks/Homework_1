package by.alexdoc.task3v3;

public class LaptopPartBuilder implements ILineStep {
	
	private IProductPart productPart;

	public LaptopPartBuilder(IProductPart newIproductPart) {
		
		System.out.println("��������� �������� � �������� ������ ��������");
		productPart = newIproductPart;
		
	}
	
	
	@Override
	public IProductPart buildProductPart() {
		
		return productPart;
	
	}
	
}
