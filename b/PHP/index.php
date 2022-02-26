<?php

include "Processor.php";
include "Disk.php";
include "RAM.php";
include "PC.php";

// Tampilan awal
echo "===================================<br>";
echo "| Selamat Datang di Program Prediksi Harga PC |<br>";
echo "===================================<br><br>";

// Processor
$processor = new Processor();	// Instansiasi
$processor->setName("i7");		// Setter
$processor->setPrice(1455000);	// Setter
$processor->displayProcessor(); // Display(output)

// Disk
$disk = new Disk();			// Instansiasi
$disk->setType("SSD");		// Setter
$disk->setCapacity(1000);	// Setter
$disk->setPrice(5000000);	// Setter
$disk->displayDisk();		// Display(output)

// RAM
$ram = new RAM();			// Instansiasi
$ram->setCapacity(16);		// Setter
$ram->setPrice(1429000);	// Setter
$ram->displayRAM();			// Display(output)

// Prediksi Harga PC
$pc = new PC("Satria", $processor, $disk, $ram);	// Instansiasi
$pc->displayTotalPrice();							// Display(output)

?>