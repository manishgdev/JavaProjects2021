package com.manish.ex9.thisref;

public class ThisRefExample {

	public void doProcess(int i, SimpleProcess p) {
		p.process(i);
	}

	public void execute() {
		doProcess(5, p -> {
			System.out.println("Processing inside Lambda Expression val = " + p);
			System.out.println(this); // this refers to instance of the object having execute method
		});
	}

	public static void main(String[] args) {
		ThisRefExample tr = new ThisRefExample();
		System.out.println("Exeucte from static main method using Anonymous Inner Class");
		tr.doProcess(20, new SimpleProcess() {

			@Override
			public void process(int i) {
				System.out.println("Processing inside Anonymous Inner class val = " + i);
				System.out.println(this);
			}

			@Override
			public String toString() {
				return "This is reference of Anonymous inner class";
			}
		});

		System.out.println("\nExeucte from static main method using Lambda Expression");
		tr.doProcess(5, p -> {
			System.out.println("Processing inside Lambda Expression val = " + p);
//			System.out.println(this); // this can't be used here
		});
		
		System.out.println("\nExeucte from instance method using Lambda Expression");
		tr.execute();
	}

	interface SimpleProcess {
		void process(int i);
	}

	@Override
	public String toString() {
		return "This is 'ThisRefExample' class";
	}
}
