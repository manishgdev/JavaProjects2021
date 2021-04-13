package com.manish.mapreduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeMapReduce {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>(Arrays.asList(new Employee("Peter", "B", 50000),
																	  new Employee("Bob", "A", 20000),
																	  new Employee("Steve", "A", 6000),
																	  new Employee("Daniel", "C", 20000),
																	  new Employee("Bert", "C", 80000),
																	  new Employee("Chrish", "B", 8000),
																	  new Employee("Jeniffer", "A", 9000)));
		
		// Sum of Salaries for all the employees where grade is A
		int sum = empList.stream().filter(e -> e.getGrade().equals("A")).mapToInt(e-> e.getSalary()).sum();
		System.out.println("Total Sum when grade is A :- " + sum);
		// Sum of Salaries for all the employees where grade is A & Salary greater than 7000
		int customReduceSum = empList.stream().filter(e -> e.getGrade().equals("A") && e.getSalary() > 7000).mapToInt(e-> e.getSalary()).reduce((e1, e2) -> e1 + e2).getAsInt();
		System.out.println("Sum when Salary > 7000 & grade is A :- " + customReduceSum);
		
	}
}
