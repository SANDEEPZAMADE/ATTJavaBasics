package polymorphism;

public class Child extends Parent {

	public void m1()
	{
		System.out.println("non static m1 method from Child class ");
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		
		p.m1();//non static m1 method from Parent class
		
		Child c =new Child();
		
		c.m1();//non static m1 method from Child class
		
		
		Parent pp = new Child();// dynamic polymorphism
		
		pp.m1();//non static m1 method from Child class 
		
		pp.m2();//m2 method from PArent class 
		
	}
	
	
	
}
