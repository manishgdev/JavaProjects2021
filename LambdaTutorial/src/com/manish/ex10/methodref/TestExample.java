package com.manish.ex10.methodref;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class TestExample {
	public static void main(String[] args) {
		System.out.println("Normal Lambda Expression");
		Thread t = new Thread(() -> noArg());
		t.start();

		System.out.println("\nNo Parameter Method Reference");
		t = new Thread(TestExample::noArg);
		t.start();

		System.out.println("\nOne Parameter Lambda Expression");
		Consumer<String> te = p -> oneParam(p);
		te.accept("ABC");
		
		System.out.println("\nOne Parameter Method Reference");
		te = TestExample::oneParam;
		te.accept("ABC");
		
		System.out.println("\nTwo Parameter Lambda Expression");
		BiConsumer<String, String> bc = (x, y) -> twoParam(x, y);
		bc.accept("Manish", "Singh");
		
		System.out.println("\nTwo Parameter Lambda Expression");
		bc = TestExample::twoParam;
		bc.accept("Manish", "Singh");
	}

	public static void noArg() {
		System.out.println("No Argument method");
	}

	public static void oneParam(String s) {
		System.out.println("val = " + s);
	}

	public static void twoParam(String a, String b) {
		System.out.println("a = " + a + ", b = " + b);
	}
}
