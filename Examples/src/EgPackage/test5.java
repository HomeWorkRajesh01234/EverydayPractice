package EgPackage;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
test5 t=new test5();
t.divide();
System.out.println("hellow");
	}
	void divide()
	{
		try
		{
			int a=100, b=0, c;
			c=a/b;
			System.out.println(c);
			
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}

}
