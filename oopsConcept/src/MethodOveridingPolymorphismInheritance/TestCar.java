package MethodOveridingPolymorphismInheritance;

public class TestCar {

	public static void main(String[] args) {
		
		//Static-Polymorphism ---or ---compile-time polymorphism
		
		BMW obj1=new BMW();
		obj1.start();
		obj1.theftSafety();
		obj1.fuel();
		obj1.stop();
		obj1.model();        //method inherit from its grandparent class
		
		System.out.println("*************");
		
		Car c1=new Car();
		c1.start();
		c1.stop();
		c1.fuel();
		c1.model();          //method inherit from its Parent class
		
		System.out.println("*************");
		
		
		
		//Below is also called TOP CASTING
		Car c2=new BMW();  //Child class object is referred by parent class reference variable is called -- Dynamic polymorphism --or-- Run-time polymorphism.
		// only parent class method will be accessed NOT child class method bcz refernce var is from parents side.
		c2.start();
		c2.stop();
		c2.fuel();
		
		
		//Down casting
		//BMW b1=new Car();  								not allow
		//BMW b1=(BMW)new Car();  						//now its allow but give error of ------>>   ClassCastException   <<--------
		

	}

}
