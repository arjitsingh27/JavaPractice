package Interface_Inheritance;

public class TestBank {

	public static void main(String[] args) {
		
		ICICIBank obj1=new ICICIBank();
		
		obj1.current_balance();
		obj1.saving_balance();
		obj1.deposit_balance();
		obj1.account_ID();
		obj1.car_loan();
		obj1.homeLoan();
		obj1.EducationLoan();
		obj1.selfICICIrule();
		obj1.deposit_balanmutualFunds();
		obj1.GermanFund();
		obj1.credit();
		obj1.debit();
		
		System.out.println(obj1.min_bank1);
		System.out.println(obj1.min_bank2);
		
		

	}

}
