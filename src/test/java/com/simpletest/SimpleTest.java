package com.simpletest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {
	@Test
	public void testAddition() {
		int a = 3;
		int b = 2;
		Assert.assertEquals(a+b, 5,"sum  should be 5");;
	}
	@Test
	public void testSubtraction() {
		int a = 10;
		int b = 4;
		Assert.assertEquals(a-b, 6, "Difference should be 6");
	}

}
