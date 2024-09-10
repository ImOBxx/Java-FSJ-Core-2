
class Parent
{
	//private
	
	void par()
	{
		System.out.println("This Is Parent Class");
	}
}
	
class Child extends Parent
	{
		void chill()
		{
			System.out.println("This Is Child Class");
		}
	}
	
public class ParentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent a = new Parent();
		Child b = new Child();
		a.par();
		b.chill();
		b.par();
		

	}

}
