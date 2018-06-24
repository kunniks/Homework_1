package by.alexdoc.task3v3;

public class LaptopMotherboard implements IProductPart {
	
	private String name = "материнская плата";

	public LaptopMotherboard() {
		System.out.println("Берем со склада деталь: " + name + " ноутбука");
	}
	
}
