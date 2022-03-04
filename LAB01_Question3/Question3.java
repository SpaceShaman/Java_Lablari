import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result;
		int a, s1, s2, s3;
		double area1, area2, area3;
		double blue, green, red;
		double total;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("The value of a: ");
		a=scan.nextInt();
		System.out.println("Scale ratios of radii: ");
		s1=scan.nextInt();s2=scan.nextInt();s3=scan.nextInt(); 
	
		area1 = (Math.pow(s1*a,2)*3.14);
		area2 = (Math.pow(s2*a,2)*3.14);
		area3 = (Math.pow(s3*a,2)*3.14);
		
		red = area1*3.0/8.0;
		green = (area2-area1)*(3.0/8.0);
		blue = (area3-area2)/2.0;
		
		total = red+ green+ blue;
		
		System.out.println("Area of Circle1 : "+ area1);
		System.out.println("Area of Circle2 : "+ area2);
		System.out.println("Area of Circle3 : "+ area3);
		System.out.println("Area of Blue/Green/Red Regions : " + blue + "/" +green + "/" + red);
		System.out.println("Area of Total Shaded Region : "+total);
		
		 }

}
