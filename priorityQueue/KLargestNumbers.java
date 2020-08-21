package priorityQueue;
import java.util.*;
import java.io.*;



public class KLargestNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-- != 0)
		{
			int N = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[N];
			for(int i = 0; i < N; i++)
				a[i] = sc.nextInt();
			
			PriorityQueue<Integer> knumbers = new PriorityQueue<Integer>();
			for(int i = 0; i < N; i++)
			{
				if(i < k)
					knumbers.add(a[i]);
				else
				{
					if(knumbers.peek() < a[i]) {
						knumbers.poll();
						knumbers.add(a[i]);
					}
				}
			}
			System.out.println("Sorted order");
			System.out.println(knumbers); //printing in random order
			ArrayList ans = new ArrayList<>(knumbers);
			Collections.sort(ans, Collections.reverseOrder());
			System.out.println("Printing largest first order");
			System.out.println(ans);
			System.out.println(knumbers.comparator());
		}
		sc.close();
	}

}
