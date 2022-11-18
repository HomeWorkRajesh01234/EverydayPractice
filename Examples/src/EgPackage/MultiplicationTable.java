package EgPackage;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no for which you want multiplication table");
		int x = sc.nextInt();
		
		for ( int i=1;i<=10;i++)
		{
			int b = x*i;
			System.out.println(x+"*"+i+"="+b);
		}
		sc.close();
	}
}
