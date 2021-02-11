package ExceptionConcept;

public class ThrowsKeyword {

	public static void main(String[] args) {
		ThrowsKeyword obj=new ThrowsKeyword();
		obj.sum();
		System.out.println("Arjit");

	}
	
	public void sum() 
	{
		try {
			div();
		}
		catch(ArithmeticException e) {
			System.out.println("Singh");
		}
	}
	
	public void div() throws ArithmeticException 
	{
		int i=9/0;  
	}
	
	
	
//	public static void main(String[] args) throws ArithmeticException {  //Exception will catch by JVM
//	ThrowsKeyword obj=new ThrowsKeyword();
//	obj.sum();
//
//}


//public void sum() throws ArithmeticException   //Exception will catch by sum()
//{
//	div();
//}
//public void div() throws ArithmeticException   //Exception is thrown to sum()
//{
//	int i=9/0;   //Exception line
//}
}
