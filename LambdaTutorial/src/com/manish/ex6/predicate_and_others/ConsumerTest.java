package com.manish.ex6.predicate_and_others;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.manish.common.Person;

public class ConsumerTest {
	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(
					new Person("Akshay", "Singh", 31),
					new Person("Pratish", "Singh", 28),
					new Person("Satish", "Singh", 10),
					new Person("Ashish", "Singh", 12),
					new Person("Sachin", "Singh", 25)
				);
		
		System.out.println("\nPerson List Before Sorting");
		printWithCondition(personList, p -> true, p -> System.out.println(p));
		
		System.out.println("\nPerson List After Sorting");
		printWithCondition(personList, p -> true, p -> System.out.println(p));
		
		System.out.println("\nPrint Persons with first name begining with s using java.util.function Predicate & Consumer interface");
		printWithCondition(personList, p -> p.getLastName().startsWith("S"), p -> System.out.println(p));
		
		System.out.println("\nPrint Persons based on Condition using java.util.function Predicate & Consumer interface");
		printWithCondition(personList, p -> p.getAge() > 15, p -> System.out.println(p));
	}

	private static void printWithCondition(List<Person> personList, Predicate<Person> conditionTest, Consumer<Person> consumer) {
		for(Person person : personList) {
			if(conditionTest.test(person))
				consumer.accept(person);
		}
		
	}

}
