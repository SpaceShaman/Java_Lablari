import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sinatra = new Scanner(System.in); 
		int sayi[] = new int[5];
		int i=0;
		for (i = 1; i <= 4; i++) 
		{ 
		System.out.print("Please enter the element "+i+": ");
		sayi[i] = sinatra.nextInt();  
		} 
		System.out.println("The squares of the elements:"); 
		for(i = 1; i <= 4; i++) {
		System.out.println((sayi[i]*sayi[i]));
		}
		
	}
	}
