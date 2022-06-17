package com.brigelabz.maximum;

public class MaximumNumber {

	private static String testMax(String x, String y, String z ) {
		String a = x;
		String b = y;
		String c = z;
		String max = a;
		
		if(b.compareTo(max)>0) {
			max = b; 
		}
		if(c.compareTo(max)>0) {
			max = c; 
		}
		return max;

	}

	public static void main(String[] args) {
		String result = MaximumNumber.testMax("apple", "peach","banana");
		System.out.println("Maximum number is : " + result);

	}

}
