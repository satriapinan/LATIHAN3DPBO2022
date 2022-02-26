public class Disk {
	// Atribut
	private String type;
	private int capacity;
	private int price;

	// Konstruktor
	public Disk() {
		type = "";
		capacity = 0;
		price = 0;
	}

	// Setter & Getter
	public void setType(String type) {
		this.type = type;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}
	public int getCapacity() {
		return capacity;
	}
	public int getPrice() {
		return price;
	}

	// Method 
	public void printDisk() {
		System.out.println("- DISK -");
		System.out.println("Type        : " + type);
		System.out.println("Capacity    : " + capacity + " GB");
	}
}