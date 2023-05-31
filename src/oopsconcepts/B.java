package oopsconcepts;

public class B extends A {
	
	
	public B()
	{
		System.out.println("zero argument constructor");
	}
	
	
	public static void main(String[] args) {
//		
//		A a = new A();
//		
//		a.m1();
		
		
		B b = new B();
			
		b.m1();
		
		
		System.out.println(b.a);
		
	}

}
