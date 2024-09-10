import java.util.Scanner;

public class NestIfLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter A: ");
		a = in.nextInt();
		System.out.println("Enter B: ");
		b = in.nextInt();
		System.out.println("Enter C: ");
		c = in.nextInt();
        if (a > b)
        {
        	if (a > c)
        	{
        		System.out.println("A is the Greatest.");

        	}
        	
        }
        else if (b > c)
        {
        	if (b > a)
        	{
        		System.out.println("B is the Greatest.");

        	}
        	
        }
        else if (c > a)
        {
        	if (c > b)
        	{
        		System.out.println("C is The Greatest.");

        	}
        }


	}

}
