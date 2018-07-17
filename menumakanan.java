import java.util.*;
import java.lang.Math;

public class menumakanan {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] namamakanan = new String[10];
        int menu;
        int[] qty = new int[10];
        int[] harga = new int[10];
        int i;
        int j;
        int totalharga;
        
        totalharga = 0;
        i = 0;
        j = 0;
        System.out.println("*  Daftar Menu Makanan  *");
        System.out.println("=========================================");
        System.out.println("No Nama                          Harga");
        System.out.println("1. Nasi Goreng Biasa             Rp 10000,00");
        System.out.println("2. Nasi Goreng Seafood           Rp 15000,00");
        System.out.println("3. Nasi Goreng Istimewa          Rp 20000,00");
        System.out.println("0. Keluar");
        do {
            i = i + 1;
            System.out.println();
            System.out.println("=======================");
            System.out.print("Masukkan Pilihan Menu      = ");
            menu = input.nextInt();
            if (menu == 1) {
                namamakanan[i] = "NASI GORENG BIASA \t";
                System.out.print("Masukkan Banyaknya Pesanan = ");
                qty[i] = input.nextInt();
                harga[i] = 10000;
                totalharga = totalharga + harga[i] * qty[i];
                System.out.println(namamakanan[i]+"\t"+qty[i]);
            } else {
                if (menu == 2) {
                    namamakanan[i] = "NASI GORENG SEAFOOD ";
                    System.out.print("Masukkan Banyaknya Pesanan = ");
                    qty[i] = input.nextInt();
                    harga[i] = 15000;
                    totalharga = totalharga + harga[i] * qty[i];
                    System.out.println(namamakanan[i]+"\t"+qty[i]);
                } else {
                    if (menu == 3) {
                        namamakanan[i] = "NASI GORENG ISTIMEWA ";
                        System.out.print("Masukkan Banyaknya Pesanan = ");
                        qty[i] = input.nextInt();
                        harga[i] = 20000;
                        totalharga = totalharga + harga[i] * qty[i];
                        System.out.println(namamakanan[i]+"\t"+qty[i]);
                    }
                }
            }
        } while (menu > 0);
        System.out.println();
        for (j = 1; j <= i - 1; j++) {
            System.out.println();
            System.out.print(namamakanan[j]+"\t");
            System.out.print(qty[j]+"\t");
            System.out.print(harga[j] * qty[j]);
        }
        System.out.println();
        System.out.println("=======================");
        System.out.print("Total harga = ");
        System.out.println(totalharga);
    }
}
