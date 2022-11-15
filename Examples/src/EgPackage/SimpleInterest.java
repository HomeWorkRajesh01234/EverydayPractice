// Finding a Simple Interest by taking a input from the user 
package EgPackage;
import java.util.Scanner;

public class SimpleInterest 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");
		// P=Principal,R=Rate of Interest,Si=Simple Interest,T=Time 
		float P,R,Si;
		 int T;
		 P=sc.nextFloat();
		 R=sc.nextFloat();
		 T=sc.nextInt();
		 //Formula
		 Si=P*R*T/100;
		 System.out.println("Simple Interest is Rs."+ Si);
		 sc.close();
	}
}
