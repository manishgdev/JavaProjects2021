package com.manish.ex7.exception_handling;

import java.util.function.BiConsumer;

public class ExceptionHandlingEx {
	public static void main(String[] args) {
		int numArr[] = { 2, 5, 3, 6, 8 };
		int key = 4;
		System.out.println("Simple Java Way");
		process(numArr, key);

		System.out.println("\nUsing Wrapper Lambda");
		processBiConsumer(numArr, key, wrapperLambda((i, j) -> System.out.println(i + j)));

		System.out.println("\nHandle Arithmatic Exception");
		key = 0;
		processBiConsumer(numArr, key, wrapperLambda((i, j) -> System.out.println(i / j)));

	}

	private static void process(int[] numArr, int key) {
		for (int num : numArr)
			System.out.println(num + key);
	}

	private static void processBiConsumer(int[] numArr, int key, BiConsumer<Integer, Integer> consumer) {
		for (int num : numArr)
			consumer.accept(num, key);
	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (i, j) -> {
			try {
				consumer.accept(i, j);
			} catch (Exception e) {
				System.out.println("Exception occurred in Lamdba");
			}
		};
	}
}
