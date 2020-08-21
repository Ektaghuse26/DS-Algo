package priorityQueue;
import java.util.PriorityQueue;

public class MainClass {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		// A comparator can be defined to set the priority of the elements added, otherwise the predefined is taken into consideration
		pq.add("Banana");
		pq.add("Kayle");
		pq.add("Avacado");
		pq.add("Mango");
		pq.add("Pear");
		//Priority Queue does not store its elements in the sorted order.
		System.out.println(pq);
		
		//But it removes these elements in sorted order
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
	
		pq.comparator();
		
		PriorityQueue<Integer> arr = new PriorityQueue<Integer>();
		arr.add(64);
		arr.add(-7);
		arr.add(19657);
		arr.add(867);
		
		System.out.println(arr);
		
		System.out.println(arr.remove());
		System.out.println(arr.remove());
		System.out.println(arr.remove());
		System.out.println(arr.remove());

	}

}
