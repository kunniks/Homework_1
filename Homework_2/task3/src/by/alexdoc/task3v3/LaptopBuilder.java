package by.alexdoc.task3v3;

public class LaptopBuilder implements IAssemblyLine {
	
	private IProductPart laptopMotherboard;
	private IProductPart laptopCase;
	private IProductPart laptopMonitor;
	
	public LaptopBuilder(ILineStep mb, ILineStep c, ILineStep m) {
		
		System.out.println("Включаем аппарат по сборке ноутбуков");
		laptopMotherboard = mb.buildProductPart();
		laptopCase = c.buildProductPart();
		laptopMonitor = m.buildProductPart();

	}

	@Override
	public IProduct assembleProduct(IProduct newIProduct) {
		
		newIProduct.installFirstPart(laptopMotherboard);
		newIProduct.installSecondPart(laptopCase);
		newIProduct.installThirdPart(laptopMonitor);
		
		System.out.println("Ноутбук готов");
		return newIProduct;
	
	}

}
