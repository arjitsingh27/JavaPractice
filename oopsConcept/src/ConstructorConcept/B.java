package ConstructorConcept;

public class B extends A {
	
	public B() 
	{
//		super(20);
		super(10,20);   // we can write 1 tym only super ..bcz its preference is high so one after another super is not allow
		
		System.out.println("Child class const with zero param....");
		
	}
	
	public B(int x) 
	{
		super(10);  		
		System.out.println("Child class const with 1 param.... "+ x);
		
	}
	
	public static void main(String args[]) {
		
		B obj=new B();
		B obj1=new B(11);
		
	}

	
}
