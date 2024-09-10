import java.util.Scanner;

public class GreatestAmongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Number 1: ");
		a = in.nextInt();
		System.out.println("Enter Number 2: ");
		b = in.nextInt();
		
		if (a > b)
		{
			System.out.println("A Is The Greatest.");
		}
		else
		{
			System.out.println("B Is The Greatest.");
		}
		

	}

}
