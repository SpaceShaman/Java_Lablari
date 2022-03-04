import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner emily = new Scanner(System.in);
		
		int ax, bx, cx, dx, ay, by, cy, dy ;
		double result1, result2, victor ;
		
		System.out.print("Please enter the x coordinate of the first vertex:");
		ax = emily.nextInt();
		System.out.print("Please enter the y coordinate of the first vertex:");
		ay = emily.nextInt();
		System.out.print("Please enter the x coordinate of the second vertex:");
		bx = emily.nextInt();
		System.out.print("Please enter the y coordinate of the second vertex:");
		by = emily.nextInt();
		System.out.print("Please enter the x coordinate of the third vertex:");
		cx = emily.nextInt();
		System.out.print("Please enter the y coordinate of the third vertex:");
		cy = emily.nextInt();
		System.out.print("Please enter the x coordinate of the fourth vertex:");
		dx = emily.nextInt();
		System.out.print("Please enter the y coordinate of the fourth vertex:");
		dy = emily.nextInt();
		
		result1 = ((((ax * by) + (bx * cy) + (cx * ay))-((ay * bx) + (by * cx) + (cy * ax)))/2.0);
		result2 = ((((ax * dy) + (dx * cy) + (cx * ay))-((ay * dx) + (dy * cx) + (cy * ax)))/2.0);
		
		victor = Math.abs(result1) + Math.abs(result2) ;
		System.out.println("The area of Quadrilateral is: " + victor +" units.");
		
				
		
		
	
	}

}
