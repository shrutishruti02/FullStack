
public class Account {

	public static void main(String[] args) {
		
		Accounts baAccObj1 = new Accounts(101, "Jack",50000);
		
		System.out.println("-------------");

		CurrentAccount curAccObj2 = new CurrentAccount(102,"Jane",90000,360000);
		
		System.out.println("-------------"); 

		CashCredit ccAccObj3 = new CashCredit(101,"Julie",90000,360000,"Gold");
		
		baAccObj1.printBankAccount();
		System.out.println("-------------");
		curAccObj2.printBankAccount();
		double bal = curAccObj2.getBalance();
		System.out.println("Balance : "+bal);
		
		System.out.println("-------------");
		ccAccObj3.printBankAccount();
		 ccAccObj3.ODLimit();
		System.out.println("--------");

	}

}
class Accounts{
	protected int accountNumber;
	protected String accountName;
	protected double accountBalance;
	
	 Accounts(int acno,String name,double bal) {
		System.out.println("Bank count(int,String,double  ..constructor invoked");
	
		if(acno<0) {
			throw new RuntimeException("Invalid A/c No");
		}
		else
			accountNumber=acno;
		if(name==null) {
			throw new RuntimeException("Account holder name cannot be null");
		}
		else
			accountName=name;
		if(bal<0) {
			throw new RuntimeException("Account Balance cannot be in negative");
		}
		else
			accountBalance=bal;
			
		}
		void printBankAccount() {
			System.out.println("AccountNumber"+accountNumber);
			System.out.println("Account Name"+accountName);
			System.out.println("Account Balance"+accountBalance);
			System.out.println("-----------------------");
	
		}
		double withdraw(double amountToWithdraw) {
			if(amountToWithdraw>accountBalance) {
				
				throw new RuntimeException("Insufficent funds");
			}
			System.out.println("Withdraw in progresss..."+amountToWithdraw);
			accountBalance = accountBalance - amountToWithdraw;
			System.out.println("Withdraw is done...");
			return accountBalance;
		}
		double deposit(double amountToDeposit) {
			if(amountToDeposit > 50000) {
				throw new RuntimeException("Please provide the PAN OR Form60");
			}
			System.out.println("Deposit in progresss..."+amountToDeposit);
			accountBalance = accountBalance + amountToDeposit;
			System.out.println("Deposit is done...");
			return accountBalance;
		}
		
		double getBalance() { 
			return accountBalance;
		}
}

class CurrentAccount extends Accounts
{
	protected double odlimit=100000;
	private double MAB=5000;
	
	CurrentAccount(int x, String y, double z, double r)
	{
		super(x,y,z);
		System.out.println("CurrentAccount(int,String,double,double)...constructor invoked....");
		
		if(r<0) {
			throw new RuntimeException("OD Limit cannot be in negative...terminating..");
		}
		else 
			odlimit=r;
	}
	void printBankAccount()
	{
		super.printBankAccount();
		System.out.println("Available Od Limit"+odlimit);
		System.out.println("---------------");
	}
	double getBalance()
	{
		accountBalance=super.getBalance();
		
		if(accountBalance<MAB)
		{
					
			accountBalance=accountBalance-(accountBalance*0.05);
			System.out.println("Balance fallen below the Min Avg Balance of Rs.5000;Penalty levied");
						
		}
		else
		{
			System.out.println("Min Avg Bal is present");
		}
		return accountBalance;
	}
	double depositAmount(double amountToDeposit)
	{
		accountBalance=super.getBalance();
		if (amountToDeposit>500000)
			throw new RuntimeException("Amount exceeds Rs.500000");
		else
			accountBalance=accountBalance+amountToDeposit;
		return accountBalance;
		
	}
	double amount_to_withdraw=super.withdraw(10000);
}
class CashCredit extends CurrentAccount
{
	protected String collateral;
	private double dp=accountBalance*3;
	CashCredit(int x, String y, double z, double r,String t)
	{
		super(x,y,z,r);
       if(collateral=="null")
    	   throw new RuntimeException("Collateral cant be null..");
       else
    	   collateral=t;
    	   
    		   
	}
	void ODLimit() {
	 accountBalance=super.getBalance();
	 if(accountBalance<dp)
		 System.out.println("DP not available!");
	
	}
	
}
	