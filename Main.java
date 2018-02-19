//Program which calculates the area of a circle given its radius

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the radius ... ");
		double radius = scan.nextDouble();
		
		System.out.println("The area of the circle is: "+Math.PI*radius*radius);
		System.out.println("Half the area of the circle is: "+(Math.PI*radius*radius)/2);
		
		
	}

}

