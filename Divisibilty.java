
public class Divisibilty {

	public static void main(String[] args) {
		
		Compute comp=new Compute();
		comp.fun1();// 1.no arguments does not return values
		comp.fun2(624, 4);//2.takes arguments does not return values
		float ans=comp.fun3(648, 8);//3.takes arguments returns values
		if(ans==0)
			System.out.println("divisble");
		else 
			System.out.println("not divisble");
		System.out.println("-----------------");
		
		float ans1=comp.fun4();//4.no arguments returns values
		if(ans1==0)
			System.out.println("divisble");
		else 
			System.out.println("not divisble");
		
		System.out.println("-----------------------------");
		
		

	}

}
class Compute{
	public void fun1()
	{
		int x=2400;
		int y=16;
		if(x%y==0)
			System.out.println(x+"divisible by"+y);
		else
			System.out.println("not divisble");
		System.out.println("-----------------");
	}
	
	public void fun2(int x,int y)
	{
		if(x%y==0)
			System.out.println(x+"divisible by"+y);
		else
			System.out.println("not divisble");
		System.out.println("-----------------");
	}
	public float fun3(float x,float y)
	{
		float f;
		f=x%y;
		System.out.println("x is+"+x);
		System.out.println("y is+"+y);
		return f;
		
		
	}
	public float fun4()
	{
		float x = 10200;
		float y=18;
		float f;
		f=x%y;
		System.out.println("x is+"+x);
		System.out.println("y is+"+y);
		return f;
		
	}
	
	
}
