package EgPackage;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Forst Method
		/*int a = 50;
		int b = 40;
		int c = 45;
		if (a>b && a>c)
		{
			System.out.println("A is Greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is Greater");
		}
		else
		{
			System.out.println("C is Greater");
		}*/
		// Second Method Using Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int aa = sc.nextInt();
		System.out.println("Enter the First Number");
		int bb= sc.nextInt();
		System.out.println("Enter the First Number");
		int cc = sc.nextInt();
		if (aa>bb && aa>cc)
		{
			System.out.println("First Number is Greater "+aa);
		}
		else if(bb>aa && bb>cc)
		{
			System.out.println("Second Number is Greater "+bb);
		}
		else
		{
			System.out.println("Third Number is Greater "+cc);
		}
		sc.close();
	}
}
