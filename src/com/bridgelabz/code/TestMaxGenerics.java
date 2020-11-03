package com.bridgelabz.code;

import org.junit.Assert;
import org.junit.Test;

public class TestMaxGenerics {

	@Test
	public void TestMaxOnFirstPositionInt_Happy() {
		MaxGenerics<Integer> MaxGen = new MaxGenerics<Integer>(3, 2, 1);
		Integer result = MaxGen.TestMax();
		System.out.println(result);
		Assert.assertEquals(Integer.valueOf(3), result);
	}

	@Test
	public void TestMaxOnSecondPositionInt_Happy() {
		MaxGenerics<Integer> MaxGen = new MaxGenerics<Integer>(2, 3, 1);
		Integer result = MaxGen.TestMax();
		System.out.println(result);
		Assert.assertEquals(Integer.valueOf(3), result);
	}

	@Test
	public void TestMaxOnThirdPositionInt_Happy() {
		MaxGenerics<Integer> MaxGen = new MaxGenerics<Integer>(1, 2, 3);
		Integer result = MaxGen.TestMax();
		System.out.println(result);
		Assert.assertEquals(Integer.valueOf(3), result);
	}

	@Test
	public void TestMaxOnFirstPositionFloat_Happy() {
		MaxGenerics<Float> MaxGen = new MaxGenerics<Float>(3.0f, 2.0f, 1.0f);
		Float result = MaxGen.TestMax();
		System.out.println(result);
		Assert.assertEquals(Float.valueOf(3.0f), result);
	}

	@Test
	public void TestMaxOnSecondPositionFloat_Happy() {
		MaxGenerics<Float> MaxGen = new MaxGenerics<Float>(2.0f, 3.0f, 1.0f);
		Float result = MaxGen.TestMax();
		System.out.println(result);
		Assert.assertEquals(Float.valueOf(3.0f), result);
	}

	@Test
	public void TestMaxOnThirdPositionFloat_Happy() {
		MaxGenerics<Float> MaxGen = new MaxGenerics<Float>(2.0f, 1.0f, 3.0f);
		Float result = MaxGen.TestMax();
		System.out.println(result);
		Assert.assertEquals(Float.valueOf(3.0f), result);
	}

	@Test
	public void TestMaxOnFirstPositionString_Happy() {
		MaxGenerics<String> MaxGen = new MaxGenerics<String>("GHI", "DEF", "ABC");
		String result = MaxGen.TestMax();
		System.out.println(result);
		Assert.assertEquals(String.valueOf("GHI"), result);
	}

	@Test
	public void TestMaxOnSecondPositionString_Happy() {
		MaxGenerics<String> MaxGen = new MaxGenerics<String>("DEF", "GHI", "ABC");
		String result = MaxGen.TestMax();
		System.out.println(result);
		Assert.assertEquals(String.valueOf("GHI"), result);
	}

	@Test
	public void TestMaxOnThirdPositionString_Happy() {
		MaxGenerics<String> MaxGen = new MaxGenerics<String>("ABC", "DEF", "GHI");
		String result = MaxGen.TestMax();
		System.out.println(result);
		Assert.assertEquals(String.valueOf("GHI"), result);
	}
}