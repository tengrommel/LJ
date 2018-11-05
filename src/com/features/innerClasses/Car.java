package com.features.innerClasses;

/*
The fully qualified name for the Car class is com.features.innerClasses.Car.Tire.
The Tire inner class has been declared public.
That is, its name can be used outside the Car class.
 */
public class Car {
	// A member variable for the Car class
	private final int year;
	// A member inner class named Tire
	public class Tire {
		// A member variable for the Tire class
		private final double radius;
		// A constructor for the Tire class
		public Tire(double radius) {
			this.radius = radius;
		}
		// A member method for the Tire class
		public double getRadius() {
			return radius;
		}
	}
	// A constructor for the Car class
	public Car(int year) {
		this.year = year;
	}
	// A member method for the Car class
	public int getYear() {
		return year;
	}
}
