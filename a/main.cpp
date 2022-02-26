#include <string>
#include <iostream>

using namespace std;

#include "Processor.cpp"
#include "Disk.cpp"
#include "RAM.cpp"
#include "PC.cpp"

int main() {
	/* Tampilan awal */
	cout << "===============================================" << endl;
	cout << "| Selamat Datang di Program Prediksi Harga PC |" << endl;
	cout << "===============================================\n" << endl;

	cout << "===== Pendataan Hardware =====\n" << endl;

	/* PROCESSOR */
	
	cout << ">>>>> PROCESSOR <<<<<" << endl;

	// Input banyak processor
	int jumlahProcessor = 0;
	cout << "\nMasukan banyak Processor : ";
	cin >> jumlahProcessor;
	cout << endl;

	// Inisialisasi batas array Processor
	Processor processor[jumlahProcessor];

	// Perulangan input data untuk setiap Processor
	string name = ""; int price = 0;
	for (int i = 0; i < jumlahProcessor; i++) {
		cout << "-------------------------" << endl;
		cout << "Masukan Data Processor " << i+1 << "|" << endl;
		cout << "-------------------------" << endl;

		cout << "Name      : ";
		cin >> name;
		processor[i].setName(name);

		cout << "Price(Rp) : ";
		cin >> price;
		processor[i].setPrice(price);
	}

	/* DISK */
	
	cout << "\n>>>>> DISK <<<<<" << endl;

	// Input banyak disk
	int jumlahDisk = 0;
	cout << "\nMasukan banyak Disk : ";
	cin >> jumlahDisk;
	cout << endl;

	// Inisialisasi batas array Disk
	Disk disk[jumlahDisk];

	// Perulangan input data untuk setiap Disk
	string type = ""; int capacity = 0; price = 0;
	for (int i = 0; i < jumlahDisk; i++) {
		cout << "--------------------" << endl;
		cout << "Masukan Data Disk " << i+1 << "|" <<endl;
		cout << "--------------------" << endl;

		cout << "Type         : ";
		cin >> type;
		disk[i].setType(type);

		cout << "Capacity(GB) : ";
		cin >> capacity;
		disk[i].setCapacity(capacity);

		cout << "Price(Rp)    : ";
		cin >> price;
		disk[i].setPrice(price);
	}

	/* RAM */
	
	cout << "\n>>>>> RAM <<<<<" << endl;

	// Input banyak RAM
	int jumlahRAM = 0;
	cout << "\nMasukan banyak RAM : ";
	cin >> jumlahRAM;
	cout << endl;

	// Inisialisasi batas array RAM
	RAM ram[jumlahRAM];

	// Perulangan input data untuk setiap RAM
	capacity = 0; price = 0;
	for (int i = 0; i < jumlahRAM; i++) {
		cout << "-------------------" << endl;
		cout << "Masukan Data RAM " << i+1 << "|" << endl;
		cout << "-------------------" << endl;

		cout << "Capacity(GB) : ";
		cin >> capacity;
		ram[i].setCapacity(capacity);

		cout << "Price(Rp)    : ";
		cin >> price;
		ram[i].setPrice(price);
	}

	/* Input Spesifikasi PC */

	cout << "\n===== Input Spesifikasi PC =====\n" << endl;
	cout << "Nama PC        : ";
	cin >> name;

	int i = 0, j = 0, k = 0;
	cout << "Kode Processor : ";
	cin >> i;
	cout << "Kode Disk      : ";
	cin >> j;
	cout << "Kode RAM       : ";
	cin >> k;
	PC pc(name, processor[i-1], disk[j-1], ram[k-1]);

	/* Prediksi Harga PC */
	pc.printPC();

	return 0;
}