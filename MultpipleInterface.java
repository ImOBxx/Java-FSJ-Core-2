
interface Swim
{
	void swim();
}

interface Climb
{
	void climb();
}

class Amphibian implements Swim, Climb
{

	@Override
	public void climb() {
		// TODO Auto-generated method stub
		System.out.println("Amphibian cannot climb");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("Amphibian swim");
		
	}
	
}

public class MultpipleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amphibian x = new Amphibian();
		
		x.climb();
		x.swim();

	}

}
