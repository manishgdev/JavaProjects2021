package com.manish.test;

public class Car {
	private String brand;
	private int year;

	public Car(String brand, int year) {
		this.brand = brand;
		this.year = year;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Simple Car [brand = " + brand + ", year = " + year + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Car))
			return false;
		Car carObj = (Car) obj;
		if (this.brand.equals(carObj.getBrand()) && this.year == carObj.getYear())
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		String words = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		int brandScore = 0;
		char charArr[] = this.brand.toCharArray();

		for (char ch : charArr) {
			int idx = words.indexOf(ch + "") + 1;
			brandScore += idx;
		}
		return brandScore + year;
	}
}
