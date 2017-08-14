package Recursion;

public class AllPossibleCombinationsOf3DigitOnly {

	public static void getAllPossibleCombinationsOf3DigitOnly(int array[], int index, String s, int digits) {
		if (index >= array.length) {
			if (digits == 3) {
				System.out.println(s);
				return;
			}

			return;
		}
		
		getAllPossibleCombinationsOf3DigitOnly(array, index + 1, s + array[index], digits + 1);
		getAllPossibleCombinationsOf3DigitOnly(array, index + 1, s, digits);

	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };
		getAllPossibleCombinationsOf3DigitOnly(array, 0, "", 0);
	}

}
