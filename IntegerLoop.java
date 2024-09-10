import java.util.Scanner;

public class IntegerLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int sum = 0;
		int avg = 0;
		Scanner in = new Scanner (System.in);
		for (int i = 1; i <= 10; i++)
		{
			System.out.print("Enter Number " + i + ": ");
			n = in.nextInt();
			sum = sum + n;
			
		}
		avg = (int) (sum / 10.0);
		System.out.println("Average: " + avg);
		
		

	}

}
