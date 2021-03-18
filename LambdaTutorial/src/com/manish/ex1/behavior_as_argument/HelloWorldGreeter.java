package com.manish.ex1.behavior_as_argument;

public class HelloWorldGreeter implements Greeting {
	@Override
	public void perform() {
		System.out.println("Hello World!!!, I am being executed as a behavior");
	}
}
