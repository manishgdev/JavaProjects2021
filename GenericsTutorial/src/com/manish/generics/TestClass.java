package com.manish.generics;

public class TestClass {
	public static void main(String[] args) {
		MyClass<Integer> i = new MyClass<Integer>(50);
		i.printStuff();
		
		MyClass<String> s = new MyClass<String>("Manish");
		s.printStuff();
	}
}
