package oopsConcept;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj1=new MethodOverloading();
		obj1.sum();
		obj1.sum(10);
		obj1.sum(20,14);
		obj1.sum("Arjit","Singh");
		
	}
	
	//MethodOverloading is called when v declare the method with same name but different parameter in multiple tym .
	//We can also declare the main method in multiple tym with different parameter.
	//Method inside the method is not allowed
	
	public void sum() {
		System.out.println("1st method---with zero parameters");
	}
	
	public void sum(int p) {
		System.out.println("2nd method---with 1 parameters "+p);
	}
	
	public void sum(int p,int q) {
		System.out.println("3st method---with 2 parameters " + (p+q) );
	}
	
	public void sum(String p,String q) {
		System.out.println("4st method---with 2 parameters "+(p+q));
	}

}
