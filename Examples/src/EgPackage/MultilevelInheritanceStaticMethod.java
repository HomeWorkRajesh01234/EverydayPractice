package EgPackage;

class ParentClass
{
	int a=1;
	void Method3()
	{
		System.out.println("Here is Method 1");
	}
}

class SubChildClass1 extends ParentClass
{
	int a=2;
	 void Method4()
	{
		System.out.println("Here is Method 2");
	}
}

class SubChildClass2 extends SubChildClass1
{
	int a=3;
	void Method5()
	{
		System.out.println("Here is Method 3");
	}
}

class ChildClass extends SubChildClass2
{
	int a=4;
	void Method6()
	{
		System.out.println("Here is Method 4");
		System.out.println(this.a);
		System.out.println(super.a);
		super.Method3();

	}
}
public class MultilevelInheritanceStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass ss = new ChildClass();
		ss.Method3();
		ss.Method4();
		ss.Method5();
		ss.Method6();
		MultilevelInheritanceStaticMethod sa =new MultilevelInheritanceStaticMethod();
		get();
		sa.gett();
		
	}
	public static void get()
	{
		System.out.println("12345677900");
	}
	
	public void gett()
	{
		System.out.println("ABCD");
	}
	
	
}
