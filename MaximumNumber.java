package com.brigelabz.maximum;

public class MaximumNumber<E extends Comparable<E>> {
	private E a, b,c;
	
	public MaximumNumber(E a, E b, E c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public E testMax() {
		return MaximumNumber.testMax(a, b, c);
	}

	// determine largest three comparable objects
	public static <E extends Comparable<E>> E testMax(E a, E b, E c) {

		E max = a; // assume a is initially largest

		if (b.compareTo(max) > 0) {
			max = b; // b is largest so far
		}
		if (c.compareTo(max) > 0) {
			max = c; // c is largest so far
		}

		return max; // return largest element

	}

	public static void main(String[] args) {
		System.out.println("Welcome to maximum string program !");
		MaximumNumber<Integer> maximumNumber = new MaximumNumber<>(-10, -20, -30);
		MaximumNumber<Float> maximumNumber1 = new MaximumNumber<>(10.5f, 15.2f, 5.2f);
		MaximumNumber<String> maximumNumber2 = new MaximumNumber<>("apple", "banana", "peach");
		System.out.println("\nMaximum integer among three integer : "+maximumNumber.testMax());
		System.out.println("Maximum float among three float : "+maximumNumber1.testMax());
		System.out.println("Maximum string among three float : "+maximumNumber2.testMax());

	}
}
