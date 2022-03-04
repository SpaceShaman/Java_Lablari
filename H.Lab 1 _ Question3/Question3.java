import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner geronimo = new Scanner(System.in) ;
		int number, base ; 
		int binler, yuzler, onlar, birler ;
		int bin, yuz, on, bir ;
		int real ;
		
		System.out.print("Please enter a 4-digit number:");
		number = geronimo.nextInt();
		
		System.out.print("Please enter the base of the number:");
		base = geronimo.nextInt();
		
		binler = ( number / 1000 );
		bin = ( number % 1000 );
		yuzler = ( bin / 100) ;
		yuz = ( bin % 100);
		onlar = ( yuz / 10 );
		on = ( yuz % 10 );
		birler = ( on / 1);
		bir = ( on % 1 );
		
		
		real = ((onlar *( base) + (yuzler * ( base * base) + (binler* (base* base* base)))) + birler) ;
		
		
		System.out.println("The value of " + number + " in base " + base + " is " + real + " in base-10");
		
		
		
		
	}

}
