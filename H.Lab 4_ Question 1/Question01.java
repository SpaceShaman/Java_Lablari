import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner giris = new Scanner(System.in); 
		String sayi[] = new String[6]; 
		int toplam, i; toplam = 0; 
		for (i = 1; i <= 5; i++) 
		{ 
		System.out.print("Please enter the element "+i+": ");
		sayi[i] = giris.next();  
		} 
		System.out.println("The elements longer than four:"); 
		for(i = 1; i <= 5; i++) {
		while(sayi[i].length()>4) {
		System.out.println(sayi[i]); 
		break;}
		}
		
	}

}
