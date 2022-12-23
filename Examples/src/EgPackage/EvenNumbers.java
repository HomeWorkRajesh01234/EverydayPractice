package EgPackage;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=2;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even Numbers are:- "+i);
			}	
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers");
		int b = sc.nextInt();
		
		for(int i=0;i<=b;i++)
			if (i%2==0)
			{
				System.out.println("Even Numbers  "+i);
			}
		sc.close();
	}
}
