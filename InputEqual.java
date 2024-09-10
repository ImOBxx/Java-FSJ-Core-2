import java.util.Scanner;

public class InputEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int a, b, c;
		System.out.println("Enter 1: ");
		a = in.nextInt();
		System.out.println("Enter 2: ");
		b = in.nextInt();
		System.out.println("Enter 3: ");
		c = in.nextInt();
		
		if (a == b && a == c && b == c)
		{
			System.out.println("Numbers Are Equal.");
		}
		else 
		{
			System.out.println("Numbers Are Not Equal.");
		}
		
		
		

	}

}
