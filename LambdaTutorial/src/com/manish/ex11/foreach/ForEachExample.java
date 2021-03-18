package com.manish.ex11.foreach;

import java.util.Arrays;
import java.util.List;

import com.manish.common.Person;

public class ForEachExample {
	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(
				new Person("Akshay", "Singh", 31), 
				new Person("Pratish", "Singh", 28),
				new Person("Satish", "Singh", 10),
				new Person("Ashish", "Singh", 12),
				new Person("Sachin", "Singh", 25));
		
		System.out.println("Using Simple For loop");
		for(int i = 0; i < personList.size(); i++) 
			System.out.println(personList.get(i));
		
		System.out.println("\nUsing Enhance for loop");
		for(Person person : personList)
			System.out.println(person);
		
		System.out.println("\nUsing forEach");
		personList.forEach(p -> System.out.println(p));
		
		System.out.println("\nUsing forEach & Method reference");
		personList.forEach(System.out::println);
	}
}
