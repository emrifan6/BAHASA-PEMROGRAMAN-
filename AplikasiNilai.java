class nilai {
	private String Nama;
	private int Nilaiakhir;
	
	
	public nilai() {
		Nama = "";
		Nilaiakhir= 0;
	}
	
	public nilai(String Nama, int Nilaiakhir) {
		this.Nama = Nama;
		this.Nilaiakhir = Nilaiakhir;
		
	}
	public String Tampilnama() {
		return Nama;
	}
	
	public int TampilNilaiakhir() {
		return Nilaiakhir;
	}
	
	public char Grade(int x) {
		
		if (x > 85)
			return 'A';
			else if (x >= 70 && x<85)
				return 'B';
				else if (x >= 60 && x<70)
					return 'C';
					else if (x >= 45 && x<60)
						return 'D';
							else 
								return 'E';

	}
}
	
public class AplikasiNilai {
	public static void main (String [] args ) {
	
	nilai Mhs = new nilai("Namaku", 75);
	System.out.println("Nama Mahasiswa : " +Mhs.Tampilnama());
	System.out.println("Nilai : "+Mhs.TampilNilaiakhir());
	System.out.println("Grade : "+Mhs.Grade(Mhs.TampilNilaiakhir()));
		
	}
}

