
interface Animal30
{
	void sound();
	void eat();
}

class Dog51 implements Animal30
{
	
	@Override
	public
	void sound()
	{
		System.out.println("Barks");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eats Pedigree");
	}
}

class Cat implements Animal30
{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Meows");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eats Whiskas");
	}
	
}

public class InterfaceQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog51 d = new Dog51();
		Cat c = new Cat();
		
		d.sound();
		d.eat();
		c.sound();
		c.eat();
		

	}

}
