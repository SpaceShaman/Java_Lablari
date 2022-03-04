import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		int result;
		// TODO Auto-generated method stub
		int x, y, z ;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Integer x: ");
	x=scan.nextInt();
		System.out.println("Enter Integer y: ");
		y=scan.nextInt();
		System.out.println("Enter Integer z: ");
		z=scan.nextInt();
		
		result = (int) (Math.pow(x, 3)+Math.pow(x, 3)+Math.pow(x, 3)+Math.pow(y, 2)+Math.pow(y, 2)) ;
		System.out.println("g("+x+","+y+") = "+result);
		
		result = (int) (x + z) ;
		System.out.println("f("+x+","+z+") = "+result);
		
		result = (int)(x + Math.pow(x, 3)+Math.pow(x, 3)+Math.pow(x, 3)+Math.pow(y, 2)+Math.pow(y, 2)) ;
	    System.out.println("f("+x+",g("+x+","+y+")) = "+result);
	}

}
