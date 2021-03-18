package com.manish.ex4.runnable_lambda;

public class RunnableExample {
	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Running from inside of Runnable anonymous inner class");
			}
		});
		myThread.run();
		
		Thread lambdaThread = new Thread(() -> System.out.println("Running from inside of lambda expression"));
		lambdaThread.run();
	}
}
