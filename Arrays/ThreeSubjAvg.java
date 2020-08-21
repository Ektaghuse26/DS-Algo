package Arrays;

import java.util.Scanner;

public class ThreeSubjAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Subjects : ");
		int s = sc.nextInt();
		System.out.println("Enter the number of Students : ");
		int stud = sc.nextInt();
		int marks[][] = new int[s][stud];
		
		System.out.println("Enter the marks of Students : ");
		for(int i = 0; i< s; i++)
		{
			System.out.println("Subject["+i+"]: ");
			for(int j = 0; j < stud; j++)
				marks[i][j] = sc.nextInt();
		}
		for(int i = 0; i< s; i++)
		{
			System.out.print("Subject["+i+"]: ");
			for(int j = 0; j < stud; j++)
				System.out.print (marks[i][j]+" ");
			System.out.println();
		}
		
		//calculating average after reading marks
		int average = 0;
		for(int j = 0; j< s; j++)
		{
			for(int k = 0; k < stud ; k++)
				average += marks[j][k]; 
		}
		average = average/s*25;
		System.out.println("The average of the class for all subjects is "+ average);

	}

}
