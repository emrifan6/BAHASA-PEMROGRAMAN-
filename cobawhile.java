/**
 * @(#)cobawhile.java
 *
 *
 * @rifan
 * @version 1.00 2018/7/9
 */


public class cobawhile {

    public static void main (String[] args){
    	int a = 1;
    	int j = 1;
    	int baris = 5;
    	int counter = 1;
    	
    	System.out.println(" PROGRAM PERULANGAN WHILE\n\n");
    	while (counter <= baris) {
    		j=1;
    		while ( j <= counter){
    			System.out.print(j+" ");
    			j++;
    		}
    		counter++;
    		System.out.println();
    	}
    	a = baris-1;
    	while (a >= 1 ) {
    		j=1;
    		while ( j <= a) {
    			System.out.print(j+" ");
    			j++;
    		}
    		a--;
    		System.out.println();
    	}
    }
    
    
}