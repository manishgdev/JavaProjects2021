package com.manish.ex2.lambda_as_interface;

public class LambdaType {
	public static void main(String[] args) {
		Greeting greetingFn = () -> System.out.println("Hello World");
		greetingFn.greet();
		
		DoubleNum doubleNumFn = (int a) -> a * 2;
		System.out.println(doubleNumFn.doubleNum(4));
		
		AddInterface addFn = (int a, int b) -> a + b;
		System.out.println(addFn.add(5, 6));
	}
}

interface Greeting {
	void greet();
}

interface DoubleNum {
	int doubleNum(int a);
}

interface AddInterface {
	int add(int a, int b);
}
