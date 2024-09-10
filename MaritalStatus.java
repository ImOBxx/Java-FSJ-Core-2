import java.util.Scanner;

public class MaritalStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		String ms;
		int age;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Age: ");
		age = in.nextInt();
		System.out.println("Enter Sex (M / F) : ");
		s = in.next();
		System.out.println("Enter Marital Status (Y / N) : ");
		ms = in.next();
		
		if (s.equals("f"))
		{
			System.out.println("The Female Employee Will Only Work In Urban Areas");
		}
		else if (s.equals("m") && age <= 40 && age >= 20)
		{
			System.out.println("The Male Employee Will Work Anywhere");
		}
		else if (s.equals("m") && age <= 60 && age > 40)
		{
			System.out.println("The Male Employee Will Work Only In Urban Areas");
		}
		else if (age > 60)
		{
			System.out.println("Incorrect Age Input.");
		}
		

	}

}
