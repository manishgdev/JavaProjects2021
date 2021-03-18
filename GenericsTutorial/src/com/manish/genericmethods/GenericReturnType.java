package com.manish.genericmethods;

public class GenericReturnType {
	public static void main(String[] args) {
		System.out.println("Maximum of [4, 7, 3] :- " + max(4, 7, 3));

		System.out.println("Maximum of [Bat, Ball, Car] :- " + max("Bat", "Ball", "Car"));
	}

	public static <T extends Comparable<T>> T max(T a, T b, T c) {
		T max = a;

		if (b.compareTo(a) > 0)
			max = b;

		if (c.compareTo(max) > 0)
			max = c;

		return max;
	}
}
