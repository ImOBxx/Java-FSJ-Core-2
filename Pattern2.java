import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in = new Scanner (System.in);
		System.out.print("Enter Number: ");
		n = in.nextInt();
		for (int i = 1; i <= n; i++)
		{
			int num = 1;
			for (int j = 1; j <= i; j++)
			{
				System.out.print(num + " ");
				num = num + 1;
			}
			System.out.print("\n");
		}

	}

}
