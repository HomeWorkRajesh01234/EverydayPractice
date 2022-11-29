package EgPackage;
import java.util.Scanner;
public class CheckTraingle
{
// Error
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum=a+b+c;
			if (sum==180)
			{
				System.out.println("Yes it's a triangle  "+ sum);
			
				if (a==60 && b==60 && c==60)
				{
					System.out.println("Equilateral traingle");
				}
				else if (a==90 || b==90 || c==90)
				{
					System.out.println("Right angle traingle");
				}
				else if (a<90 && b<90 && c<90 )
				{
					System.out.println("Acute angle traingle");
				}
				else if (a==b || b==c || a==c )
				{
					System.out.println("Isosceles traingle");
				}
				else if (a>90 || b>90 || a>90 )
				{
					System.out.println("Obtuse traingle");
				}
			}
			else
				{
				System.out.println("Not a Traingle");
				}
			sc.close();
	}
}
