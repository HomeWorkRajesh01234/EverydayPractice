package EgPackage;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int a = 0;
		a = sc.nextInt();
		if(a%2==0)
		{
			System.out.println(a+" is a even number");
		}
		else 
		{
			System.out.println(a+" is a odd number");
		}sc.close();
	}

}
