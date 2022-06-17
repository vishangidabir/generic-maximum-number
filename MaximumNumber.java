package com.brigelabz.maximum;

public class MaximumNumber {

	private static Integer testMax(Integer x, Integer y, Integer z ) {
		Integer a = x;
		Integer b = y;
		Integer c = z;
		Integer max = a;
		
		if(b.compareTo(max)>0) {
			max = b; 
		}
		if(c.compareTo(max)>0) {
			max = c; 
		}
		return max;

	}

	public static void main(String[] args) {
		int result = MaximumNumber.testMax(-10, -20, -30);
		System.out.println("Maximum number is :" + result);

	}

}
