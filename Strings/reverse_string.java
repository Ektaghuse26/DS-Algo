package Strings;

public class reverse_string {

	public static void main(String[] args) {
		
		String sentence = "I love Coffee and Java";
		int len = sentence.length();
		
		//System.out.println("The original string is: ");
		//System.out.println(sentence);
		String[] retained = sentence.split(" ");
		int wordCount = 0;
		
		for(String item : retained)
		{
			System.out.print(item+" ");
			wordCount++;
		}
		System.out.println();
		String[] reversed = new String[wordCount];
		int i = wordCount - 1;
		for(String word : retained) 
		{
			reversed[i] = word;
			
			//System.out.println(i+" "+reversed[i]+" ");
			i--;
		}

		for(String rev:reversed)
			System.out.print(rev+" ");
	}

}
