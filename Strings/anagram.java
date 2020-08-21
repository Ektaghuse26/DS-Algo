 package Strings;

public class anagram {

	public static void main(String[] args) {

		String a = "1#23";
		String b = "321#";
		
		int[] al = new int[256]; //size independent of length of word
		//int[] bl = new int[256];
		
		//You can also use a single array
		for(char c: a.toCharArray())
		{
			int index = (int)c;
			al[index] ++;
		}
		for(char c: b.toCharArray())
		{
			int index = (int)c;
			al[index] --;
		}
		boolean isAnagram = true;
		for(int i = 0; i < 256; i++)
		{
			if(al[i] == 0)
				continue;
			else
				isAnagram = false;
				break;
		}
		if(isAnagram)
			System.out.println("The two words are anagrams");
		else
			System.out.println("The two words are not anagrams");
	}

}
