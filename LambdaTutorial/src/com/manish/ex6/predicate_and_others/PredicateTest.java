package com.manish.ex6.predicate_and_others;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import com.manish.common.Person;

public class PredicateTest {
	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(
					new Person("Akshay", "Singh", 31),
					new Person("Pratish", "Singh", 28),
					new Person("Satish", "Singh", 10),
					new Person("Ashish", "Singh", 12),
					new Person("Sachin", "Singh", 25)
				);
		
		System.out.println("\nPerson List Before Sorting");
		
		printAll(personList);
		Collections.sort(personList, (p1, p2) -> ((Integer)p1.getAge()).compareTo((Integer)p2.getAge()));
		
		System.out.println("\nPerson List After Sorting");
		
		printWithCondition(personList, p -> true);
		
		System.out.println("\nPrint Persons with first name begining with s using java.util.function.Predicate interface");
		printWithCondition(personList, p -> p.getLastName().startsWith("S"));
		
		System.out.println("\nPrint Persons based on Condition using java.util.function.Predicate interface");
		printWithCondition(personList, p -> p.getAge() > 15);
	}

	private static void printWithCondition(List<Person> personList, Predicate<Person> conditionTest) {
		for(Person person : personList) {
			if(conditionTest.test(person))
				System.out.println(person);
		}
		
	}

	private static void printAll(List<Person> personList) {
		for(Person person : personList) {
			System.out.println(person);
		}
	}
}
