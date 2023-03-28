package EgPackage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the numbers ");
		List<Integer> Sort = new ArrayList<>();
		for (int i=0;i<5;i++)
		{
			int Num = sc.nextInt();
			Sort.add(Num);
		}
		Collections.sort(Sort);
		// print in one line
		System.out.println(Sort);
		//for printing one under one
		for(int i=0;i<Sort.size();i++)
		{
			System.out.println(Sort.get(i));
		}
		//System.out.println(Sort);
		sc.close();
	}

}
 