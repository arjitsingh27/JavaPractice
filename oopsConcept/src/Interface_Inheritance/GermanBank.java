package Interface_Inheritance;

public abstract class GermanBank {
	
	//Partially abstraction 
	//Hiding the implementation logic ---> is called abstraction
	//Abstract class can have abstract method and non-abstract method
	//Can Not create the object of abstract class
	
	int rate=10;          				//non-static variable
	static int percent=20;  			//static var
	final int price=165;   				//final var
	
	
	public abstract void GermanFund(); //abstract method
	
	//non-abstract method
	
	public void credit() {
		System.out.println("********Bank-credit**********");
	}
	
	public void debit() {
		System.out.println("*******Bank-debit**********");
	}
	

}
