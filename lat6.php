<?php
	print "==========CONTOH SINGLE INHERITANCE==========<br>";
	class Bapak{
		var $nama="Bapak";
		function Bapak($n){
			$this->nama=$n;
		}
		function Hallo(){
		echo "Hallo, saya $this->nama<br>";
		}
	}
	class Anak extends Bapak{
	}
	$test=new Anak("anita putri dari Bapak Joko");
	$test->Hallo();
	$test=new Anak("anfredo anak ke 2 dari Bapak Joko");
	$test->Hallo();
?>