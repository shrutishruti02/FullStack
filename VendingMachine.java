
public class VendingMachine {

	public static void main(String[] args) {
		Machine m =new Machine();
		m.fillUpCans(50,3000);//fills up 10 cans max limit 3000
		m.coinsInserted(1);
		m.selectYourChoice();
		String beverage1=m.vendBeverage(4);
		if(beverage1=="Wrong Selection")
				throw new RuntimeException("Please make proper selection");
		else
			m.makePayment(10);
		
	}

}

class Machine

{
	static int available_no_of_cans ; // FIELD
	
	static private int coins_inside=30; // FIELD
	private String beverage;
	static int maxlimit;

	void selectYourChoice()

	{

		System.out.println("Please select your choice(Any for Rs.5/-)**************");
		System.out.println("1.Green Tea");
		System.out.println("2.Lemon Tea");
		System.out.println("3.Cappuccino");
		System.out.println("4.Espresso");
		System.out.println("5.Exit");

	}

	void fillUpCans(int insertnoofcans, int maxlimit) {
		if ((available_no_of_cans + insertnoofcans) > maxlimit)
			throw new RuntimeException("Cannot insert cans more than the max limit.");
		else
			available_no_of_cans = available_no_of_cans + insertnoofcans;
		System.out.println("Available Cans"+available_no_of_cans);
	}

	void coinsInserted(int no) {
		if (no > coins_inside)
			throw new RuntimeException("Please empty the coins out of the vending machine.max storage capacity exceeded....");
		else
			coins_inside = coins_inside + no;
	}

	String vendBeverage(int selection)
	{
	
		if(selection==1)
			beverage="Green Tea";
		else if(selection==2)
			beverage="Lemon Tea";
		else if(selection==3)
			beverage="Cappucino";
		else if(selection==3)
			beverage="Cappucino";
		else if(selection==4)
			beverage="Espresso";
		else
			beverage="Wrong Selection";
		
		return beverage;
				
	}

	void makePayment(int coinvalue)
	{
		System.out.println("\tYou selected---"+beverage+"\n Make Payment---Coins accepted in (5/10)");
		System.out.println("\nCoin inserted of Amt----"+coinvalue);
		if(coinvalue==5)
		{
			available_no_of_cans--;
			System.out.println("\nYour	"+beverage+"  is ready in a jiffy!!\n");
			System.out.println("\nNo of cans available ---"+available_no_of_cans);
		}
		else if(coinvalue==10)
		{
			available_no_of_cans--;
			coins_inside=coins_inside+1;
			System.out.println("\nBalance amount "+5+"\nYour"+beverage+" is ready in a jiffy!! \n");
			System.out.println("\nNo of cans available ---"+available_no_of_cans);
			
		}
		else 
			throw new RuntimeException(" Please pay in 5/10 coins\n");
		
		
	}
}
