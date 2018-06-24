package by.alexdoc.task3v3;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Запускаем процесс сборки ноутбука");
		start();

	}

	private static void start() {
		
		LaptopMotherboardBuilder newLaptopMotherboardBuilder = new LaptopMotherboardBuilder();
		LaptopCaseBuilder newLaptopCaseBuilder = new LaptopCaseBuilder();
		LaptopMonitorBuilder newLaptopMonitorBuilder = new LaptopMonitorBuilder();

		LaptopBuilder laptopBuilder = new LaptopBuilder(
				newLaptopMotherboardBuilder, 
				newLaptopCaseBuilder, 
				newLaptopMonitorBuilder
				);
		
		IProduct laptop = new Laptop();
		laptopBuilder.assembleProduct(laptop);
		
	}

}
