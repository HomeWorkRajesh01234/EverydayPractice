package EgPackage;
import java.util.Scanner;
public class BulbCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int a = sc.nextInt();
		if(a<=50) {
			System.out.println("Green");
		}
		else if (a>50 &&a<=80)
		{
			System.out.println("Yellow");
		}
		else if (a>80 && a<=100)
		{
			System.out.println("Red");
		}
		else {
			System.out.println("Defuse");
		}
		sc.close();

	}

}
