package Recursion;

public class AllPossibleCombinationsOf_2and3_DigitOnly_v2 {

	public static void getAllPossibleCombinationsOf_2and3_DigitOnly(int array[], int index, String s, int digits) {
		if (index >= array.length) {
			if (2 <= digits && digits <= 3) {
				System.out.println(s);
				return;
			}

			return;
		}

		if(digits<4)
		getAllPossibleCombinationsOf_2and3_DigitOnly(array, index + 1, s + array[index], digits + 1);
		getAllPossibleCombinationsOf_2and3_DigitOnly(array, index + 1, s, digits);

	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };
		getAllPossibleCombinationsOf_2and3_DigitOnly(array, 0, "", 0);
	}


}
