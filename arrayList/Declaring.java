package arrayList;
import java.util.ArrayList;

public class Declaring {

	public static void main(String[] args) {
		
		ArrayList fruits = new ArrayList();
		
		fruits.add("Apple");
		fruits.add(23);
		System.out.println(fruits);
		
		//Generics : Defining object class' children
		//Wrapper class Integer
		Pair<String, Integer> p1 = new Pair("Veggies",10);
		Pair<Boolean, Integer> p2 = new Pair(true, 7);
		System.out.println(p1.getClass());
		System.out.println(p2.a);
		
	}

}
