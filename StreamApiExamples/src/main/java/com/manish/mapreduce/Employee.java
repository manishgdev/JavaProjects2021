package com.manish.mapreduce;

public class Employee {
	private String name;
	private String grade;
	private int salary;
	
	public Employee(String name, String grade, int salary) {
		this.name = name;
		this.grade = grade;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
