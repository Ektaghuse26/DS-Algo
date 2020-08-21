package linkedList;

public class Implementation {
	
	Node head;
	boolean isEmpty()
	{
		return head == null;
	}
	int removeLast() throws Exception
	{
		Node temp = head;
		if(temp == null)
			throw new Exception("Empty stack");
		if(head.next == null)
		{
			Node toRemove = head;
			head.next = null;
			return toRemove.data;
		}
		while(temp.next.next != null)
		{
			temp = temp.next;
		}
		Node toRemove = temp.next;
		temp.next = null;
		return toRemove.data;
	}
	
	int getLast() throws Exception
	{
		Node temp = head;
		if(temp == null)
			throw new Exception("Empty stack/ll");
		while(temp.next != null)
		{
			temp = temp.next;
		}
		return temp.data;
	}
	void add(int data)
	{
		Node toAdd = new Node(data);
		
		if(isEmpty())
		{
			head = toAdd;
			return;
		}
		
		if(head == null) {
			head = toAdd;
			return;
		}
		Node temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	
	void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	static class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
}
