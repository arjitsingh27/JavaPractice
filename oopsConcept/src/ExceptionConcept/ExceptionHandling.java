package ExceptionConcept;

public class ExceptionHandling {
	int a=10;
	
//	static ExceptionHandling obj;   //It will give a  NullPointerException same as in line 18,19,20
	

	public static void main(String[] args) {
		
		//uncaught exception
//		int i=10/0;
//		System.out.println(i);
		
		//caught exception
//		Thread.sleep(4000);
		
//		ExceptionHandling obj=new ExceptionHandling();
//		obj=null;                   //reference cancellation
//		System.out.println(obj.a);   //NullPointerException
		
		//Type of Handling
		//1.try-catch block
		try 
		{
			int i=9/0;
		}
		catch(Exception e)   //or we write (ArithmeticException e) or (Throwable e)
		{
			e.printStackTrace();   //it will not terminate our code instead it give error but print rest code
//			System.out.println(e.printStackTrace()); //not correct way to write
			System.out.println("****this is error******");
			System.out.println(e.getMessage());  //give the message of mistake we are making
		}
		System.out.println("ABC");


	}

}
