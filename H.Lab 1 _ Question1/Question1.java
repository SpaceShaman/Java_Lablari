import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner underthesea = new Scanner(System.in) ;
		
		int ax, ay, bx, by, cx, cy;
		double mermaid;
		
		System.out.print("Please enter the x coordinate of the first vertex:"); 
		ax = underthesea.nextInt();
		
		System.out.print("Please enter the y coordinate of the first vertex:");
		ay = underthesea.nextInt();
		
		System.out.print("Please enter the x coordinate of the second vertex:");
		bx = underthesea.nextInt();
		
		System.out.print("Please enter the y coordinate of the second vertex:");
		by = underthesea.nextInt() ;
		
		System.out.print("Please enter the x coordinate of the third vertex:");
		cx = underthesea.nextInt();
		
		System.out.print("Please enter the y coordinate of the third vertex:");
		cy = underthesea.nextInt();
		
		mermaid = ((( ax*by + bx*cy + cx*ay ) - ( ay*bx + by*cx + cy*ax )) / 2.0)  ;
		
		System.out.println("Total Area is: " + Math.abs(mermaid)+  " units.");
		
	}

}
