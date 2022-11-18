package EgPackage;

import java.util.Scanner;

public class Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a = sc.nextInt();
		
		if (a>0 && a<10)
		{
			System.out.println("Single Digit Number");
		}
		else if (a>=10 && a<100)
		{
			System.out.println("Two Digit Number");
		}
		else if (a>=100 && a<1000)
		{
			System.out.println("Three Digit Number");
		}
		else if (a>=1000 && a<10000)
		{
			System.out.println("Four Digit Number");
		}sc.close();
	}
}
