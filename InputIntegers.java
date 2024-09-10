import java.util.Scanner;

public class InputIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter A: ");
		a = in.nextInt();
		System.out.println("Enter B: ");
		b = in.nextInt();
		
		int sum = a + b;
		
		int prod = a * b;
		
		System.out.println("Sum: " + sum);
		
		System.out.println("Product: " + prod);
	
	    

	}

}
