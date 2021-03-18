package com.manish.generics;

public class MyClass<T> {
	T i;
	
	public MyClass(T i) {
		this.i = i;
	}
	
	public void printStuff() {
		System.out.println(i);
	}
}
