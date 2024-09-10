import java.util.Scanner;

public class InputFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		String name;
		int roll;
		String foi;
		System.out.println("Enter Name: ");
		name = in.next();
		System.out.println("Enter Roll Number: ");
		roll = in.nextInt();
		System.out.println("Enter Field Of Interest: ");
		foi = in.next();
		
		System.out.println(name);
		System.out.println(roll);
		System.out.println(foi);
		
		

	}

}
