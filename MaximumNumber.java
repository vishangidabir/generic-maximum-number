package com.brigelabz.maximum;

public class MaximumNumber {

	private static Double testMax(Double x, Double y, Double z) {
		Double a = x;
		Double b = y;
		Double c = z;
		Double max = a;

		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		return max;

	}

	public static void main(String[] args) {
		Double result = MaximumNumber.testMax(50.10, 10.25, 35.50);
		System.out.println("Maximum number is : " + result);

	}

}
