package MethodOveridingPolymorphismInheritance;

public class BMW extends Car {
	
	
	//When same method is declared in parent class as well as child class with same number of argument is called as METHOD_OVERRIDING
	public void start()     // Overridden method
	{
		System.out.println("Start BMW --->Car");
	}
	
	
	public void theftSafety() 
	{
		System.out.println("TheftSafety--->Car");
	}
	

}
