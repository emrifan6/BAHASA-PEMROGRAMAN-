/**
 * @(#)uasderetbilangan.java
 *
 *
 * @rifan 
 * @version 1.00 2018/7/28
 */

import java.util.Scanner;

public class uasderetbilangan {

    public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int b, jumlah, terbesar, terkecil;
		float rerata;
		
		terbesar = 0;
        terkecil = 1000;
		
		System.out.print("Masukkan Banyaknya Deret = ");
        b = scan.nextInt();
        int[] deret = new int[b];
        	jumlah = 0;
        	int i;
            for (i = 0; i < b; i++) {
            System.out.print("Masukkan Bilngan Int Deret ke " +(i+1) +" = ");
            deret[i] = scan.nextInt();
            jumlah = jumlah + deret[i];
            if(terbesar < deret[i]) {
                 
                 terbesar = deret[i];
            }
            if(terkecil > deret[i]) {
                 
                 terkecil = deret[i];
            }
            }
            
        rerata = jumlah/b;
        System.out.println("\n");
        System.out.print("Deret Bilangan = ");
        for (i = 0; i < b; i++) {
            System.out.print(deret[i] +" ");
        }
        
        System.out.println("\n"); 
        System.out.println("=====================");
		System.out.println("Jumlah   = " +jumlah);
		System.out.print("Rerata   = " );
		System.out.println(rerata);
		System.out.println("Terbesar = " +terbesar);
		System.out.println("Terkecil = " +terkecil);
		
    }
    
}