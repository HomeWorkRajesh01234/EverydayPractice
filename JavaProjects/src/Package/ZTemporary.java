package Package;

import java.util.Scanner;

public class ZTemporary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		
		int revers = 0 ,reminder;
		while (num<0);
		{
			reminder= num%10;
			revers = revers *10 + reminder;
			num = num/10;
		}
		System.out.println("Revers number="+revers);
		sc.close();
	}
}
