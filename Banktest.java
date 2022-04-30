
public class Banktest {
	public static void main(String[] args) {
		BankAccount baObj1 = new BankAccount(101,"Jack",90000);
		BankAccount baObj2 = new BankAccount(102,"Jane",700000);
		BankAccount baObj3 = new BankAccount(103,"Julie",80000);
		baObj1.printBankAccount();
		baObj2.printBankAccount();
		baObj3.printBankAccount();
		 
		
	}
}

//making the data member as private
// and allowing this data via accessible functions

class BankAccount
{
	//DATA MEMBER
	private int accountNumber; //FIELD
	protected String accountHolderName; //FIELD
	protected double accountBalance; //FIELD
	protected String mobno;

	//METHODS - MEMBER FUNCTIONS
	//full mutator
	BankAccount(int x, String y, double z)
	{
		if(x<0) {
			throw new RuntimeException("Account number cannot be in negative...terminating..");
		}
		else
			accountNumber=x;
		
		if(y==null) {
			throw new RuntimeException("Account holder name cannot be null...terminating..");
		}
		else
			accountHolderName=y;
		
		if(z<0) {
			//RuntimeException r = new RuntimeException("some problem.....");
			//throw r;
			throw new RuntimeException("Account Balance cannot be in negative...terminating..");
		}
		else
			accountBalance=z;
	}
	
	
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + ", mobno=" + mobno + "]";
	}


	void printBankAccount() 
	{
		System.out.println("Account Number  : "+accountNumber);
		System.out.println("Account HName   : "+accountHolderName);
		System.out.println("Account Balance : "+accountBalance);
		System.out.println("Mobile Number:"+mobno);
		System.out.println("-----------------------");
	}
	double withdraw(double amountToWithdraw) {
		System.out.println("Withdraw in progresss..."+amountToWithdraw);
		accountBalance = accountBalance - amountToWithdraw;
		System.out.println("Withdraw in done...");
		return accountBalance;
	}
	void setMobileNumber(String mobno)
	{
	this.mobno=mobno;
	System.out.println("-----------------------");
	System.out.println("Setting mobile number"+this.mobno);
	}
	void setName(String accountHolderName)
	{
		this.accountHolderName=accountHolderName;
		System.out.println("-----------------");
		System.out.println("Setting name"+this.accountHolderName);
	}
	double deposit(double amountToDeposit) {
		System.out.println("Deposit in progresss..."+amountToDeposit);
		accountBalance = accountBalance + amountToDeposit;
		System.out.println("Deposit in done...");
		return accountBalance;
	}
}