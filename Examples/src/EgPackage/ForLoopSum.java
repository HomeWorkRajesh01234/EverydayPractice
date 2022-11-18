package EgPackage;

public class ForLoopSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0,avg;
		for( int i=0;i<50;i++)
		{
			sum+=i;
		}
		avg=sum%50;
		System.out.println("Sum of all numbers upto 50"+sum);
		System.out.println("Average is "+avg);
	}
}
