package by.alexdoc.task3;

public class LaptopBuilder implements IAssemblyLine {
	
	private IProductPart motherBoard;
	private IProductPart laptopCase;
	private IProductPart laptopMonitor;
	
	public LaptopBuilder() {
		
		System.out.println("�������� ������� �� ������ ���������");
		motherBoard = new LaptopPartBuilder(new LaptopMotherboard()).buildProductPart();
		laptopCase = new LaptopPartBuilder(new LaptopCase()).buildProductPart();
		laptopMonitor = new LaptopPartBuilder(new LaptopMonitor()).buildProductPart();

	}

	@Override
	public IProduct assembleProduct(IProduct newIProduct) {
		
		newIProduct.installFirstPart(motherBoard);
		newIProduct.installSecondPart(laptopCase);
		newIProduct.installThirdPart(laptopMonitor);
		
		System.out.println("������� �����");
		return newIProduct;
	
	}

}
