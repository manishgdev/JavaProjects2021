package com.manish.ex10.methodref;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.manish.common.Person;

public class MethodRefParameter {
	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(
				new Person("Akshay", "Singh", 31), 
				new Person("Pratish", "Singh", 28),
				new Person("Satish", "Singh", 10),
				new Person("Ashish", "Singh", 12),
				new Person("Sachin", "Singh", 25));

		System.out.println("Printing all persons");
		printWithCondition(personList, p -> true, p -> System.out.println(p));
		
		System.out.println("\nPrinting all persons using Method Reference");
		printWithCondition(personList, p -> true, System.out::println);

	}

	private static void printWithCondition(List<Person> personList, Predicate<Person> conditionTest,
			Consumer<Person> consumer) {
		for (Person person : personList) {
			if (conditionTest.test(person))
				consumer.accept(person);
		}

	}

}
