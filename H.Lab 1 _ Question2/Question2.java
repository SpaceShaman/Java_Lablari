import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner hakunamatata = new Scanner(System.in) ;
		int timon, pumpaa ;
		float scar ;
		float lionking;
		System.out.print("Please enter the first number (int):");
		timon = hakunamatata.nextInt();

		System.out.print("Please enter the second number (int):");
		pumpaa = hakunamatata.nextInt();
		
		System.out.print("Please enter the third number (float):");
		scar = hakunamatata.nextFloat();

		lionking = ((timon + pumpaa + scar)/ 3) ;
		System.out.print("Average of " + timon + ", " + pumpaa + " and " + scar + " is: " + lionking );
		
		
	}

}
