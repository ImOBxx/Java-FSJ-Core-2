import java.util.Scanner;

public class MultiTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int sum = 0;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Number: ");
		n = in.nextInt();
		System.out.println("\n");
		System.out.println("Table Of " + n);
		System.out.println("\n");
	
		for (int i = 1; i <= 10; i++)
		{
			sum = n * i;
			System.out.println(n + " x " + i + " = " + sum);
			
		}
		System.out.println("\n");

	}

}
