package com.bridgelabz.code;

public class MaxGenerics {

	public int compare(Integer objectA, Integer objectB) {
		return objectA.compareTo(objectB);
	}

	public int compare(Float objectA, Float objectB) {
		return objectA.compareTo(objectB);
	}

	public int compare(String objectA, String objectB) {
		return objectA.compareTo(objectB);
	}

	public static <T extends Comparable<T>> T max(T a, T b, T c) {
		T max = a;

		if (b.compareTo(a) > 0)
			max = b;
		if (c.compareTo(b) > 0)
			max = c;
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Max Integer : " + max(123, 1234, 12345));
		System.out.println("Max Float : " + max(123.0f, 1234.0f, 12345.0f));
		System.out.println("Max String : " + max("ABC", "DEF", "GHI"));
	}
}