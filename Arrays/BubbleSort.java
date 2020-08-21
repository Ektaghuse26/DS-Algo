package Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of input array : ");
		int arrSize = sc.nextInt();
		int val[] = new int[arrSize];
		for(int i = 0; i < arrSize ; i++)
		{
			val[i] = sc.nextInt();
		}
		
		//Bubble sort function
		int temp = 0;
		for(int i = 0; i < arrSize -1 ; i++)
		{
			//1. since the leftmost value after every iteration is the maximum, 
			//we do not need to run the inner loop for all n-1 values, instead 
			//we can reduce these iterations 
			
			//2. When array is already sorted, the bubble sort won't know it, When you have not used swap even once, the array is entirely sorted
			boolean sorted = true;
			for(int j = 0; j < arrSize - 1 - i ; j++)
			{
				if(val[j] > val[j + 1])
				{
					temp = val[j + 1];
					val[j + 1] = val[j];
					val[j] = temp;
					
					sorted = false;
				}
			}
			if(sorted) break;
		}
		System.out.println("The bubble sorting least efficient method output array is: ");
		for(int item: val)
		{
			System.out.print(item+" ");
		}
		
		sc.close();
	}

}
