package EgPackage;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabets");
		String words = sc.next();
		int vowels = 0;
		for (int i = 0; i < words.length();i++)
		{
			if (words.charAt(i)=='a' || words.charAt(i)=='e' || words.charAt(i)=='i' || words.charAt(i)=='o' ||
					words.charAt(i)=='u') 
				vowels++;
		}
		System.out.println("Vowles: "+ vowels);
		sc.close();
	}
}
