package com.manish.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
	public static void main(String[] args) {
		List<Pen> penList = new ArrayList<>();

		penList.add(new Pen("Parker", 250));
		penList.add(new Pen("Rotomac", 20));
		penList.add(new Pen("Reynolds", 10));
		penList.add(new Pen("Luxor", 50));

		System.out.println("Before Sort :- " + penList);
		Collections.sort(penList); // this won't work unless Pen extends comparable interface
		System.out.println("After Sort :- " + penList);
	}
}
