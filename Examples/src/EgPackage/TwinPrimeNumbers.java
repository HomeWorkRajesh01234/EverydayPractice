package EgPackage;

public class TwinPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String PrimeNo = "";
		int Prime = 1;
		int j = 0;
		System.out.println("Twins Primes are:");
		for (int i=1;i<100;i++)
		{
			for (j=2;j<i;j++)
			{
				if(i%j ==0)
				{
					break;
				}
			}
			if (i==j)
				PrimeNo+=i+" ";
			if ((i-Prime)==2)
			{
				System.out.println("("+(i-2)+","+i+")");
			}
			Prime = i;
		}
	}
}