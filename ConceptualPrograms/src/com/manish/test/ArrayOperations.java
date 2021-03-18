package com.manish.test;

import java.util.Arrays;

public class ArrayOperations {
	public static void main(String[] args) {
		
		System.out.println("Arrays.fill test");
		String arr1[] = new String[5];
		Arrays.fill(arr1, "abc");
		printArray(arr1);
		Arrays.fill(arr1, 2, 4, "def");
		System.out.println("After Index based Arrays.fill to same array");
		printArray(arr1);
		
		System.out.println("\nJava 8 style Arrays.setAll");
		Integer arr2[] = new Integer[6];
		Arrays.setAll(arr2, i -> i+1);  // for every index, increment the value and set at position
		printArray(arr2);
		
	}
	
	public static <T> void printArray(T tArr[]) {
		for(T t : tArr)
			System.out.print(t + "\t");
		System.out.println();
	}
}
