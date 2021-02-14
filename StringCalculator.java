package accessments;

import java.util.Scanner;

public class StringCalculator {

	public int Add(String numbers) {

		if (numbers.contains(",")) {

			String[] strArr = numbers.split(",");
			return (typeCast(strArr[0]) + typeCast(strArr[1]));
		} else if (!(numbers.contains(","))) {

			return typeCast(numbers);
		} else if (("").equalsIgnoreCase(numbers)) {

			return 0;
		}
		return 0;
	}

	public int typeCast(String numbers) {

		if (("").equalsIgnoreCase(numbers)) {

			return 0;
		} else {

			return Integer.parseInt(numbers);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringCalculator stringCalculator = new StringCalculator();
		System.out.println(stringCalculator.Add(str));
	}

}
