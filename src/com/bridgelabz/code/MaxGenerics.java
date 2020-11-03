package com.bridgelabz.code;

public class MaxGenerics<T extends Comparable<T>> {

	T a;
	T b;
	T c;

	public MaxGenerics(T a, T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public <T extends Comparable<T>> T TestMax() {
		T max = (T) a;
		if (b.compareTo(a) > 0) {
			max = (T) b;
		}
		if (c.compareTo(b) > 0) {
			max = (T) c;
		}
		return max;
	}

	public static void main(String[] args) {
	}
}