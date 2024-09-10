import java.util.Scanner;

public class Initializa2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the number of rows: ");
        int rows = in.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = in.nextInt();

        // Declare the 2D array
        int[][] arr = new int[rows][cols];

        // Populate the array with user inputs
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                arr[i][j] = in.nextInt();
            }
        }
	}

}
