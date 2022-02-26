public class PC {
	// Atribut
	private Processor pObj;
	private Disk dObj;
	private RAM rObj;
	private String name;
	private int totalPrice;

	// Konstruktor
	public PC(String name, Processor pObj, Disk dObj, RAM rObj) {
		this.name = name;
		this.pObj = pObj;
		this.dObj = dObj;
		this.rObj = rObj;
		this.totalPrice = pObj.getPrice() + dObj.getPrice() + rObj.getPrice();
	}

	// Setter & Getter
	public void setName(String name) {
		this.name = name;
	}
	public void setProcessor(Processor pObj) {
		this.pObj = pObj;
	}
	public void setDisk(Disk dObj) {
		this.dObj = dObj;
	}
	public void setRAM(RAM rObj) {
		this.rObj = rObj;
	}
	public void setTotalPrice(Processor pObj, Disk dObj, RAM rObj) {
		this.totalPrice = pObj.getPrice() + dObj.getPrice() + rObj.getPrice();
	}

	public String getName() {
		return name;
	}
	public Processor getProcessor() {
		return pObj;
	}
	public Disk getDisk() {
		return dObj;
	}
	public RAM getRAM() {
		return rObj;
	}
	public int getTotalPrice() {
		return totalPrice;
	}

	// Method
	public void printPC() {
		System.out.println("\n===== Prediksi Harga PC " + name + " =====\n");
		pObj.printProcessor();
		dObj.printDisk();
		rObj.printRAM();
		System.out.println("-------------------------");
		System.out.println("Total Price : " + totalPrice);
	}
}