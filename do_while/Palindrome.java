package do_while;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		//First find the revere of this number, then check if original number is identical to reverse number
		Scanner sc = new Scanner(System.in);
		int originalNum = sc.nextInt();
		int numOfDigits = (int)Math.log10(originalNum) + 1;
		int temp = originalNum;
		int rev = 0;
		//reversing the digits
		System.out.println("No. of digits: "+numOfDigits);
		while(temp > 0)
		{
			int unitDigit = temp % 10;
			System.out.println("unit digit: "+unitDigit+" ");
			//rev += unitDigit*Math.pow(10, numOfDigits-1);
			rev = rev*10 + unitDigit;
			System.out.println("Reverse: "+rev+" ");
			temp = temp/10;
			//numOfDigits = numOfDigits-1;
			System.out.println("Temp var "+temp+" ");
		}
		System.out.println("The reverse of the number is "+ rev);
		
		if(originalNum == rev)
			System.out.println("The number is a palindrome");
		else
			System.out.println("The number is not a palindrome");
				
	}

}
