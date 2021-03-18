package com.manish.numbers;

import java.util.Scanner;

public class NumberTests {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");

		int num = sc.nextInt();
		sc.close();

		NumberFunctions nf = new NumberFunctions();
		System.out.println("Reverse of " + num + " is " + nf.reverseNum(num));
		System.out.println("Number of digits in " + num + " is " + nf.countDigits(num));
		System.out.println("Sum of digits for " + num + " is " + nf.sumDigits(num));
		nf.oddEvenDigits(num);
	}
}
