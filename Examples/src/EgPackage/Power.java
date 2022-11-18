package EgPackage;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the x of x^y");
		int a = sc.nextInt();
		
		System.out.println("Enter the y of x^y");
		int b = sc.nextInt();
		
		int r =1;
		for (int i=1;i<=b;i++)
		{
			r*=a;
		}
		System.out.println(r);
		sc.close();
	}
}
