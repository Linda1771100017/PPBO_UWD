<?php
	print "===============================<br>";
	print "TUGAS POLIMORPHISM<br>";
	print "===============================<br>";
	class kendaraan{
		
		private $merk;
		private $harga;
		private $negara;
		
		function __construct($merk, $harga, $negara){
			$this->merk=$merk;
			$this->harga=$harga;
			$this->negara=$negara;
		}
		function BacaMerk(){
			return $this->merk;
		}
		function BacaHarga(){
			return $this->harga;
		}
		function BacaNegara(){
			return $this->negara;
		}
		}
		$Motor = new kendaraan("Alphard",2000000000,"Jepang");
		
		echo "Merk Kendaraan	: ".$Motor->BacaMerk()."<br>";
		echo "Harga Motor		: ".$Motor->BacaHarga()."<br>";
		echo "Negara Asal		: ".$Motor->BacaNegara()."<br>";
		echo "===============================<br><br>";
		
		$Motor2 = new kendaraan("Avanza",150000000,"Amerika");
		
		echo "Merk Kendaraan	: ".$Motor2->BacaMerk()."<br>";
		echo "Harga Motor		: ".$Motor2->BacaHarga()."<br>";
		echo "Negara Asal		: ".$Motor2->BacaNegara()."<br>";
		echo "===============================<br><br>";
		
		$Motor3 = new kendaraan("Lamborgini",5000000000,"Belanda");
		
		echo "Merk Kendaraan	: ".$Motor3->BacaMerk()."<br>";
		echo "Harga Motor		: ".$Motor3->BacaHarga()."<br>";
		echo "Negara Asal		: ".$Motor3->BacaNegara()."<br>";
	
		
?>