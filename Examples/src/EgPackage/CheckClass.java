package EgPackage;

import java.util.Scanner;

public class CheckClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int x = sc.nextInt();
		
		if (x%4==1)
		{
			System.out.println("Emberld");
		}
		else if (x%4==2)
		{
			System.out.println("Ruby");
		}
		else if (x%4==3)
		{
			System.out.println("Perl");
		}
		else if (x%4==0)
		{
			System.out.println("Saphire");
		}
		sc.close();
	}
}
