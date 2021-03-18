package com.manish.genericmethods;

public class NormalOverloadingWay {
	public static void main(String[] args) {
		Integer intArr[] = { 1, 2, 4, 5, 6, 7 };
		Character charArr[] = {'M', 'a', 'n', 'i', 's', 'h'};
		
		printMe(intArr);
		printMe(charArr);
		
	}
	
	public static void printMe(Integer intArr[]) {
		for(Integer i : intArr)
			System.out.printf("%s ", i);
		System.out.println();
	}
	
	public static void printMe(Character charArr[]) {
		for(Character i : charArr)
			System.out.printf("%s ", i);
		System.out.println();
	}
}
