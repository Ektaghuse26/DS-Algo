package Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		//More efficient than Bubble Sort
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of input array : ");
		int arrSize = sc.nextInt();
		int val[] = new int[arrSize];
		for(int i = 0; i < arrSize ; i++)
		{
			val[i] = sc.nextInt();
		}
		int temp = 0;
		//Selection sort
		for(int i = 0; i < arrSize -1; i++)
		{
			int minIndex = i;
			for(int j = i; j < arrSize; j++)
			{
				if(val[j] < val[minIndex])
				{
					minIndex = j;
				}
			}
			temp = val[i];
			val[i] = val[minIndex];
			val[minIndex] = temp;
			
		}
		System.out.println("Sorted array is: ");
		for(int item: val)
			System.out.print(item+" ");
		
		sc.close();
	}

}
