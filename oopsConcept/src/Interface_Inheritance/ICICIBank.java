package Interface_Inheritance;

public class ICICIBank extends GermanBank implements BrazilBank,USABank{
	
	//public class ICICIBank  implements BrazilBank,USABank extends GermanBank{    <=======  IT is not right way.... above is right to write
	
	//First write  extend for the abstract class then write the implements for the interface class ......
	
	// IF any class implementing the interface ,then its compulsory to define/override all the methods of interface
	
	public void current_balance() 
	{
		System.out.println("****CURRENT BALANCE******");
	}
	
	public void saving_balance() 
	{
		System.out.println("****SAVING BALANCE*****");
	}
	
	public void deposit_balance() 
	{
		System.out.println("****DEPOSIT BALANCE*****");
	}
	
	public void account_ID() 
	{
		System.out.println("*****Account ID*****");
	}
	
	public void car_loan() 
	{
		System.out.println("*****CAR LOAN***");
	}
	
	public void homeLoan() 
	{
		System.out.println("*****HOME LOAN*****");
	}

	public void selfICICIrule() 
	{
		System.out.println("***ICICI BANK SELF RULE****");
	}
	
	public void EducationLoan() 
	{
		System.out.println("***EDUCATION LOAN BY ICICI****");
	}
	
	
	//this method is declared in both the interfaces
	public void deposit_balanmutualFunds() 
	{
		System.out.println("***Common Method****");
	}
	
	
	//German Bank abstract method
	public void GermanFund() 
	{
		System.out.println("***German bank ****");
	}
	
	
}


