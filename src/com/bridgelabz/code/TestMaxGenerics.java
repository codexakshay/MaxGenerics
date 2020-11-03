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
	public void TestMaxOnFirstPositionInt_Happy() {
		int result = MaxGenerics.max(123, 12, 1);
		Assert.assertEquals(123, result);
	}

	@Test
	public void TestMaxOnSecondPositionInt_Happy() {
		int result = MaxGenerics.max(11, 22, 3);
		Assert.assertEquals(22, result);
	}

	@Test
	public void TestMaxOnThirdPositionInt_Happy() {
		int result = MaxGenerics.max(1, 12, 123);
		Assert.assertEquals(123, result);
	}

	@Test
	public void TestMaxOnFirstPositionFloat_Happy() {
		float result = MaxGenerics.max(123.0f, 12.0f, 1.0f);
		Assert.assertEquals(123.0f, result);
	}

	@Test
	public void TestMaxOnSecondPositionFloat_Happy() {
		float result = MaxGenerics.max(11.0f, 22.0f, 3.0f);
		Assert.assertEquals(22.0f, result);
	}

	@Test
	public void TestMaxOnThirdPositionFloat_Happy() {
		float result = MaxGenerics.max(1.0f, 12.0f, 123.0f);
		Assert.assertEquals(123.0f, result);
	}

	@Test
	public void TestMaxOnFirstPositionString_Happy() {
		String result = MaxGenerics.max("GHI", "DEF", "ABC");
		Assert.assertEquals("GHI", result);
	}

	@Test
	public void TestMaxOnSecondPositionString_Happy() {
		String result = MaxGenerics.max("DEF", "GHI", "ABC");
		Assert.assertEquals("GHI", result);
	}

	@Test
	public void TestMaxOnThirdPositionString_Happy() {
		String result = MaxGenerics.max("ABC", "DEF", "GHI");
		Assert.assertEquals("GHI", result);
	}
}