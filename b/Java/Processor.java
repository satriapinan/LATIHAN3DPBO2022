public class Processor {
	// Atribut
	private String name;
	private int price;

	// Konstruktor
	public Processor() {
		name = "";
		price = 0;
	}

	// Setter & Getter
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}

	// Method
	public void printProcessor() {
		System.out.println("- PROCESSOR -");
		System.out.println("Name        : " + name);
	}
}