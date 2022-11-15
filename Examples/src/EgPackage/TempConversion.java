package EgPackage;
import java.util.Scanner;
public class TempConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Celcius to Fahrenheit
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Celcius: ");
		int c = sc.nextInt();
		double n = c*1.8+32;
		System.out.println(c +" Celcius = " + n + " Fahrenheit");
		sc.close();

	}

}
