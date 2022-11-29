package EgPackage;

import java.util.Scanner;

public class CompareTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First String: ");
		String a = sc.next();
		System.out.println("Enter the Second String: ");
		String b = sc.next();
		boolean result = a.equals(b);
		System.out.println(result);
		sc.close();
	}

}
