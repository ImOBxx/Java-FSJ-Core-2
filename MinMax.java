import java.util.Scanner;

public class MinMax {
	
	
	int max(int a, int b, int c)
	{
		if (a > b && a > c)
		{
			return a;
		}
		else if (b > a && b > c)
		{
		    return b;
		}
		else
		{
			return c;
		}
	}
	
	int min(int a, int b, int c)
	{
		if (a < b && a < c)
		{
			return a;
		}
		else if (b < a && b < c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int a, b, c;
		System.out.println("Enter A: ");
		a = in.nextInt();
		System.out.println("Enter B: ");
		b = in.nextInt();
		System.out.println("Enter C: ");
		c = in.nextInt();
		MinMax o = new MinMax();
		System.out.printf("Max: %d\n", o.max(a, b, c));
		System.out.printf("Min: %d\n", o.min(a, b, c));
		

	}

}
