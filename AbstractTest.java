
public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guitar g = new Guitar();
		g.utilize();
		g.play();
		g.tuneStrings();
		g.pluck();
		Sitar s=new Sitar();
		s.tuneStrings();
		s.resonate();
	}

}
abstract class Instrument {
	abstract void utilize();
}

abstract class MusicalInstrument extends Instrument
{
	abstract void play();
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings();
}
class Guitar extends StringBasedMusicalInstrument
{

	@Override
	void tuneStrings() {
		System.out.println("Tuning the Guitar strings");
	}

	@Override
	void play() {
		System.out.println("Playing the guitar...");
	}

	@Override
	void utilize() {
		System.out.println("Utilizing the guitar....");
	}
	
	
	void pluck() {
		System.out.println("Plucking the guitar....");
	}
}

class ElectronicGuitar extends Guitar
{
	void cablesReqd() {
		System.out.println("Connecting the cables to the plug");
	}
}
class Violin extends StringBasedMusicalInstrument
{

	@Override
	void tuneStrings() {
		System.out.println("Tuning the Violin strings");
	}

	@Override
	void play() {
		System.out.println("Playing the Violin...");
	}

	@Override
	void utilize() {
		System.out.println("Utilizing the Violin....");
	}
	
	
	void bowing() {
		System.out.println("Bowing the Violin....");
	}
}

class SemiAcousticViolin extends Violin
{
	void amplifies() {
		System.out.println("Amplifies the sound");
	}
}
class Sitar extends StringBasedMusicalInstrument
{

	@Override
	void tuneStrings() {
		System.out.println("Tuning the Sitar strings");
	}

	void play() {
		System.out.println("Playing the Sitar...");
	}

	@Override
	void utilize() {
		System.out.println("Utilizing the Sitar....");
	}
	
    void resonate()
    {
    	System.out.println("Resonating the sitar...");
    }
}



	