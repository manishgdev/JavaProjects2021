package com.manish.ex12.streams;

import java.util.Arrays;
import java.util.List;

import com.manish.common.Person;

public class Example1 {
	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(
				new Person("Akshay", "Singh", 31), 
				new Person("Pratish", "Singh", 28),
				new Person("Satish", "Singh", 10),
				new Person("Ashish", "Singh", 12),
				new Person("Sachin", "Singh", 25));
		
		// for persons with first name starting with S increment the age by 2
		personList.stream().filter(p -> p.getFirstName().startsWith("S")).map(p -> {
			int age = p.getAge() + 2;
			p.setAge(age);
			return p;
		}).forEach(p -> System.out.println(p));
		
		
	}
}
