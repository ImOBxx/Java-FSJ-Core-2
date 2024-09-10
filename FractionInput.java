import java.util.Scanner;

public class FractionInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter A: ");
		a = in.nextInt();
		System.out.println("Enter B: ");
		b = in.nextInt();
		
		System.out.println("Fraction Input: " + a + " \\ " + b);
		
		int sum = a / 2;
		int sum2 = b / 2;
		
		System.out.println("Fraction Input: " + sum + " \\ " + sum2);
		
		
		
		
		

	}

}
