package ExceptionConcept;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		
		System.out.println("ABC");
		
		try {
			throw new Exception("ARJIT Exception");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Singh");
		}
		
//		throw new Exception ("Arjit Exception");   //not good way 
		
		System.out.println("PQR");
			
		

	}

}
