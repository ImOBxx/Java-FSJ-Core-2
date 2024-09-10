import java.util.Scanner;

public class GiveANum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
				
				int x;
				System.out.println("Enter Number To Find In The Array: ");
				x = in.nextInt();
				
				for (int i = 0; i < n; i++)
				{
					if (arr[i] == x)
					{
						System.out.println("The Number Is Present In The Array");
						break;
					}
					else
					{
						System.out.println("The Number Is Not Present In The Array");
						break;
					}
				}
				
				
				
				
				

			}

		


	}


