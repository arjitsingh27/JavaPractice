package FinalConcept;

public class FinallyConcept {

	public static void main(String[] args) {
		test1();
		test2();
		division();

	}
	

	public static void test1() 
	{
		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("test the code");
		}
		catch(Exception e){
			System.out.println("inside catch block");
		}
		finally {
			System.out.println("inside finally block");
		}
	}

	public static void test2() 
	{
		try {
			System.out.println("inside test2");
		}
		finally {
			System.out.println("Finally code excute here");
		}
	}
	
	public static void division() 
	{
		int i=10;
		
		try {
			System.out.println("inside try block");
			int k=i/0;
		}
		catch(NullPointerException e){       //use ArithemeticException to print catch statements
			System.out.println("inside Arithmetic block");
			System.out.println("divide by zero error");
		}
		finally {
			System.out.println("Execute this code after any exception");
		}
	}
	
	
	
}
