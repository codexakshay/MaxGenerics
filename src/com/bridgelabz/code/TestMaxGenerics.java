package com.bridgelabz.code;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMaxGenerics {

	static MaxGenerics maxGen;

	@BeforeClass
	public static void maxGenericsObject() {
		maxGen = new MaxGenerics();
		System.out.println("Before");
	}

	@Test
	public void TestMaxOnFirstPosition_Happy() {
		int result = MaxGenerics.maxInt(123, 12, 1);
		Assert.assertEquals(123, result);
	}

	@Test
	public void TestMaxOnSecondPosition_Happy() {
		int result = MaxGenerics.maxInt(11, 22, 3);
		Assert.assertEquals(22, result);
	}

	@Test
	public void TestMaxOnThirdPosition_Happy() {
		int result = MaxGenerics.maxInt(1, 12, 123);
		Assert.assertEquals(123, result);
	}
}