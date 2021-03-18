package com.manish.numbers;

public class NumberFunctions {
	public int reverseNum(int num) {
		int tempNum = num;

		int revNum = 0;

		while (tempNum != 0) {
			revNum = revNum * 10 + tempNum % 10;
			tempNum = tempNum / 10;
		}

		return revNum;
	}

	public int countDigits(int num) {
		int digits = 1;
		if (num == 0 || (num > 0 && num < 10))
			return 1;
		while ((num = num / 10) != 0)
			digits++;

		return digits;
	}

	public int sumDigits(int num) {
		int tempNum = num;

		int sum = 0;

		while (tempNum != 0) {
			sum += tempNum % 10;
			tempNum = tempNum / 10;
		}

		return sum;
	}

	public void oddEvenDigits(int num) {
		int tempNum = num;
		int even = 0;
		int odd = 0;

		while (tempNum != 0) {
			int modNum = tempNum % 10;
			if (modNum % 2 == 0)
				even++;
			else
				odd++;
			tempNum = tempNum / 10;
		}

		System.out.println("For Number = " + num + ", Number of odd digits = " + odd + " & even digits = " + even);
	}
}
