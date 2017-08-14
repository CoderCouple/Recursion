package Recursion;

public class AllPossibleCombinationsOf2DigitOnly2_v2 {

	public static void getAllPossibleCombinationsOf2DigitOnly(int array[], int index, String s, int digits) {
		if (index >= array.length) {
			if (digits == 2) {
				System.out.println(s);
				return;
			}

			return;
		}

		if (digits < 2)
			getAllPossibleCombinationsOf2DigitOnly(array, index + 1, s + array[index], digits + 1);

		getAllPossibleCombinationsOf2DigitOnly(array, index + 1, s, digits);

	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };
		getAllPossibleCombinationsOf2DigitOnly(array, 0, "", 0);
	}

}
