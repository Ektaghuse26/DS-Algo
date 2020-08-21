package linkedList;
//import java.util.*;

public class Intro_Declaration {

	public static void main(String[] args) {
		
		Implementation ll = new Implementation();
		//List<Integer> al = new ArrayList<>();
		
		ll.add(12);
		ll.add(2);
		ll.add(120);
		ll.add(112);
		ll.add(102);
		
		ll.print();
		System.out.println();
		for(int i = 0; i < 10 ;i++)
			ll.add(i);
		ll.print();
//		al.add(1872);
//		al.add(12);
//		al.add(0);
//		al.add(1);
//		al.add(120);
		
//		getTimeDiff(al);
//		getTimeDiff(ll);

	}
//	static void getTimeDiff(List<Integer> list)
//	{
//		for(int i = 0; i < 100000; i++)
//			list.add(i);
//		long start = System.currentTimeMillis();
//		
//		list.get(43599);
//		long end = System.currentTimeMillis();
//		
//		System.out.println(list.getClass().getName()+"--> "+(end - start));
//	}

}
