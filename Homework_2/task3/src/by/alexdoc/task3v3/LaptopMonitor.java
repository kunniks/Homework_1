package by.alexdoc.task3v3;

public class LaptopMonitor implements IProductPart {
	private String name = "монитор";
	
	public LaptopMonitor() {
		System.out.println("Берем со склада деталь: " + name + " ноутбука");
	}
	
}
