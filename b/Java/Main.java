import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// Deklarasi untuk input
		Scanner sc = new Scanner(System.in);

		// Tampilan awal
		System.out.println("===============================================");
		System.out.println("| Selamat Datang di Program Prediksi Harga PC |");
		System.out.println("===============================================\n");
	
		System.out.println("===== Pendataan Hardware =====\n");

		/* PROCESSOR */

		System.out.println(">>>>> PROCESSOR <<<<<\n");

		// Input banyak processor
		int jumlahProcessor = 0;
		System.out.print("Masukan banyak Processor : ");
		try {
			jumlahProcessor = sc.nextInt();
		} catch(Exception e) {}
		System.out.println();
		
		// Inisialisasi batas array Processor
		Processor processor[] = new Processor[jumlahProcessor];

		// Perulangan input data untuk setiap Processor
		String name = ""; int price = 0;
		for(int i = 0; i < jumlahProcessor; i++) {	
			System.out.println("-------------------------");
			System.out.println("Masukan Data Processor " + (i+1) + "|");
			System.out.println("-------------------------");
			processor[i] = new Processor(); // Instansiasi

			System.out.print("Name      : ");
			try {
				name = sc.next();
			} catch(Exception e) {}
			processor[i].setName(name);
			
			System.out.print("Price(Rp) : ");
			try {
				price = sc.nextInt();
			} catch(Exception e) {}
			processor[i].setPrice(price);
		}

		/* DISK */

		System.out.println("\n>>>>> DISK <<<<<\n");

		// Input banyak processor
		int jumlahDisk = 0;
		System.out.print("Masukan banyak Disk : ");
		try {
			jumlahDisk = sc.nextInt();
		} catch(Exception e) {}
		System.out.println();
		
		// Inisialisasi batas array Disk
		Disk disk[] = new Disk[jumlahDisk];

		// Perulangan input data untuk setiap Disk
		String type = ""; int capacity = 0; price = 0;
		for(int i = 0; i < jumlahDisk; i++) {	
			System.out.println("-------------------");
			System.out.println("Masukan Data Disk " + (i+1) + "|");
			System.out.println("-------------------");
			disk[i] = new Disk(); // Instansiasi

			System.out.print("Type         : ");
			try {
				type = sc.next();
			} catch(Exception e) {}
			disk[i].setType(type);
			
			System.out.print("Capacity(GB) : ");
			try {
				capacity = sc.nextInt();
			} catch(Exception e) {}
			disk[i].setCapacity(capacity);

			System.out.print("Price(Rp)    : ");
			try {
				price = sc.nextInt();
			} catch(Exception e) {}
			disk[i].setPrice(price);
		}

		/* RAM */

		System.out.println("\n>>>>> RAM <<<<<\n");

		// Input banyak RAM
		int jumlahRAM = 0;
		System.out.print("Masukan banyak RAM : ");
		try {
			jumlahRAM = sc.nextInt();
		} catch(Exception e) {}
		System.out.println();
		
		// Inisialisasi batas array RAM
		RAM ram[] = new RAM[jumlahRAM];

		// Perulangan input data untuk setiap RAM
		capacity = 0; price = 0;
		for(int i = 0; i < jumlahRAM; i++) {	
			System.out.println("-------------------");
			System.out.println("Masukan Data RAM " + (i+1) + "|");
			System.out.println("-------------------");
			ram[i] = new RAM();	// Instansiasi
			
			System.out.print("Capacity(GB) : ");
			try {
				capacity = sc.nextInt();
			} catch(Exception e) {}
			ram[i].setCapacity(capacity);

			System.out.print("Price(Rp)    : ");
			try {
				price = sc.nextInt();
			} catch(Exception e) {}
			ram[i].setPrice(price);
		}

		/* Input Spesifikasi PC */
		System.out.println("\n===== Input Spesifikasi PC =====\n");
		System.out.print("Nama PC        : ");
		try {
			name = sc.next();
		} catch(Exception e) {}
		
		int i = 0, j = 0, k = 0;
		System.out.print("Kode Processor : ");
		try {
			i = sc.nextInt();
		} catch(Exception e) {}
		System.out.print("Kode Disk      : ");
		try {
			j = sc.nextInt();
		} catch(Exception e) {}
		System.out.print("Kode RAM       : ");
		try {
			k = sc.nextInt();
		} catch(Exception e) {}
		// Instansiasi menggunakan parameter
		PC pc = new PC(name, processor[i-1], disk[j-1], ram[k-1]);

		/* Prediksi Harga PC*/
		pc.printPC();
	}
}