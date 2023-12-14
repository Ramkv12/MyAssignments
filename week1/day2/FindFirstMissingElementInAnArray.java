package week1.day2;

public class FindFirstMissingElementInAnArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };

		for (int i = 1; i < arr.length; i++) {

			if (i != arr[i-1]) {

				System.out.println("The missing number of an array is : "+i);
			}

		}

	}

}
