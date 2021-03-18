package com.manish.ex5.lambda_exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.manish.common.Person;

public class Unit1ExerciseLambda {
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
		
		printAll(personList);
		
		System.out.println("\nPrint Persons with first name begining with s");
		ConditionTest charCondition = p -> p.getLastName().startsWith("S");
		printWithCondition(personList, charCondition);
		
		System.out.println("\nPrint Persons based on Condition");
		ConditionTest ageCondition = p -> p.getAge() > 15;
		printWithCondition(personList, ageCondition);
		
	}

	private static void printWithCondition(List<Person> personList, ConditionTest conditionTest) {
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
	
	interface ConditionTest {
		boolean test(Person p);
	}
}
