package Recursion;

public class AllPossibleCombinations {

	public static void getAllPossibleCombinations(int array[], int index, String s) {
		if (index >= array.length) {
			System.out.println(s);
			return;
		}

		getAllPossibleCombinations(array, index + 1, s + array[index]);
		getAllPossibleCombinations(array, index + 1, s);

	}

	public static void main(String[] args) {
		int array [] = {1,2,3,4,5};
		getAllPossibleCombinations(array,0,"");
	}

}
