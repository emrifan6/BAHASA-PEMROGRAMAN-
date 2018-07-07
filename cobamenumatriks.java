/**
 * @(#)cobamenumatriks.java
 *
 *
 * @rifan 
 * @version 1.00 2018/7/3
 */
import java.util.Scanner;

public class cobamenumatriks{
	
		static Scanner scan = new Scanner(System.in);
		static int barisa = 10;
    	static int koloma = 10;
    	static int barisb = 10;
    	static int kolomb = 10;
    	static int [][] a = new int [barisa][koloma];
    	static int [][] b = new int [barisb][kolomb];
		
    public static void main (String[] args){
    
    	int menu;
    	System.out.println("MENGHITUNG OPERASI MATRIKS");
    	System.out.println("  1. PENJUMLAHAN");
    	System.out.println("  2. PENGURANGAN");
    	System.out.println("  3. PERKALIAN");
        System.out.print("\nMasukkan Pilihan = ");
       
        menu = scan.nextInt();
		     if (menu == 1)
		   penjumlahan();
		else 
			 if (menu == 2)
		   pengurangan();
		else 
			 if (menu == 3)
		   perkalian();	
		else
		    System.out.println(" Pilihan salah");
	}
	static void ordo (){	
		System.out.println();
    	System.out.println("Masukkan Ordo Matriks A");
    	System.out.print("Baris =  ");
    	barisa = scan.nextInt();
    	System.out.print("Kolom =  ");
    	koloma = scan.nextInt();
    	System.out.println("Masukkan Ordo matriks B");
    	System.out.print("Baris =  ");
    	barisb = scan.nextInt();
    	System.out.print("Kolom =  ");
    	kolomb = scan.nextInt();
    }
    	
	static  void matriks(){
		
		System.out.println();
    	System.out.println("Masukkan Nilai Matriks A");
        System.out.println("=======================");
        for(int i=0; i<barisa ;i++) {
            for(int j=0; j<koloma ;j++){
                System.out.print("[" +(i+1)+ "][" +(j+1)+ "]: ");
                a[i][j]=scan.nextInt();
            }
        }
         System.out.print("\n");
           for(int t=0;t<barisa ;t++){
            	for(int y=0;y<koloma ;y++){
           			System.out.print(a[t][y] +" ");
            	}
           System.out.println(" ");
           }
           
        System.out.println();   
      	System.out.println("Masukkan Nilai Matriks B");
        System.out.println("=======================");
        for(int i=0; i<barisb ;i++) {
            for(int j=0; j<kolomb ;j++){
                System.out.print("[" +(i+1)+ "][" +(j+1)+ "]: ");
                b[i][j]=scan.nextInt();
            }
        }
         System.out.print("\n");
           for(int t=0;t<barisb ;t++){
            	for(int y=0;y<kolomb ;y++){
           			System.out.print(b[t][y] +" ");
            	}
           System.out.println(" ");
           }
	}
	
	static  void penjumlahan(){   
		ordo ();	
		System.out.println();
    	boolean hasil = ( barisa == barisb ) && (kolomb == koloma );
    	if ( hasil == true ) {
    		System.out.println("Dapat Dilakukan Penjumlahan ");
    		matriks();
    	
           int [][] c = new int [barisa][koloma];
           for(int i=0;i<barisa;i++) {
            for(int j=0;j<koloma;j++) {
            	c [i][j]= a [i][j] +b [i][j] ;
            }
           }
        	System.out.println("\nHasil Penjumlahan Matriks A dan B");
	        System.out.println("===========================");
	        for(int i=0;i<barisa;i++) {
	            for(int j=0;j<koloma;j++) {
	                System.out.print(c[i][j] +" ");
	            }
	        System.out.println(" ");
	        }
	    }
    	else{
    			System.out.println("Tidak Dapat Dilakukan Penjumlahan ");
    	}
	}
	
	static  void pengurangan(){   
		ordo ();	
			System.out.println();
    	boolean hasil = ( barisa == barisb ) && (kolomb == koloma );
    	if ( hasil == true ) {
    		System.out.println("Dapat Dilakukan Pengurangan ");
    	matriks();
    	 int [][] c = new int [barisa][koloma];
           for(int i=0;i<barisa;i++) {
            for(int j=0;j<koloma;j++) {
            	c [i][j]= a [i][j] - b [i][j] ;
            }
        }
        
        System.out.println("\nHasil Pengurangan Matriks A dan B");
        System.out.println("===========================");
        for(int i=0;i<barisa;i++) {
            for(int j=0;j<koloma;j++) {
                System.out.print(c[i][j] +" ");
            }
        System.out.println(" ");
        }
    	}
    	else{
    			System.out.println("Tidak Dapat Dilakukan Pengurangan ");
    		}
		
    	  	
	}
	static  void perkalian(){   
		ordo ();	
		System.out.println();
    	if (koloma == barisb) {
    		System.out.println("Dapat Dilakukan Perkalian ");
    	
    	matriks();
    	
    	int [][] hasilkl = new int  [barisa][kolomb];
    	for (int i = 0; i < barisa; i++) {
            for (int j = 0; j < kolomb; j++) {
                int x = 0;
                for (int k = 0; k < barisb; k++) {
                    x += a [i][k] * b [k][j];
                }
                hasilkl[i][j] = x;
            }
        }		
         
        System.out.print("\n"); 
        System.out.println("Hasil Perkalian Matriks A dan B");
        System.out.println("=======================");
	        for(int i=0;i<barisa;i++){
	            for(int j=0;j<barisa;j++){
	                System.out.print(hasilkl[i][j] +" ");
	            }
	            System.out.println(" ");
	        }
  	  	}
		else{
    		System.out.println("Tidak Dapat Dilakukan Perkalian ");
    	}
	}
}