import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner settman = new Scanner(System.in);
		
		int mon, tue;
		float wed;
		double result;
		
		
		System.out.print("Please enter the first number (int):");
		mon = settman.nextInt();
		System.out.print("Please enter the second number (int):");
		tue = settman.nextInt();
		System.out.print("Please enter the third number (float):");
		wed = settman.nextFloat();
		result =  (wed * wed+ mon*mon + tue*tue) / 3.0;
		result = Math.round(result*1000.0)/1000.0;

		System.out.println("Average of ("+ mon+")^2, ("+ tue+")^2, and ("+ wed+")^2 is: " + result + ".");
		
		
		
	}

}
