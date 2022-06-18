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
		private static Float testMax(Float x, Float y, Float z) {
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
		//UC3 : Given 3 string find maximum number
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
		System.out.println("Welcome to maximum string program !");
		Integer result = MaximumNumber.testMax(-10, -20, -30);
		Float result1 = MaximumNumber.testMax(10.5f, 12.2f, 5.5f);
		String result2 = MaximumNumber.testMax("apple", "banana","peach");
		System.out.println("\nMaximum integer among three integer is : " + result);
		System.out.println("Maximum float among three float is : " + result1);
		System.out.println("Maximum string among three float is : " + result2);
	}
	}


