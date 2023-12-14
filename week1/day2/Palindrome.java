package week1.day2;

public class Palindrome {

	public static void main(String[] args) {

		int num = 565;
		int temp = num;
		int r;
		int sum = 0;

		while (num > 0) {
			r = (num % 10);
			sum = (sum * 10) + r;
			num = (num / 10);
			
			
		}

		if (temp == sum) {
			System.out.println("Palindrome");
			
		}
		
		else {
			System.out.println("Not a palindrome");
		}
		
			
			
		}

	}


