import java.util.Scanner;

public class PercentageGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int per;
		System.out.println("Enter Percentage: ");
		per = in.nextInt();
		if (per >= 60)
		{
			System.out.println("First Division");
		}
		else if (per < 60 && per >= 50)
		{
			System.out.println("Second Division");
		}
		else if (per < 50 && per >= 40)
		{
			System.out.println("Third Division");
		}
		else if (per < 40)
		{
			System.out.println("Fail.");
		}

	}

}
