public class RAM {
	// Atribut
	private int capacity;
	private int price;

	// Konstruktor
	public RAM() {
		capacity = 0;
		price = 0;
	}

	// Setter & Getter
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public int getCapacity() {
		return capacity;
	}
	public int getPrice() {
		return price;
	}

	// Method 
	public void printRAM() {
		System.out.println("- RAM -");
		System.out.println("Capacity    : " + capacity + " GB");
	}
}