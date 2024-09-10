import java.util.Scanner;

public class PalindromeArrayChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Array Length: ");
		n = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			System.out.println("Enter Array Values: ");
			arr[i] = in.nextInt();
		}
		
		boolean isPali = true;
		for (int i = 0; i < n / 2; i++)
		{
			if (arr[i] != arr[n - 1 - i]) {
				isPali = false;
				break;
			}
		}
		
		if (isPali) {
			System.out.println("The Array Is A Palindrome");
			
		}
		else
		{
			System.out.println("The Array Is A Palindrome");
		}
		

	}

}
