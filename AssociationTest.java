
public class AssociationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BankAccount ba=new BankAccount(101, "JACK",50000);
		ba.printBankAccount();
		
		BankAdmin admin=new BankAdmin();
		admin.changeMobileNumber(ba, "1234567890");
		admin.Deposit(ba, 10000);
		ba.printBankAccount();

	}

}
class BankAdmin //extends BankAccount
{
	void changeMobileNumber(BankAccount ba,String mob)
	{
		ba.setMobileNumber(mob);
	}
	void changeAccountName(BankAccount ba,String name)
	{
		ba.setMobileNumber(name);
	}
	double Deposit(BankAccount ba,double AmountToDeposit)
	{
		ba.accountBalance=ba.deposit(AmountToDeposit);
		return ba.accountBalance;
		
	}
}