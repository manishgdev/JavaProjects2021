package com.manish.extendgenerics;

public class TestClass {
	public static void main(String[] args) {
		NumberFns<Integer> i = new NumberFns<Integer>(50);
		NumberFns<Integer> d = new NumberFns<Integer>(-50);
		System.out.println("Square of " + i.getNum() + " is " + i.printSquare());

		System.out.println("Absolute of " + i.getNum() + " & " + d.getNum() + " are equal :- " + i.absEquals(d));
	}
}
