package com.brigelabz.maximum;

import java.util.Arrays;

public class MaximumNumber {

	public static <E> E testMax(E... a) {

		// Using array method & Sorting the all numbers to find maximum there is no limit

		Arrays.sort(a);
		return a[a.length - 1];
	}

	public static void main(String[] args) {
		System.out.println("Welcome to maximum string program !");
		System.out.println("\nMaximum integer among three integer : " + testMax(-10, -20, -30, 5, 50, 48));
		System.out.println("Maximum float among three float : " + testMax(10.5f, 15.2f, 5.2f, 2.3f, 4.5f));
		System.out.println("Maximum string among three float : " + testMax("apple", "banana", "peach", "Custardapple", "coconut"));
	}
}
