package by.alexdoc.task3v3;

public class Laptop implements IProduct {
	
	public Laptop() {
		
		System.out.println("Создана заготовка ноутбука");
	}

	@Override
	public void installFirstPart(IProductPart newIProductPart) {
		
		System.out.println("Установлена первая деталь");
		
	}

	@Override
	public void installSecondPart(IProductPart newIProductPart) {
		
		System.out.println("Установлена вторая деталь");

	}

	@Override
	public void installThirdPart(IProductPart newIProductPart) {
		
		System.out.println("Установлена третья деталь");

	}

}
