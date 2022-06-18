package com.brigelabz.maximum;

public class MaximumNumber {
	//UC1 : Given 3 integer find maximum number
	private static Integer testMax(Integer x, Integer y, Integer z) {
		Integer a = x;
		Integer b = y;
		Integer c = z;
		Integer max = a;

		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		return max;

	}
	//UC2 : Given 3 float find maximum number
	private static Float testMax1(Float x, Float y, Float z) {
		Float a = x;
		Float b = y;
		Float c = z;
		Float max = a;

		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		return max;

	}
	public static void main(String[] args) {
		System.out.println("Welcome to maximum string program !");
		Integer result = MaximumNumber.testMax(-10,-20, -30);
		Float result1 = MaximumNumber.testMax1(10.5f, 12.2f, 5.5f);
		System.out.println("\nMaximum integer among three integer is : " + result);
		System.out.println("Maximum float among three float is : " + result1);
	}

}
