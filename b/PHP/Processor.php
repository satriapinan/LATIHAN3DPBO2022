<?php

class Processor {
	// Atribut
	private $name;
	private $price;

	// Konstruktor
	function __construct() {
		$name = "";
		$price = 0;
	}

	// Setter & Getter
	function setName($name) {
		$this->name = $name;
	}
	function setPrice($price) {
		$this->price = $price;
	}

	function getName() {
		return $this->name;
	}
	function getPrice() {
		return $this->price;
	}

	// Method
	function displayProcessor() {
		echo "PROCESSOR";
		echo 
		"
		<table border='1'>
			<tr>
				<td><b>Name</b></td>
				<td>".$this->name."</td>
			</tr>
			<tr>
				<td><b>Price</b></td>
				<td>".$this->price."</td>
			</tr>
		</table> 
		";
	}
}

?>