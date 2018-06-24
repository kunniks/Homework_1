package by.alexdoc.task3v3;

public class LaptopCase implements IProductPart {

	private String name = "корпус";

	public LaptopCase() {
		System.out.println("Берем со склада деталь: " + name + " ноутбука");
	}
	
}
