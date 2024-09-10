import java.util.Scanner;

public class FtoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double f;
		double c;
		System.out.println("Enter Farenheit: ");
		f = in.nextDouble();
		c = ((f - 32) * 5 )/ 9.0;
		System.out.println("Temperature In Celsius: " + c);
		
		

	}

}
