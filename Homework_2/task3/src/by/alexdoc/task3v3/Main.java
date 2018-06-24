package by.alexdoc.task3v3;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Запускаем процесс сборки ноутбука");
		start();

	}

	private static void start() {
		
		LaptopBuilder laptopBuilder = new LaptopBuilder();
		IProduct laptop = new Laptop();
		laptopBuilder.assembleProduct(laptop);
		
	}

}
