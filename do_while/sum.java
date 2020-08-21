package do_while;
import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sumOf = sc.nextInt();
		int temp = sumOf;
		int sum = 0;
//		while(i != sumOf+1)
//		{
//			sum += i;
//			i++;
//		}
		//Sum of digits of a number
		while(temp > 0)
		{
			int lastDigit = temp%10;
			sum += lastDigit;
			temp = temp/10;
			System.out.println(lastDigit+ " "+ temp + " "+ sum);
		}
		System.out.println("The sum of all the digits in input number is: "+sum);
		int numOfDigits = (int)Math.log10(sumOf) + 1;
		System.out.println("Number of digits in "+sumOf + " is: "+numOfDigits);
	}
}
