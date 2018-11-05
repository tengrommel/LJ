package com.features.innerClasses.execute;

import com.features.innerClasses.Car;

public class execute {
	public static void main(String[] args) {
		Car car = new Car(1984);
		Car.Tire t = car.new Tire(1.23);
		System.out.println(car.getYear());
		System.out.println(t.getRadius());
	}
}
