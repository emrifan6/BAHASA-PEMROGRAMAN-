package BelajarOOP;
/*ketentuan Program:
Gaji bersih = gaji pokok + tunjangan istri + tunjangan anak – potongan.
Di mana tunjangan istri diberikan sebesar 10% dari gaji pokok, 
dan tunjangan anak adalah 5% dari tiap anak. 
Sedangkan potongannya adalah 5% dari total gaji pokok dan tunjangan-tunjangan. 
diambil buku "Pemrograman Java" Oleh: Rosihan Ari Yuana, S.Si, M.Kom */


/*membuat kelas gaji untuk tempat penyimpanan dan perhitungan program*/
class gaji {
    // Membuat variabel data-data yang diperlukan
    public String kodekaryawan;
    public String namakaryawan;
    float gajiPokok;
    char statusMenikah;
    int jmlAnak;

/* membuat method return untuk perhitungan tunjangan istri dan menyimpan 
akan menyimpan data dari statusMenikah di variable char s, jika statuMenikah
bernilai karakter 'y' maka perhingan tunjangan istri akan dilakukan,
kalau tidak benilai y maka tunjangan istri akan bernilai 0*/ 
    public float hitungTunjIstri(char s) {
        float tunjIstri = 0;
        if (s == 'y' ) {
        tunjIstri = (float) (0.1*this.gajiPokok);
        }
    return tunjIstri;
    }

/*Menghitung tunjangan anak, jika variable jmlAnak bernilai 0, 
maka tunjangan anak juga 0, maka dari itu tidak perlu dibuatkan if 
seperti pada saat menghitung tunjangan istri*/
    public float hitungTunjAnak(int n) {
        float tunjAnak;
        tunjAnak = (float) (n*0.05*this.gajiPokok);
    return tunjAnak;
    }

// menghitung potongan dengan rumus 5% dari total gaji pokok dan tunjangan-tunjangan.
    public float hitungPotongan() {
        float jmlPotongan;
        jmlPotongan = (float) (0.05 * (this.gajiPokok + this.hitungTunjAnak(this.jmlAnak) + this.hitungTunjIstri(this.statusMenikah)));
    return jmlPotongan;
    } 

// menghitung gaji bersih, dengan rumus "Gaji bersih = gaji pokok + tunjangan istri + tunjangan anak – potongan".
    public float hitungGajiBersih() {
        float gaber;
        gaber = (float) (this.gajiPokok + this.hitungTunjAnak(this.jmlAnak) + this.hitungTunjIstri(this.statusMenikah) - this.hitungPotongan());
    return gaber;
    }

}


// program utama
public class ProjectGaji {
    public static void main (String [] args) {

//inisialisasi nama kelas, untuk memanggil data pada program yang berbeda kelas   
    gaji g1 = new gaji();


    g1.kodekaryawan = "K001";
    g1.namakaryawan = "ROSIHAN ARI";
    g1.statusMenikah = 'y';
    g1.jmlAnak = 3;
    g1.gajiPokok = 2500000;


//memanggil/menampilkan hasil perhitungan
System.out.println("===============================");
System.out.println("KODE KARYAWAN : "+g1.kodekaryawan);
System.out.println("NAMA KARYAWAN : "+g1.namakaryawan);
System.out.println("STATUS MENIKAH : "+g1.statusMenikah);
System.out.format("GAJI POKOK : Rp %10.1f \n", g1.gajiPokok);

System.out.println("===========================================");
System.out.format("TUNJANGAN ISTRI   : Rp %10.1f \n", g1.hitungTunjIstri(g1.statusMenikah));
System.out.format("TUNJANGAN ANAK  : Rp %10.1f \n", g1.hitungTunjAnak (g1.jmlAnak));
System.out.format("POTONGAN             : Rp %10.1f \n", g1.hitungPotongan());

System.out.println("=========================================");
System.out.format("GAJI BERSIH  : Rp %10.1f \n", g1.hitungGajiBersih());
System.out.println("=========================================");
    }
    
}




	


