package Interface_Inheritance;

public interface USABank {
	
	int min_bank2=20000;    								//we can declare the variable which is static by default
	
	//Non-static variable is not allow to declare
	
	final int total_amt=1000;  								//also final var is declared
	
	
	//IT IS NOT COMPULSORY TO WRITE ==> ABSTRACT <== in abstract method
	
	public void account_ID();   							//abstract method
	
	//public abstract void homeLoan();  					// ALSO ABSTRACT METHOD
	
	public void car_loan();   					 			//abstract method
	
	public void homeLoan();    								//abstract method
	
	public void deposit_balanmutualFunds();     			//abstract method
	
	
	//These are 100% or fully abstract method and doesn't contain non abstract method
	
	//only method declaration is done in interface
	//No method body creates here ---> only method prototype
	
	//variable value cant be changed
	// Can not create the object of interface class
	//Interface is abstract in nature
	
	
	//public static void homeLoan();  ------>  //No static method prototype will be declared only non static
}
