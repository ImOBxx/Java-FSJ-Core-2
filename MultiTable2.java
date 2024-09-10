
public class MultiTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 24;
		int b = 50;
		int c = 29;
		int sum = 1;
		
		
		System.out.println("\n");
		for (int i = 1; i <= 10; i++)
		{
			sum = i * a;
			System.out.println(a + " x " + i + " = " + sum); 
		}
		System.out.println("\n");
		for (int i = 1; i <= 10; i++)
		{
			sum = i * b;
			System.out.println(b + " x " + i + " = " + sum); 
		}
		System.out.println("\n");
		for (int i = 1; i <= 10; i++)
		{
			sum = i * c;
			System.out.println(c + " x " + i + " = " + sum); 
		}

	}

}
