
public class Ecosystem {
	public static void main(String[] args){
		
		FoodWeb fw = new FoodWeb();
		
		
		Decomposers dec=fw.releaseEnergy();
		dec.energyreleased();
	
		
	}
}
class FoodWeb
{
	    Decomposers releaseEnergy() 
	    {
	   FoodChain fc=new FoodChain();
	   Producers pr=fc.usesSunlight();
	   Consumers cr=pr.usesFood();
	   Decomposers dr=cr.decomposeFood();
	   return dr;
	    }
}

class Ecoworld{}
class FoodChain extends Ecoworld
{
	Producers usesSunlight()
	{
		Producers p=new Producers();
		return p;
	}
}
class Producers//xtends FoodChain
{
	Consumers usesFood()
	{
		Consumers c=new Consumers();
		return c;
	}
	
}
class Consumers //tends Producers
{
	Decomposers decomposeFood()
	{
		Decomposers d=new Decomposers();
		return d;
	}
	
}
class Decomposers //tends Consumers
{
	void energyreleased() {
		System.out.println("Ecosystem-->Food Chain--> Producers-->Consumers-->Decomposers--EnergyReleased");
	}
}
