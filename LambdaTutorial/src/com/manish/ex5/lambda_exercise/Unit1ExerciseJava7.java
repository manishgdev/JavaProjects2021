package com.manish.ex5.lambda_exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.manish.common.Person;

public class Unit1ExerciseJava7 {
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
		Collections.sort(personList, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return ((Integer)o1.getAge()).compareTo((Integer)o2.getAge());
			}
		});
		System.out.println("\nPerson List After Sorting");
		
		printAll(personList);
		
		System.out.println("\nPrint Persons with first name begining with s");
		printStartingWithChar(personList, "S");
		
		System.out.println("\nPrint Persons based on Condition");
		printForCondition(personList, new ConditionTest() {
			
			@Override
			public boolean test(Person p) {
				return p.getAge() > 15;
			}
		});
	}

	private static void printForCondition(List<Person> personList, ConditionTest conditionTest) {
		for(Person person : personList) {
			if(conditionTest.test(person))
				System.out.println(person);
		}
		
	}
	
	private static void printStartingWithChar(List<Person> personList, String firstChar) {
		for(Person person : personList) {
			if(person.getFirstName().startsWith(firstChar))
				System.out.println(person);
		}		
	}

	private static void printAll(List<Person> personList) {
		for(Person person : personList) {
			System.out.println(person);
		}
	}
	
	interface ConditionTest {
		boolean test(Person p);
	}
}
