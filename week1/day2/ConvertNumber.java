package week1.day2;

public class ConvertNumber {

	public static void main(String[] args) {

		int number = -10;

		if (number < 0) {

			// int posnumber = number - number - number;
			int posnumber = number * -1;
			System.out.println("The number " + number + " is converted to " + posnumber);

		}

		else if (number > 0) {

			System.out.println(number + " The given number is positive");

		}

		else {

			System.out.println(number + " The given number is neither positive nor negative");
		}

	}
}
