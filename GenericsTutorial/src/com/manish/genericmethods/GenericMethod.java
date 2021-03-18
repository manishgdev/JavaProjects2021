package com.manish.genericmethods;

public class GenericMethod {
	public static void main(String[] args) {
		Integer intArr[] = { 1, 2, 4, 5, 6, 7 };
		Character charArr[] = {'M', 'a', 'n', 'i', 's', 'h'};
		
		printMe(intArr);
		printMe(charArr);
	}
	
	public static <T> void printMe(T[] xArr) {
		for(T x : xArr)
			System.out.printf("%s ", x);
		System.out.println();
	}
}
