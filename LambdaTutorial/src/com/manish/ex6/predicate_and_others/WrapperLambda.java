package com.manish.ex6.predicate_and_others;

import java.util.function.BiConsumer;

public class WrapperLambda {
	public static void main(String[] args) {
		int numArr[] = {2, 5, 3, 6, 8};
		int key = 4;
		System.out.println("Simple Java Way");
		process(numArr, key);
		
		System.out.println("\nUsing Biconsumer");
		processBiConsumer(numArr, key, (i, j) -> System.out.println(i + j));
		
		System.out.println("\nUsing Wrapper Lambda"); // Wrapper Lambda will overwrite the functionality of Lambda passed to it
		processBiConsumer(numArr, key, wrapperLambda((i, j) -> System.out.println(i + j))); // It was supposed to do addition but instead it performed multiplication
		
	}
	
	private static void process(int[] numArr, int key) {
		for(int num : numArr)
			System.out.println(num + key);
	}
	
	private static void processBiConsumer(int[] numArr, int key, BiConsumer<Integer, Integer> consumer) {
		for(int num : numArr)
			consumer.accept(num, key);
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (i, j) -> System.out.println(i * j);
	}
}
