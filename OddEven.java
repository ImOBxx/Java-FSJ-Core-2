import java.util.Scanner;

public class OddEven {
	
	void evenodd(int n)
	{
		if (n % 2 == 0)
		{
			System.out.println("Number Is Even.");
		}
		else 
		{
			System.out.println("Number Is Odd.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner (System.in);
		int n;
		OddEven o = new OddEven();
		System.out.println("Enter Number: ");
		n = in.nextInt();
		o.evenodd(n);
		
		
		

	}

}
