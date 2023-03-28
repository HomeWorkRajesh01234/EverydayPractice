package EgPackage;

interface Department {
	// does not support constructor
	int dept = 111; // all variables are by default its public static final 
	void InterCallMethod1();
	static void Method2() {
		System.out.println("Static method from interface");
	}
	default void Method3() {
		System.out.println("Default method from interface");
	}
}
interface Employee {
	void Inter2CallMethod1();
	
}
abstract class Products {
	public Products() {
		//it allows constructors
	}
	abstract void AbstClasAbstMethod1();
	//public static final 
	void Method6() {
		System.out.println("Method 6 from abstract class Products");
	}
}
class Customer extends Products implements Department ,Employee {

	@Override
	void AbstClasAbstMethod1() {
		// TODO Auto-generated method stub
		System.out.println("Over rided method from Abstract class Product in that abstract void method");
	}

	@Override
	public void Inter2CallMethod1() {
		// TODO Auto-generated method stub
		System.out.println("Over rided method from interface Employee in that abstract void method");
	}

	@Override
	public void InterCallMethod1() {
		// TODO Auto-generated method stub
		System.out.println("Over rided method from interface Department in that abstract void method");
	}
}
public class InterfaceandAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer aa = new Customer();
		aa.InterCallMethod1();
		Department.Method2();
		aa.Method3();
		
		aa.AbstClasAbstMethod1();
		aa.Method6();
		
		aa.Inter2CallMethod1();
	}
}