package Package;

public class ArrayAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {10,20,30,40,50};
		int sum = 0, avg = 0;
		for (int i=0;i<a.length;i++)
		{
			sum+= a[i];
			avg = sum/a.length;
		}
		System.out.println(avg);
	}
}
