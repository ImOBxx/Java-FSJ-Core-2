import java.util.Scanner;

public class GreatestOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter A: ");
		a = in.nextInt();
		System.out.println("Enter B: ");
		b = in.nextInt();
		System.out.println("Enter C: ");
		c = in.nextInt();
		if (a > b && a > c)
		{
			System.out.println("A Is The Greatest.");
		}
		else if (b > a && b > c)
		{
			System.out.println("B Is The Greaest.");
		}
		else
		{
			System.out.println("C Is The Greatest.");
		}
		

	}

}
