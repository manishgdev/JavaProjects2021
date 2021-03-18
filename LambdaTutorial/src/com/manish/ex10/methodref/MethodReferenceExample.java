package com.manish.ex10.methodref;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Thread t = new Thread(() -> printMessage()); // Thread takes instance of Runnable method, Compiler will automatically interpret the expression
													 // as instance of Runnable
		
		t.start();
		
		System.out.println("\nMethod Reference");
		t = new Thread(MethodReferenceExample::printMessage); // MethodReferenceExample::printMessage is equivalent to ()->printMessage();
		t.start();
	}
	
	public static void printMessage() {
		System.out.println("Print Simple Message");
	}
}
