package EgPackage;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//First Method
		/*int Average;
		int Maths = 70;
		int Science = 37;
		int Marathi = 86;
		int English = 37;
		Average = (Maths+Science+Marathi+English)/4;
		System.out.println("Average is "+ Average);
		if (Average>=70)
		{
			System.out.println("A Grades");
		}
		else if (Average>=60 && Average<70)
		{
			System.out.println("B Grades");
		}
		else 
		{
			System.out.println("C Grades");
		}*/
		// Second Method Using Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks of Maths: ");
		int a = sc.nextInt();
		System.out.println("Enter the Marks of Science: ");
		int b = sc.nextInt();
		System.out.println("Enter the Marks of Marathi: ");
		int c = sc.nextInt();
		System.out.println("Enter the Marks of English");
		int d = sc.nextInt();
		int Avg=0;
		Avg=(a+b+c+d)/4;
		System.out.println("Average is: "+Avg);
		if (Avg>=70)
		{
			System.out.println("A Grades");
		}
		else if (Avg>=60 && Avg<70)
		{
			System.out.println("B Grades");
		}
		else 
		{
			System.out.println("C Grades");
		}
		sc.close();
	}
}