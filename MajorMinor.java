import java.util.Scanner;

public class MajorMinor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Age: ");
		age = in.nextInt();
		if (age < 18)
		{
			System.out.println("Minor");
		}
		else
		{
			System.out.println("Major");
		}
		

	}

}
