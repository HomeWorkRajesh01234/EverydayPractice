package EgPackage;
import java.util.Scanner;
public class IfElseEg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Pen=10  Book=30
		System.out.println("Enter the cash");
		int cash = sc.nextInt();
		if (cash < 10) {
			System.out.println("Can't buy anything");
			System.out.println("Please get more cash");
		}
		else if (cash >= 10 && cash <= 29)
			System.out.println("You can buy Pen");
		else if (30 <= cash && cash <= 39)
			System.out.println("You can buy Book");
		else  
			System.out.println("You can buy both");
		sc.close();
	}

}
