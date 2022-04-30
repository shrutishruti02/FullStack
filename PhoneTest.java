
public class PhoneTest {

	public static void main(String[] args) {
		Phone myPhone=new Phone();
		myPhone.dial();
		byte b=123;
		myPhone.dial(b);
		myPhone.dial("shruti");
		myPhone.dial("Shruti","Priya");
		
		boolean connected=true;
		myPhone.dial(b,"Neha",connected);
		
		
	}

}
class Phone{
	void dial()
	{
		System.out.println("Dialing Nowhere....");
	}
	void dial(byte b) {
		System.out.println("dialing....."+b);
	}
	void dial(String name) {
		System.out.println("dialing....."+name);
	}
	void dial(String name1,String name2) {
		System.out.println("conference call with ....."+name1+"&"+name2);
	}
	void dial(byte b,String name,boolean connected) {
		System.out.println("dialing....."+name+" whose phone number is "+b+" connected--"+connected);
	}
	
}