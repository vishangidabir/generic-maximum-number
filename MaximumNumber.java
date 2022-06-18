package com.brigelabz.maximum;

import java.util.Arrays;

public class MaximumNumber<E> {

	public E testMax(E... a) {

		// Using array method & Sorting the all numbers to find maximum there is no
		// limit
		Arrays.sort(a);
		E max = a[a.length - 1];
		printMax(max);
		return max;
	}

	private void printMax(E max) {
		System.out.println(max);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to maximum string program !");
		
		MaximumNumber<Integer> integerMaximum = new MaximumNumber<>();
		integerMaximum.testMax(-10, -20, -30, 50, 20);
		
		MaximumNumber<Float> floatMaximum = new MaximumNumber<>();
		floatMaximum.testMax(10.5f, 15.2f, 5.2f, 2.3f, 4.5f);
		
		MaximumNumber<String> stringMaximum = new MaximumNumber<>();
		stringMaximum.testMax("apple", "banana", "mango", "Custardapple", "coconut");

	}
}
