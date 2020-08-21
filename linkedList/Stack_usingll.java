package linkedList;

public class Stack_usingll {
	
	private Implementation stack = new Implementation();
	
	void push(int val)
	{
		stack.add(val);
	}
	
	int peek() throws Exception
	{
		return stack.getLast();
	}
	
	int pop() throws Exception
	{	
		
		int ele = stack.removeLast();	
		return ele;
	}
	
}
