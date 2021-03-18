package com.manish.test;

import java.util.HashMap;

public class HashCodeTest {
	public static void main(String[] args) {
		SimpleCar sc1 = new SimpleCar("Maruti", 2018);
		SimpleCar sc2 = new SimpleCar("Maruti", 2018);
		SimpleCar sc3 = new SimpleCar("Renault", 2018);
		SimpleCar sc4 = new SimpleCar("Maruti", 2020);
		
		System.out.println(sc1.equals(sc2));
		System.out.println(sc1.equals(sc3));
		System.out.println(sc1.equals(sc4));
		
		HashMap<SimpleCar, String> simpleCarOwnerMap = new HashMap<>();
		simpleCarOwnerMap.put(sc1, "Manish");
		simpleCarOwnerMap.put(sc2, "Ashish");
		simpleCarOwnerMap.put(sc3, "Ravi");
		simpleCarOwnerMap.put(sc4, "Raj");
		
		System.out.println(simpleCarOwnerMap);
		System.out.println("\n");
		Car c1 = new Car("Maruti", 2018);
		Car c2 = new Car("Maruti", 2018);
		Car c3 = new Car("Renault", 2018);
		Car c4 = new Car("Maruti", 2020);
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1.equals(c4));
		
		HashMap<Car, String> carOwnerMap = new HashMap<>();
		carOwnerMap.put(c1, "Manish");
		carOwnerMap.put(c2, "Ashish");
		carOwnerMap.put(c3, "Ravi");
		carOwnerMap.put(c4, "Raj");
		
		System.out.println(carOwnerMap);
	}
}
