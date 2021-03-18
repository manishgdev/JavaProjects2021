package com.manish.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEachAndIterator {
	public static void main(String[] args) {
		List<String> testList = new ArrayList<String>(Arrays.asList("Apple", "Banana", "Cherry", "Date Fruit", "Elderberries", "Figs", "Grapes", "Honeydew Melon"));
		
		System.out.println("Using for each");
		for(String test : testList) {
			System.out.print(test + ", ");
			
			// Below statements will give Exception in thread "main" java.util.ConcurrentModificationException
			/*if(test.equals("Cherry"))
				testList.remove("Cherry");*/
		}
		System.out.println();
		
		System.out.println("\nUsing Iterator");
		Iterator<String> itr = testList.iterator();
		while(itr.hasNext()) {
			String fruit = itr.next();
			System.out.print(fruit + ", ");
			if(fruit.equals("Cherry"))
				itr.remove();
		}
		System.out.println();
		System.out.println("\nDifferent form of Iterator");
		for(Iterator<String> itr2 = testList.iterator(); itr2.hasNext();) {
			System.out.print(itr2.next() + ", ");
		}
		System.out.println();
		// Below statement will throw Exception in thread "main" java.util.NoSuchElementException
//		itr.next();
	}
}
