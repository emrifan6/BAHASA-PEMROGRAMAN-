class Kotak {
	double panjang; 
	double lebar;
	double tinggi;
}

class Demokotak2 {
	public static void main (String [] args) {
		double volume1;
		double volume2;
		double volume3;
		
		Kotak k1 = new Kotak();
		Kotak k2 = new Kotak();
		Kotak k3 = new Kotak();
				
		k1.panjang = 4;
		k1.lebar = 3;
		k1.tinggi = 2;
		
		k2.panjang = 6;
		k2.lebar = 5;
		k2.tinggi = 4;
		
		k3.panjang = 5;
		k3.lebar = 4;
		k3.tinggi = 3;
		
		
		volume1 = k1.panjang*k1.lebar*k1.tinggi;
		volume2 = k2.panjang*k2.lebar*k2.tinggi;
		volume3 = k3.panjang*k3.lebar*k3.tinggi;
		
		System.out.println("Volume Kotak 1 = " +volume1);
		System.out.println("Volume Kotak 2 = " +volume2);
		System.out.println("Volume Kotak 3 = " +volume3);
	}
}

