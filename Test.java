
public class Test {

	public static void main(String[] args) {
		Calculator calc= new Calculator();
		calc.fun1();
		calc.fun2(120, 150);
		
		int ans=calc.fun3(350, 370);
		System.out.println(ans);
		System.out.println("-------------------//3");
		
		
		int ans1=calc.fun4();
		System.out.println(ans1);
		System.out.println("-------------------//4");
		
		
		

	}
}
class Calculator
{
	/* 1.function without arguments and without return values*/
	public void fun1()
	{
		int x=100;
		int y=300;
		int z=x+y;
		System.out.println("x is"+x);
		System.out.println("y is"+y);
		System.out.println("z is "+z);
		System.out.println("----------------");
	}
	/*2. function with arguments and without return values*/
	public void fun2(int x,int y)
	{
		
		int z=x+y;
		System.out.println("x is"+x);
		System.out.println("y is"+y);
		System.out.println("z is "+z);
		System.out.println("--------------");
		}
	
	/*3. function with arguments and with return values*/
	public int fun3(int x,int y)
	{
		
		int z=x+y;
		System.out.println("x is"+x);
		System.out.println("y is"+y);
		System.out.println("z is "+z);
		System.out.println("--------------");
		return z;
		
		}
	/*4. function with arguments and with return values*/
	public int fun4()
	{
		int x=10;
		int y=67;
		int z=x+y;
		System.out.println("x is"+x);
		System.out.println("y is"+y);
		System.out.println("z is "+z);
		System.out.println("--------------");
		return z;
		
		}
	
	
}


