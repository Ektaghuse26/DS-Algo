package onlineGoogleChallenge;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArrayQueries {

	public static void main(String[] args) throws IOException
	{	
		Scanner sc = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		
			int arrSize = sc.nextInt();
			System.out.println("arrSize "+arrSize );
			int[] arr = new int[arrSize];
			for(int i = 0; i < arrSize; i++) {
				arr[i] = sc.nextInt();
				System.out.print("arrElements "+arr[i]);
			}
			//sc.nextLine();
			int numQueries = sc.nextInt();
			System.out.println("No.of Queries: "+numQueries);
			//System.out.println("arrSize "+arrSize );
//			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String query[] = new String[3];
			for(int j = 0; j < numQueries; j++) {
				query = reader.readLine().split(" ");
				System.out.println("Your query is: " + query[0]);
				if(query[0].equals("left"))
				{
					System.out.println("Inside left");
					int temp = arr[0];
					for(int i = 0; i < arrSize - 1; i++)
						arr[i] = arr[i + 1];
					arr[arrSize-1] = temp;
					for(int l: arr)
						System.out.print(l+" ");
					System.out.println();
				}
				else if(query[0].equals("right"))
				{
					int temp = arr[arrSize-1];
					for(int i = arrSize - 1; i > 0; i--)
						arr[i] = arr[i - 1];
					arr[0] = temp;
					for(int k: arr)
						System.out.print(k+" ");
					System.out.println();
				}
				
				else if(query[0].equals("Update"))
				{
					int pos = Integer.parseInt(query[1]);
					int val = Integer.parseInt(query[2]);
					
					if(pos >= 0 && pos < arrSize)
						arr[pos] = val;
					System.out.println(arr[pos]);
					System.out.println();
				}
				else if(query[0].equals("Increment"))
				{
					int pos = Integer.parseInt(query[1]);
					if(pos >= 0 && pos < arrSize)
						arr[pos] += 1;
					System.out.println(arr[pos]);
					System.out.println();
				}
				else if(query[0].equals("?"))
				{
					int pos = Integer.parseInt(query[1]);
					System.out.println(arr[pos]);
				}
		}
		sc.close();
//		/str.close();
	}

}
