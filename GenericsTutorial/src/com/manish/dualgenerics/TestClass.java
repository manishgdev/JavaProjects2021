package com.manish.dualgenerics;

public class TestClass {
	public static void main(String[] args) {
		MyClass<Integer, String> m = new MyClass<Integer, String>(50, "Manish");
		m.showType();
	}
}	
