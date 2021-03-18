package com.manish.dualgenerics;

public class MyClass<T, V> {
	T t;
	V v;

	public MyClass(T t, V v) {
		this.t = t;
		this.v = v;
	}

	public void showType() {
		System.out.println("Type 1 :- " + t.getClass().getName());
		System.out.println("Type 2 :- " + v.getClass().getName());
	}
}
