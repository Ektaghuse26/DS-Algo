package Arrays;
import java.util.Scanner;

public class AvergaeMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Students : ");
		int n = sc.nextInt();
		
		int marks[] = new int[n];
		System.out.println("Enter the marks of Students : ");
		for(int i = 0; i<n; i++)
		{
			marks[i] = sc.nextInt();
		}
		//calculating average after reading marks
		int average = 0;
		for(int j = 0; j< n; j++)
		{
			average += marks[j]; 
		}
		average = average/n;
		System.out.println("The average of the class is "+ average);
	}

}
