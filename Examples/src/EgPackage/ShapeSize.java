package EgPackage;

import java.util.Scanner;

public class ShapeSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the sides");
		int sides = sc.nextInt();
		
		if (sides==3)
		{
			System.out.println("Traingle");
		}
		else if (sides==4)
		{
			System.out.println("Square");
		}
		else if (sides==5)
		{
			System.out.println("Pentagon");
		}
		else if (sides==6)
		{
			System.out.println("Hexagon");
		}
		else if (sides==7)
		{
			System.out.println("Heptagon");
		}
		else if (sides==8)
		{
			System.out.println("Octagon");
		}
		else if (sides==9)
		{
			System.out.println("Nanagon");
		}
		else if (sides==10)
		{
			System.out.println("Decagon");
		}
		else 
		{
			System.out.println("Invalid");
		}
		sc.close();
	}
}
