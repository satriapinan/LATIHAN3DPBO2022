from Processor import Processor
from Disk import Disk
from RAM import RAM
from PC import PC

# Tampilan awal
print("===============================================")
print("| Selamat Datang di Program Prediksi Harga PC |")
print("===============================================\n")

print("===== Pendataan Hardware =====\n")

# PROCESSOR

print(">>>>> PROCESSOR <<<<<\n")

# Input banyak processor
jumlahProcessor = int(input("Masukan banyak Processor : "))
print()

# Alokasi dan sekaligus instansiasi untuk banyak Processor
processor = [Processor() for i in range(jumlahProcessor)]

# Perulangan input data untuk setiap Processor
for i in range(jumlahProcessor):
	print("-------------------------")
	print("Masukan Data Processor", i+1, "|")
	print("-------------------------")

	processor[i].setName(input("Name      : "))
	processor[i].setPrice(int(input("Price(Rp) : ")))

# DISK

print("\n>>>>> DISK <<<<<\n")

# Input banyak disk
jumlahDisk = int(input("Masukan banyak Disk : "))
print()

# Alokasi dan sekaligus instansiasi untuk banyak Disk
disk = [Disk() for i in range(jumlahDisk)]

# Perulangan input data untuk setiap Disk
for i in range(jumlahDisk):
	print("--------------------")
	print("Masukan Data Disk", i+1, "|")
	print("--------------------")

	disk[i].setType(input("Type         : "))
	disk[i].setCapacity(int(input("Capacity(GB) : ")))
	disk[i].setPrice(int(input("Price(Rp)    : ")))

# RAM

print("\n>>>>> RAM <<<<<\n")

# Input banyak RAM
jumlahRAM = int(input("Masukan banyak RAM : "))
print()

# Alokasi dan sekaligus instansiasi untuk banyak RAM
ram = [RAM() for i in range(jumlahRAM)]

# Perulangan input data untuk setiap RAM
for i in range(jumlahRAM):
	print("-------------------")
	print("Masukan Data RAM", i+1, "|")
	print("-------------------")

	ram[i].setCapacity(int(input("Capacity(GB) : ")))
	ram[i].setPrice(int(input("Price(Rp)    : ")))

# Input Spesifikasi PC
print("\n===== Input Spesifikasi PC =====\n")
name = input("Nama PC        : ")
i = int(input("Kode Processor : "))
j = int(input("Kode Disk      : "))
k = int(input("Kode RAM       : "))
pc = PC(name, processor[i-1], disk[j-1], ram[k-1])

# Prediksi Harga PC
pc.printPC();