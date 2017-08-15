package Recursion;

import java.io.*;
import java.util.*;

public class ThePowerSum {

	public static int getNumberOfWays(int sum, int pow, int numbers, int check) {
		if (sum == 0)
			return 1;
		if (sum < 0)
			return 0;

		// System.out.println(Math.pow(check,1.0/pow)+" "+numbers);
		if (numbers > Math.ceil(Math.pow(check, 1.0 / pow)))
			return 0;

		int a = 0, b = 0;
		int power = (int) Math.pow(numbers, pow);

		a = getNumberOfWays(sum - power, pow, numbers + 1, check);
		b = getNumberOfWays(sum, pow, numbers + 1, check);

		return a + b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter Sum : ");
		int sum = sc.nextInt();
		// System.out.println("Enter power : ");
		int pow = sc.nextInt();
		System.out.println(getNumberOfWays(sum, pow, 1, sum));
	}
}
