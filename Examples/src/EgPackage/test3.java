package EgPackage;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			try
			{
				int a=100, b=2, c;
			}
			catch(ArithmeticException e)
			{
				System.out.println(""+e);
			}
			finally
			{
			System.out.println("i am finlly block");
				
			}
		}
	}

}
