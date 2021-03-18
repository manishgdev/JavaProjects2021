package com.manish.ex1.behavior_as_argument;

public class GreeterOOP {
	
	private void greet() {
		System.out.println("Hello World");
	}
	
	private void greet(Greeting greeting) { // accepting behavior as an argument
		greeting.perform();
	}
	
	public static void main(String[] args) {
		GreeterOOP greeter = new GreeterOOP();
		greeter.greet();

		// Passing behavior as an argument
		HelloWorldGreeter hWorld = new HelloWorldGreeter();
		// here we are passing an object that has a behavior as an argument to greet method
		greeter.greet(hWorld);  
	}
}
