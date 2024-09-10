
interface Flying
{
	void fly();
}

class Bird implements Flying
{
	@Override
	public
	void fly()
	{
		System.out.println("Birds Wings GLide");
	}
}

class Airplane implements Flying
{
	@Override
	public
	void fly()
	{
		System.out.println("Aiplane Wings Rudd");
	}
}


public class Flyy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird x = new Bird();
		Airplane y = new Airplane();
		
		x.fly();
		y.fly();

	}

}
