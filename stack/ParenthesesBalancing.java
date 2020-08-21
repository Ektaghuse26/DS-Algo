package stack;
import java.io.*;
import java.util.Stack;

public class ParenthesesBalancing {

	public static void main(String[] args) throws IOException {
		
		//taking console input
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		boolean isBalanced = true;
		System.out.println("Insert symbols: ");
		int i = 0;
		String str = bf.readLine();
		Stack <Character> bracketStack = new Stack<Character>();
		while(i != str.length()) {
			char ch = str.charAt(i);
			i++;
			if(ch == '{' || ch == '[' || ch== '(') {
				bracketStack.push(ch);
				continue;
			}
			else
			{
				if(bracketStack.empty())
					System.out.println("Stack empty. Cannot pop from empty stack");
				if(ch == '}')
				{
					if(bracketStack.peek() == '{')
					{
						bracketStack.pop();
					}
					else {
						isBalanced = false;
						break;
					}
				}
				else if(ch == '[')
				{
					if(bracketStack.peek() == ']')
					{
						bracketStack.pop();
					}
					else {
						isBalanced = false;
						break;
					}
				}
				else if(ch == '(')
				{
					if(bracketStack.peek() == ')')
					{
						bracketStack.pop();
					}
					else {
						isBalanced = false;
						break;
					}
				}
				else
					isBalanced = false;
			}
		if(bracketStack.empty() && isBalanced == true)
			System.out.println("The String is balanced.");
		else
			System.out.println("The string is not balanced");
		}
	}

}
