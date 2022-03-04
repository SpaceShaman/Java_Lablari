import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mushu = new Scanner(System.in) ;
		
		int number, base, bir, iki, uc, dort, bsmk3, bsmk2, bsmk1, bsmk4, result;
		
		System.out.print("Please enter a 4-digit number:");
		number = mushu.nextInt();
		System.out.print("Please enter the base of the number:");
		base = mushu.nextInt();
		
		bir = ( number / 1000 );
		bsmk3 = ( number % 1000 );
		iki = ( bsmk3 / 100) ;
		bsmk2 = ( bsmk3 % 100);
		uc = ( bsmk2 / 10 );
		bsmk1 = ( bsmk2 % 10 );
		dort = ( bsmk1 / 1);
		bsmk4 = ( bsmk1 % 1 );
		result =  (int) (((Math.pow(base, 3)) * (bir)) + (( Math.pow(base, 2)) * (iki)) + (( Math.pow(base, 1)) * (uc)) + (dort));
		
		System.out.println("The value of " + number + " in base-" + base + " is " + result + " in base-10." );

	}

}
