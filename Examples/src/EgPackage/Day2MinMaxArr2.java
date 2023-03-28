package EgPackage;

import java.util.Scanner;

public class Day2MinMaxArr2 {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the size of array :");
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("Enter the Array Element in Array :");

			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}

			System.out.println("Array Elements :");

			// Max value
			int max = 0;
			for (int x : arr) {
				System.out.println(x);
				if (x > max) {
					max = x;
				}
			}
			System.out.println("Maximum value :" + max);

			// Min Value
			int min = arr[0];
			for (int i : arr) {
				if (i < min) {
					min = i;
				}
			}
			System.out.println("Minimum Value :" + min);
		}
	}

}

//OutPut
//Enter the size of array :
//6
//Enter the Array Element in Array :
//89
//9
//78
//45
//42
//56
//Array Elements :
//89
//9
//78
//45
//42
//56
//Maximum value :89
//Minimum Value :9