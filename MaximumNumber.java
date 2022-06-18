package com.brigelabz.maximum;

public class MaximumNumber {
	// UC4 : Refactor all the 3 to in one method
	private static <E extends Comparable> E testMax(E a, E b, E c) {

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
		Integer result = MaximumNumber.testMax(-10, -20, -30);
		Float result1 = MaximumNumber.testMax(10.5f, 12.2f, 5.5f);
		String result2 = MaximumNumber.testMax("apple", "banana","peach");
		System.out.println("\nMaximum integer among three integer is : " + result);
		System.out.println("Maximum float among three float is : " + result1);
		System.out.println("Maximum string among three float is : " + result2);
	}
	}


