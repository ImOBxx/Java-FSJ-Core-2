import java.util.Scanner;

public class InputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Length Of The Array: ");
		n = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			System.out.println("Enter Array Values: ");
			arr[i] = in.nextInt();
		}
		for (int i = 0; i < n; i++)
		{
			System.out.println("Element At Position " + i + " : " + arr[i]);
		}
		
		
		

	}

}
