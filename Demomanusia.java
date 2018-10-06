class manusia {
	String nama;
	String jenkel;
	
	manusia(String param1, String param2) {
		nama = param1;
		jenkel = param2;
		
		
	}
	
	void cetak () {
		System.out.println("Nama : " +nama);
		System.out.println("jenis Kelamin : " +jenkel +"\n");
	}
}

public class Demomanusia {
	public static void main (String args[] ) {
		manusia m1;
		m1=new manusia("Zamzam","Laki-laki");
		m1.cetak();
	}
}