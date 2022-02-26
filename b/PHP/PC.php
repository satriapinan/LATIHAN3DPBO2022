<?php

class PC {
	// Atribut
	private $pObj;
	private $dObj;
	private $rObj;
	private $name;
	private $totalPrice;

	// Konstruktor
	function __construct($name, $pObj, $dObj, $rObj) {
		$this->name = $name;
		$this->pObj = $pObj;
		$this->dObj = $dObj;
		$this->rObj = $rObj;
		$this->totalPrice = $pObj->getPrice() + $dObj->getPrice() + $rObj->getPrice();
	}

	// Setter & Getter
	function setProcessor($pObj) {
		$this->pObj = $pObj;
	}
	function setDisk($dObj) {
		$this->dObj = $dObj;
	}
	function setRAM($rObj) {
		$this->rObj = $rObj;
	}
	function setName($name) {
		$this->name = $name;
	}
	function setTotalPrice($pObj, $dObj, $rObj) {
		$this->$totalPrice = $pObj->getPrice() + $dObj->getPrice() + $rObj->getPrice();
	}

	function getProcessor() {
		return $this->pObj;
	}
	function getDisk() {
		return $this->dObj;
	}
	function getRAM() {
		return $this->rObj;
	}
	function getName() {
		return $this->name;
	}
	function getTotalPrice() {
		return $this->totalPrice;
	}

	// Method
	function displayTotalPrice() {
		echo "<br>Prediksi Harga PC ".$this->name;
		echo 
		"
		<table border='1'>
			<tr>
				<td><b>Total Price(Rp)</b></td>
				<td>".$this->totalPrice."</td>
			</tr>
		</table> 
		";
	}
}

?>