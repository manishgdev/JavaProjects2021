package com.manish.ex8.closures;

public class SimpleClosure {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		doProcess(a, new SimpleProcess() {
			
			@Override
			public void process(int i) {
//				b = 50;   // cannot be done as b is effectively considered to be final
				/*
				 * In below statement even though we haven't declared b as final, java 8 will consider it to be final and will not complain
				 * The moment we try to change the value of b, compiler will give warning as "Local variable b defined in an enclosing scope must be final or effectively final"
				 */
				System.out.println("After Processing Values :- "+ (i + b));
			}
		});
	}
	
	public static void doProcess(int i, SimpleProcess p) {
		p.process(i);
	}
	
	interface SimpleProcess {
		void process(int i);
	}
}
