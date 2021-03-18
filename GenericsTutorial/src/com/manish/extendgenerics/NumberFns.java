package com.manish.extendgenerics;

public class NumberFns<T extends Number> {
	T num;
	
	public NumberFns(T num) {
		this.num = num;
	}

	T getNum() {
		return num;
	}
	
	int printSquare() {
		return num.intValue() * num.intValue();
	}
	
	boolean absEquals(NumberFns<T> ob) {  // boolean absEquals(NumberFns<T> ob) {
		if(Math.abs(this.num.doubleValue()) == Math.abs(ob.num.doubleValue()))
			return true;
		return false;
	}
}
