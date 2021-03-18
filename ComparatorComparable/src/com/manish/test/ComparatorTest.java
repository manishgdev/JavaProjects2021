package com.manish.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
	public static void main(String[] args) {
		List<SimplePen> penList = new ArrayList<>();

		penList.add(new SimplePen("Parker", 250));
		penList.add(new SimplePen("Rotomac", 20));
		penList.add(new SimplePen("Reynolds", 10));
		penList.add(new SimplePen("Luxor", 50));

		System.out.println("Before Sort :- " + penList);
		Collections.sort(penList, new Comparator<SimplePen>() {

			@Override
			public int compare(SimplePen o1, SimplePen o2) {
				if(o1.getPrice() > o2.getPrice())
					return 1;
				else if(o1.getPrice() < o2.getPrice())
					return -1;
				else
					return 0;
			}
		});
		System.out.println("After Sort :- " + penList);
		
		
	}
}
