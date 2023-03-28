package EgPackage;

import java.util.Scanner;

public class Day2ArrAvg1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the size of array :");
		int size = sc.nextInt();
		int[]arr=new int[size]; 
		System.out.println("Enter the Array Element in Array :");
		
		for(int i=0;i<size;i++) 
		{
			arr[i]=sc.nextInt(); 
		}
		
		int sum=0; 
		float avg=0.0f;
		System.out.println("Array Elements :");
		
		for(int i=0;i<size;i++) 
		{
			System.out.println(arr[i]); 
			sum+=arr[i];
			avg =sum/size;
		}
		System.out.println("Total Of all array Element :"+ sum);
		System.out.println("Average Of array Element :"+avg);
		
	}

}

//OutPut
//Enter the size of array :
//6
//Enter the Array Element in Array :
//34
//54
//26
//89
//74
//85
//Array Elements :
//34
//54
//26
//89
//74
//85
//Total Of all array Element :362
//Average Of array Element :60.0
