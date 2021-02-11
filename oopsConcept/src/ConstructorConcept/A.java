package ConstructorConcept;

public class A {
	
	public A() 
	{
		System.out.println("Parents class const....");
	}
	
	public A(int x) 
	{
		System.out.println(x);
	}
	
	public A(int x,int y) 
	{
		System.out.println(x+" "+y);
	}
}
