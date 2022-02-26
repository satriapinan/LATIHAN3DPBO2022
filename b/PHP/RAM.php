<?php

class RAM {
	// Atribut
	private $capacity;
	private $price;

	// Konstruktor
	function __construct() {
		$capacity = 0;
		$price = 0;
	}

	// Setter & Getter
	function setCapacity($capacity) {
		$this->capacity = $capacity;
	}
	function setPrice($price) {
		$this->price = $price;
	}

	function getCapacity() {
		return $this->capacity;
	}
	function getPrice() {
		return $this->price;
	}

	// Method
	function displayRAM() {
		echo "<br>RAM";
		echo 
		"
		<table border='1'>
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