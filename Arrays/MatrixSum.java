package Arrays;

import java.util.Scanner;

public class MatrixSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns : ");
		int cols = sc.nextInt();
		int mat[][] = new int[rows][cols];
		
		System.out.println("Enter the marks of Students : ");
		for(int i = 0; i< rows; i++)
		{
			System.out.println("Row["+i+"]: ");
			for(int j = 0; j < cols; j++)
				mat[i][j] = sc.nextInt();
		}
		for(int i = 0; i< rows; i++)
		{
			System.out.print("Row["+i+"]: ");
			for(int j = 0; j < cols; j++)
				System.out.print (mat[i][j]+" ");
			System.out.println();
		}
		
		//calculating average after reading marks
		int sum = 0;
		for(int j = 0; j < rows; j++)
		{
			for(int k = 0; k < cols ; k++)
				sum += mat[j][k]; 
		}
		System.out.println("The determinant of the matrix is: "+sum);

	}

}
