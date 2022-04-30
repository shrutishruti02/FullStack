import java.time.LocalDate;
public class TestOverride {

	public static void main(String[] args) {
		Account1 a=new Account1();
		a.withdraw(1000);
		
		SavingsAccount sa=new SavingsAccount();
		sa.withdraw(200);
		
		FixedDepositAccount fd=new FixedDepositAccount();
		fd.withdraw(200);
		
		Account1 ref=new Account1();
		ref.withdraw(100);
		
		ref=new SavingsAccount();
		ref.withdraw(900);
		
		ref=new FixedDepositAccount();
		ref.withdraw(200);
		
		System.out.println(ref instanceof Account1);
		System.out.println(ref instanceof SavingsAccount);
		System.out.println(ref instanceof FixedDepositAccount);
		
		

	}

}
abstract class Withdrawing // partial class - 
{
	abstract void withdraw(float amt); //declared - not defined 
}
class Recurring extends Withdrawing
{
	void withdraw(float x) {
		
	}
}
class Account1 extends Withdrawing { //isA
	float balance=5000;
	void withdraw(float y) { //1. inherited
		System.out.println("Account:withdraw()");
		balance=balance-y;
	}
}
class SavingsAccount extends Account1 {
	
	void calculateSimpleInterest() {//2. exclusive
		
	}
	void withdraw(float a) {//3. overriding
		System.out.println("SavingsAccount:withdraw()");
		if(balance < a) {
			throw new RuntimeException("funds insufficient...");
		}
		balance=balance-a;
	}
}
class FixedDepositAccount extends SavingsAccount {
	int tenureYear=2022;  //2025
	void withdraw(float a) {
		int currentYear = LocalDate.now().getYear();
		if(tenureYear != currentYear) {
			throw new RuntimeException("Account not matured...cannot withdrwa....");
		}
		System.out.println("FixedDepositAccount:withdraw()");
		balance=balance-a;
	}
	void withdrawing(float a) { }
}