package com.bridgelabz.code;

public class MaxGenerics {

	public int compare(Integer objectA, Integer objectB) {
		return objectA.compareTo(objectB);
	}

	public static int maxInt(Integer a, Integer b, Integer c) {
		int max = a;

		if (b.compareTo(a) > 0)
			max = b;
		if (c.compareTo(b) > 0)
			max = c;
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Max Integer : " + maxInt(123, 1234, 12345));
	}
}