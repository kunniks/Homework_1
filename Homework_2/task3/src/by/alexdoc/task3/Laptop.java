package by.alexdoc.task3;

public class Laptop implements IProduct {
	
	public Laptop() {
		
		System.out.println("������� ��������� ��������");
	}

	@Override
	public void installFirstPart(IProductPart newIProductPart) {
		
		System.out.println("����������� ������ ������");
		
	}

	@Override
	public void installSecondPart(IProductPart newIProductPart) {
		
		System.out.println("����������� ������ ������");

	}

	@Override
	public void installThirdPart(IProductPart newIProductPart) {
		
		System.out.println("����������� ������ ������");

	}

}
