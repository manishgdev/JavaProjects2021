package com.manish.test;

public class SimpleCar {
	private String brand;
	private int year;

	public SimpleCar(String brand, int year) {
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
		if(!(obj instanceof SimpleCar))
			return false;
		SimpleCar carObj = (SimpleCar)obj;
		if(this.brand.equals(carObj.getBrand()) && this.year == carObj.getYear())
			return true;
		return false;
	}
}
