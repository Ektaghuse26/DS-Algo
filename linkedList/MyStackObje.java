package linkedList;
//import linkedList.Stack_usingll;

public class MyStackObje {

	public static void main(String args[]) throws Exception
	{
		Stack_usingll stack = new Stack_usingll();
		stack.push(10);
		stack.push(15);
		stack.push(145);
		stack.push(0);
		
		int remove = stack.pop();
		System.out.println(remove);
		System.out.println(stack.peek());
	}
}
