package Recursion;

public class AllPossibleCombinationsOf2DigitOnly {

	public static void getAllPossibleCombinationsOf2DigitOnly(int array[], int index, String s, int digits) {
		if (index >= array.length) {
			if (2==digits) {
				System.out.println(s);
				return;
			}

			return;
		}

		getAllPossibleCombinationsOf2DigitOnly(array, index + 1, s + array[index], digits + 1);
		getAllPossibleCombinationsOf2DigitOnly(array, index + 1, s, digits);

	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };
		getAllPossibleCombinationsOf2DigitOnly(array, 0, "", 0);
	}

}
