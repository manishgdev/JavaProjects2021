package com.manish.test;

public class Pen implements Comparable<Pen> {
	private String brand;
	private int price;

	public Pen(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pen [" + brand + " @ " + price + "]";
	}

	@Override
	public int compareTo(Pen o) {
		return ((Integer) this.price).compareTo((Integer) o.price);
	}
}
