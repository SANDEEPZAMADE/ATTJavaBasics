package polymorphism;

public class Test {
	
	
	public void m1()
	{
		System.out.println("m1 non static method");
	}

	
	public void m1(int i)
	{
		System.out.println("m1  non static method with 1 argument");
	}
	
	
	public static void m1(int i, int j)
	{
		System.out.println("m1 static method with 2 argument");
	}
	
	public  void m1(int i, double j)
	{
		System.out.println("m1 static method with 2 argument");
	}
	
	public static void m1(double j, int k)
	{
		System.out.println("static method with double and int");
	}
	
	
	public static int m1(String s)
	{
		return 50;
		
	}
	
	public static void main(String[] args) {
		
		m1(20, 60);//m1 static method with 2 argument

		int s = m1("abc");
		System.out.println(s);//50
	}
}
