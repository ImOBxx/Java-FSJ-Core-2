
public class IncreasingPlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 1;
		int t = 0;
		int sum = 0;
		while (c <= 5)
		{
			t = t + 1;
			c = c + 1;
			sum = sum + t;
			if (t == 5)
			{
				System.out.print(t + " = " + sum);
			}
			else 
			{
				System.out.print(t + " + ");
			}
		}

	}

}
