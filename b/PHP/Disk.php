<?php

class Disk {
	// Atribut
	private $type;
	private $capacity;
	private $price;

	// Konstruktor
	function __construct() {
		$type = "";
		$capacity = 0;
		$price = 0;
	}

	// Setter & Getter
	function setType($type) {
		$this->type = $type;
	}
	function setCapacity($capacity) {
		$this->capacity = $capacity;
	}
	function setPrice($price) {
		$this->price = $price;
	}

	function getType() {
		return $this->type;
	}
	function getCapacity() {
		return $this->capacity;
	}
	function getPrice() {
		return $this->price;
	}

	// Method
	function displayDisk() {
		echo "<br>DISK";
		echo 
		"
		<table border='1'>
			<tr>
				<td><b>Type<b></td>
				<td>".$this->type."</td>
			</tr>
			<tr>
				<td><b>Capacity(GB)</b></td>
				<td>".$this->capacity."</td>
			</tr>
			<tr>
				<td><b>Price(Rp)</b></td>
				<td>".$this->price."</td>
			</tr>
		</table> 
		";
	}
}

?>