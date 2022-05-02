//port java.time.LocalDate;
import java.time.LocalDateTime;
//import java.time.LocalTime;
public class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartWatch sw=new SmartWatch();
		sw.showTimeInANewWay();
		
		AnalogWatch aw=new AnalogWatch();
		aw.HHMMSS();
		sw.showsTime();
		
	}

}
 class Watch
{
		final LocalDateTime today=LocalDateTime.now();
	 
	final void showsTime()
	{
		

		System.out.println("\nLocal date and Time..."+today);
	}

}
 final class AnalogWatch extends Watch
 {
	 void HHMMSS()
	 {
		 System.out.println("\n\nThe hour ,minute and hand clock in analog watch shows the time"+today);
	 }
 }
class SmartWatch extends Watch
{
	void showTimeInANewWay()
	{
		//super.showsTime();
		System.out.println("Monitor heart rate also\n");
		System.out.println(today);
		
	}
}